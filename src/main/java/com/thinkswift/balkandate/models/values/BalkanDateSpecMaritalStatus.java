package com.thinkswift.balkandate.models.values;

import java.util.Collections;
import java.util.List;

public enum BalkanDateSpecMaritalStatus {
    NEVER_MARRIED(1),
    SEPARATED(2),
    DIVORCED(3),
    WIDOWED(4);

    private final Integer value;

    BalkanDateSpecMaritalStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    public static String keyName() {
        return "Marital Status";
    }
    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }
}
