package com.thinkswift.balkandate.models.values;

import java.util.Collections;
import java.util.List;

public enum BalkanDatePrefRelocation {
    WANT(1),
    DONT(0),
    NOT_DECIDED(2);

    private final Integer value;

    BalkanDatePrefRelocation(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    public static String keyName() {
        return "Relocation preference";
    }

    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }
}
