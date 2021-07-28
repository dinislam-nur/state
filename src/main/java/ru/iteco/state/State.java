package ru.iteco.state;

public interface State {

    void put(Integer value);

    void chooseSource(Source source);

    void document(Document document);

    void print();

    Integer get();

}
