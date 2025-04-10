package com.thinkswift.balkandate.models.values;

import java.util.Collections;
import java.util.List;

public enum BalkanDateSpecNationality {
    ALBANIAN(1),
    BOSNIAN(2),
    BULGARIAN(3),
    CROATIAN(4),
    GREEK(5),
    KOSOVAR(6),
    MACEDONIAN(7),
    MOLDOVAN(8),
    MONTENEGRIN(9),
    ROMANIAN(10),
    SERBIAN(11),
    SLOVENIAN(12),
    TURKISH(13),
    ALL(14);

    private final Integer value;

    BalkanDateSpecNationality(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static String keyName() {
        return "Nationality";
    }
    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }
}
