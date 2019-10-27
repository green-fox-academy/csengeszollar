public class Cuboid {
    public static void main(String[] args) {
        double a = 12;
        double b = 8;
        double c = 4;

        double Volume  = a * b * c;
        System.out.println("Volume = " + Volume);

        double Surface = (2 * a * b) + (2 * b * c) + (2 * a * c);
        System.out.println("Surface = " + Surface);

    }
}
