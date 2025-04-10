package com.thinkswift.balkandate.models.values;

import java.util.Collections;
import java.util.List;

public enum BalkanDateSpecGender {
    MALE("MALE"),
    FEMALE("FEMALE");

    private final String value;

    BalkanDateSpecGender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public static String keyName() {
        return "Gender";
    }
    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }
}
