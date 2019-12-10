package Printable;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Domino first = new Domino(3, 2);
        List<Domino> dominoes = new ArrayList<Domino>();
        dominoes.add(first);

        Todo task = new Todo("Buy milk", "high", true);
        List<Todo> todos = new ArrayList<Todo>();
        todos.add(task);

        for (Domino d : dominoes) {
            d.printAllFields();
        }

        for (Todo t : todos) {
            t.printAllFields();
        }

    }
}
