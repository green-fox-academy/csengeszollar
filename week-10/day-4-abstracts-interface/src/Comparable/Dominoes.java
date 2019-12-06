package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(5, 7));
        dominoes.add(new Domino(5, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);
        System.out.println(dominoes);
    }
}
