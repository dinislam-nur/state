package ru.iteco.state;

public class CopyrightContext {

    private State state;
    private Integer value;
    private Source source;
    private Document document;

    public CopyrightContext() {
        this.state = new InitState(this);
    }

    public void put(Integer value) {
        state.put(value);
    }

    public void chooseSource(Source source) {
        state.chooseSource(source);
    }

    public void document(Document document) {
        state.document(document);
    }

    public void print() {
        state.print();
    }

    public Integer get() {
        return state.get();
    }

    public Integer getValue() {
        return value;
    }

    public Document getDocument() {
        return document;
    }

    public State getState() {
        return state;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
