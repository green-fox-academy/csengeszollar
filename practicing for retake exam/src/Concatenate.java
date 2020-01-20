public class Concatenate {
    public static void main(String[] args) {

//    Írj egy functiont, ami ha kap két
//    szöveget, visszadja a betűnként összefésült új szöveget.
//    Pl: alma, traktor » atlrmaaktor

        String a = "alma";
        String b = "traktor";

        System.out.println(mergingTwoStrings(a, b));

    }

    public static String mergingTwoStrings(String a, String b) {
        StringBuilder mergedString = new StringBuilder();
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (i < a.length()) {
                mergedString.append(a.charAt(i));
            }
            if (i < b.length()) {
                mergedString.append(b.charAt(i));
            }
        }
        return mergedString.toString();
    }
}

