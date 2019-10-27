public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        // make the "a" variable's value bigger by 10

        System.out.println(a);

        int b = 100;
        b -=7;
        // make b smaller by 7

        System.out.println(b);

        int c = 44;
        c *= 2;
        // please double c's value

        System.out.println(c);

        int d = 125;
        d /= 5;
        // please divide by 5 d's value

        System.out.println(d);

        int e = 8;

        // please cube of e's value
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean bigger;

        if (f1 > f2)
            bigger = true;
        else
            bigger = false;
        System.out.println("f1 = " + f1 + ", f2 = " + f2 + ", f1 > f2 is " + bigger);

        int g1 = 350;
        int g2 = 200;
        int g2Double = g2 * 2;
        // tell if the double of g2 is bigger than g1 (print as a boolean)

//        if ( g2Double > g1)
//            bigger = true;
//         else
//             bigger = false;
        System.out.println("g1 = " + g1 + ", g2 = " + g2 + ", double of g2 = " + g2Double + ", so the double of g2 > g1 is " + (g2Double > g1));

        int h = 135798745;
        boolean isDivisor11 = h % 11 == 0;
        System.out.println("Is 11 a divisor of the number?: " + (isDivisor11));

        // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;

        boolean i1IsHigher = i1 > Math.pow(i2,2) && i1 < Math.pow(i2,3);

        System.out.println("i1 is higher than i2 squared and smaller than i2 cubed?: " + (i1IsHigher));
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;
        boolean isDivisor3 = j % 3 == 0 || j % 5 == 0;

        System.out.println("j is dividable by 3 or 5?: " + (isDivisor3));
        // tell if j is dividable by 3 or 5 (print as a boolean)
    }
}