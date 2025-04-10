package com.thinkswift.balkandate.models.values;

import java.util.Collections;
import java.util.List;

public enum BalkanDateSpecChildren {
    HAVE_CHILDREN(1),
    DONT_HAVE_CHILDREN(0);

    private final Integer value;

    BalkanDateSpecChildren(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    public static String keyName() {
        return "Have Children";
    }
    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }
}
