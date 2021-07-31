package ru.iteco.state;

public class PrintState extends DocumentState {

    public PrintState(CopyrightContext context) {
        super(context);
    }

    @Override
    public void print() {
        final int newValue = context.getValue() - 1;
        if (newValue < 0) {
            context.setState(new InitState(context));
            throw new StateException("Недостаточно средств для печати документа. Пополните счет\n" +
                    "Стоимость печати 1 рубль");
        } else {
            context.setValue(newValue);
            System.out.println("Распечатан документ:\n" + context.getDocument());
            context.setState(new DocumentState(context));
        }
    }
}
