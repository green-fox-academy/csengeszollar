package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie  sharpieBlue = new Sharpie("blue",.5f);
        sharpieBlue.use();

        System.out.println("color: " + sharpieBlue.color + " ink: " + sharpieBlue.inkAmount + " width: " + sharpieBlue.width);
        for (int i = 1; i < 10 ; i++) {
            sharpieBlue.use();
        }
        System.out.println(sharpieBlue.inkAmount);

    }
}
//    Create Sharpie class
//We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//        When creating one, we need to specify the color and the width
//        Every sharpie is created with a default 100 as inkAmount
//        We can use() the sharpie objects
//        which decreases inkAmount