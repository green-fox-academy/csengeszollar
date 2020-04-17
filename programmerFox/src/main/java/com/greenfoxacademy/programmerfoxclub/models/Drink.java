package com.greenfoxacademy.programmerfoxclub.models;

import java.util.Arrays;
import java.util.List;

public enum Drink {
    BLOOD("blood"),
    WATER("water"),
    COVFEFE("covfefe"),
    HELL("hell");

        public final String name;

        private Drink(String name){
            this.name = name;
        }

        public static List<Drink> drinkList(){
            return Arrays.asList(values());
        }

        @Override
        public String toString() {
            return name;
        }
    }