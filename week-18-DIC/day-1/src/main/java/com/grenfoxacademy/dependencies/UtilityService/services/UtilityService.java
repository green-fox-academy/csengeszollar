package com.grenfoxacademy.dependencies.UtilityService.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {

    ArrayList<String> colors;
    Random random;
    private String fontColor;


    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    public String validateEmail(String email) {

        if (email.contains(".") && email.contains("@")){
            fontColor = "green";
            return email + " is a valid e-mail address";
        } else
            fontColor = "red";
            return email + " is an invalid e-mail, please give me another one!";
    }

    public String getFontColor() {
        return fontColor;
    }

    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }
}
