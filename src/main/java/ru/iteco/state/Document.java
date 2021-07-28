package ru.iteco.state;

public class Document {
    private final String body;

    public Document(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Document{" +
                "body='" + body + '\'' +
                '}';
    }
}
