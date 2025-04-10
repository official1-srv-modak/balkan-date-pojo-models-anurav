package com.thinkswift.balkandate.models.values;

import java.util.Collections;
import java.util.List;

public enum BalkanDateSpecEducation {
    PHD(7),
    MASTERS(6),
    BACHELORS(5),
    UNDERGRADUATE(4),
    GRADUATE(3),
    POST_SECONDARY(2),
    HIGH_SCHOOL(1),
    TRADE_SCHOOL(0),
    NOT_SELECTED(-1);

    private final Integer value;

    BalkanDateSpecEducation(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    public static String keyName() {
        return "Education";
    }
    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }
}
