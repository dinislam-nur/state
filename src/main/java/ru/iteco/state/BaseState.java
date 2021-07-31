package ru.iteco.state;

public abstract class BaseState implements State {

    protected final CopyrightContext context;

    protected BaseState(CopyrightContext context) {
        this.context = context;
    }

    @Override
    public void put(Integer value) {
        System.out.println("Внесено " + value + " рублей");
        context.setValue(value);
    }

    @Override
    public void document(Document document) {
        throw new StateException("Ошибка: не выбран источник");
    }

    @Override
    public void print() {
        throw new StateException("Ошибка: не выбран документ для печати");
    }

    @Override
    public Integer get() {
        context.setState(new InitState(context));
        Integer value = context.getValue();
        if (value < 1) {
            System.out.println("Все денежные средства потрачены");
        }
        context.setValue(0);
        return value;
    }
}
