package Animal;

public class Main {
    public static void main(String[] args) {

        Animal weasel = new Animal();
        Animal rackoon = new Animal();
        Animal sealion = new Animal();
        Animal armadillo = new Animal();

        weasel.play();
        System.out.println(weasel.hungerValue);




    }
}
//    Create an Animal.Animal class
//Every animal has a hunger value, which is a whole number
//                Every animal has a thirst value, which is a whole number
//                when creating a new animal object these values are created with the default 50 value
//        Every animal can eat() which decreases their hunger by one
//        Every animal can drink() which decreases their thirst by one
//        Every animal can play() which increases both by one