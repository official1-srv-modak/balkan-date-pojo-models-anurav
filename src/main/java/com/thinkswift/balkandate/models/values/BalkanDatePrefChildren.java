package com.thinkswift.balkandate.models.values;

import java.util.Collections;
import java.util.List;

public enum BalkanDatePrefChildren {
    WANT(1),
    DONT(0),
    NOT_DECIDED(2);

    private final Integer value;

    BalkanDatePrefChildren(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    public static String keyName() {
        return "Children preference";
    }
    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }
}
