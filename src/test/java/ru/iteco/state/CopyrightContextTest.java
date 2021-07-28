package ru.iteco.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.iteco.state.Source.*;

class CopyrightContextTest {

    @Test
    public void test() {
        final CopyrightContext context = new CopyrightContext();
        context.setValue(20);
        context.chooseSource(USB);
        context.document(new Document("document1"));
        context.print();
        context.document(new Document("document2"));
        context.print();
        System.out.println("Сдача: " + context.get());
        System.out.println("============================\n");

        executeException(context::get);

        final Document document = new Document("document3");
        executeException(() -> context.document(document));

        executeException(context::print);

        executeException(() -> {
            context.chooseSource(WIFI);
            context.print();
        });
    }

    private void executeException(Runnable runnable) {
        try {
            runnable.run();
        } catch (StateException ex) {
            handleError(ex);
        }
    }

    private void handleError(StateException ex) {
        System.out.println(ex.getMessage());
        System.out.println("============================\n");
    }

}