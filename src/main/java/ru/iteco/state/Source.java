package ru.iteco.state;

public enum Source {
    USB("usb"),
    WIFI("wi-fi");

    private final String description;

    Source(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
