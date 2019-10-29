public class GreeterFunction {
    public static void main(String[] args) {
        String al = "Green Fox";
        System.out.println(greetFunction(al));
    }

    public static String greetFunction (String al) {
        String greeting = "Greetings dear, " + al + "!";
        return greeting;
    }
}
