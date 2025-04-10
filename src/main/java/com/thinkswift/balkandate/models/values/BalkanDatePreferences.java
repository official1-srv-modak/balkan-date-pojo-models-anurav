package com.thinkswift.balkandate.models.values;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public enum BalkanDatePreferences {

    WANT_CHILDREN("want children"),
    DONT_WANT_CHILDREN("dont want children"),
    WANT_TO_RELOCATE("want to relocate"),
    DONT_WANT_TO_RELOCATE("dont want to relocate");

    private final String value;

    BalkanDatePreferences(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static String keyName() {
        return "Preferences";
    }

    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }

    public static List<String> getAllValues() {
        return Arrays.stream(BalkanDateNationality.values())
                .map(BalkanDateNationality::getValue)
                .collect(Collectors.toList());
    }

}
