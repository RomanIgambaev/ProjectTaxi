package org.example.entity.enums;

public enum СarСlasses {
    ECONOMY("Эконом"),
    COMFORT("Комфорт"),
    BUSINESS("Бизнес"),
    PREMIUM("Премиум");
    private final String displayName;
    СarСlasses(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
