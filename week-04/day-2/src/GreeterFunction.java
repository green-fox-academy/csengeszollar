public class GreeterFunction {
    public static void main(String[] args) {
        String al = "Green Fox";
        System.out.println(greetFunction(al));
    }

    public static String greetFunction (String input) {
        String greeting = "Greetings dear, " + input + "!";
        return greeting;
    }
}
