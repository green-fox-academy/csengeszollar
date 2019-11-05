public class AppenAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        System.out.println(AppendAFunc(typo));
    }
    public static String AppendAFunc(String input) {
        String appended = input + "a";
        return appended;
    }
}
