package ru.iteco.state;

public class DocumentState extends BaseState {

    public DocumentState(CopyrightContext context) {
        super(context);
    }

    @Override
    public void chooseSource(Source source) {
        throw new StateException("Ошибка: источник уже выбран");
    }

    @Override
    public void document(Document document) {
        context.setDocument(document);
        System.out.println("Выбран документ");
        if (context.getState() != null && context.getState().getClass() != PrintState.class) {
            context.setState(new PrintState(context));
        }
    }
}
