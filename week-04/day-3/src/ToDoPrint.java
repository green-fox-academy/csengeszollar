public class ToDoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        String start = "My todo:\n";
        String middle = " - Download games\n";
        String end = "\t - Diablo";

        todoText = (start.concat(todoText.concat(middle).concat(end)));
        System.out.println(todoText);

    }
}
