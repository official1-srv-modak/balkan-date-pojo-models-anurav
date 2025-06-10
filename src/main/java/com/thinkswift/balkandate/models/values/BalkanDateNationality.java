package com.thinkswift.balkandate.models.values;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public enum BalkanDateNationality {
    ALBANIAN("Albanian"),
    BOSNIAN("Bosnian"),
    BULGARIAN("Bulgarian"),
    CROATIAN("Croatian"),
    GREEK("Greek"),
    KOSOVAR("Kosovar"),
    MACEDONIAN("Macedonian"),
    MOLDOVAN("Moldovan"),
    MONTENEGRIN("Montenegrin"),
    ROMANIAN("Romanian"),
    SERBIAN("Serbian"),
    SLOVENIAN("Slovenian"),
    TURKISH("Turkish"),
    ALL("All");

    private final String value;

    BalkanDateNationality(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static String keyName() {
        return "Nationality preference";
    }

    public static List<String> getAllKeys() {
        return Collections.singletonList(keyName());
    }

    public static List<String> getAllNationalities() {
        return Arrays.stream(BalkanDateNationality.values())
                .map(BalkanDateNationality::getValue)
                .collect(Collectors.toList());
    }





    // this was a tetst comment from github dev from external keyboard
}
