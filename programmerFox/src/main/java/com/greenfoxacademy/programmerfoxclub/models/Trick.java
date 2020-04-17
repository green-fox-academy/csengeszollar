package com.greenfoxacademy.programmerfoxclub.models;

import java.util.Arrays;
import java.util.List;

public enum Trick {
    WHISTLE("whistle"),
    HANDSTAND("handstand"),
    JAVA("program in java"),
    HTML("understanding HTML");

    public final String name;

    private Trick(String name) {
        this.name = name;
    }

    public static List<Trick> getTricks(){
        return Arrays.asList(values());
    }

    @Override
    public String toString() {
        return name;
    }
}
