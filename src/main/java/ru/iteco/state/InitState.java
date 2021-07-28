package ru.iteco.state;

public class InitState extends BaseState{

    public InitState(CopyrightContext context) {
        super(context);
    }

    @Override
    public void chooseSource(Source source) {
        context.setSource(source);
        System.out.println("Выбран " + source.getDescription() + " источник");
        context.setState(new DocumentState(context));
    }

}
