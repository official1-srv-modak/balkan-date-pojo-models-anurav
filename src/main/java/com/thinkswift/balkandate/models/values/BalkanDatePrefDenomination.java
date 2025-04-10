package com.thinkswift.balkandate.models.values;

import java.util.Collections;
import java.util.List;

public enum BalkanDatePrefDenomination {
    CATHOLIC(1),
    MUSLIM(2),
    ORTHODOX(3),
    NON_DENOMINATION(4),
    ALL(5),
    PREFER_NOT_TO_IDENTIFY(6);

    private final Integer value;

    BalkanDatePrefDenomination(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    public static String keyName() {
        return "Denomination preference";
    }

    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }
}
