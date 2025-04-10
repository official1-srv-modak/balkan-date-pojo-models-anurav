package com.thinkswift.balkandate.models.values;

public enum BalkanDateRoles {
    SERVER_ADMIN("SERVER_ADMIN"),
    ADMIN("ADMIN"),
    USER("USER");

    private final String value;

    BalkanDateRoles(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
