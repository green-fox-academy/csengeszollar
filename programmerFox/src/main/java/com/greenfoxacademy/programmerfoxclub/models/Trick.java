package com.greenfoxacademy.programmerfoxclub.models;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Trick {
    WHISTLE("whistle"),
    HANDSTAND("handstand"),
    JAVA("program in java"),
    HTML("understanding HTML");

    public final String name;

    private Trick(String name) {
        this.name = name;
    }

    public static List<String> getTricks(){
//         return Arrays.asList(values());
        List<String> trickList = Stream.of(Trick.values())
                .map(trick -> Objects.toString(trick, null))
                .collect(Collectors.toList());
        return trickList;
    }

    @Override
    public String toString() {
        return name;
    }
}
