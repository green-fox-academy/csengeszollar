package Comparable;

import java.util.Arrays;

public class Domino implements Comparable<Domino> {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino domino) {
            if (this.left < domino.left) {
                return -1;
            }
            if (this.left == domino.left) {
                if (this.right < domino.right) {
                    return -1;
                }
                if (this.right == domino.right) {
                    return 0;
                }else
                    return 1;
            }
            return 1;
    }
}