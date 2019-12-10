package Printable;

import java.util.ArrayList;
import java.util.List;

public class Domino implements Printable {
    private int leftSide;
    private int rightSide;
    private List<Domino> dominoes;

    public Domino(int leftSide, int rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.dominoes = new ArrayList<Domino>();
    }

    public void addDomino(Domino domino) {
        this.dominoes.add(domino);
    }


    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + this.leftSide + ", B side: " + this.rightSide);
    }

    public int getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

}
