package SharpieSet;

//Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//                countUsable() -> sharpie is usable if it has ink in it
//        removeTrash() -> removes all unusable sharpies

public class Main {
    public static void main(String[] args) {
        Sharpie  blue = new Sharpie("blue");
        Sharpie red = new Sharpie("red");
        Sharpie magenta = new Sharpie("magenta");
        Sharpie ochre = new Sharpie("ochre");
        Sharpie khaki = new Sharpie("khaki");

        SharpieSet mySharpieset = new SharpieSet();

        mySharpieset.add(blue);
        mySharpieset.add(red);
        mySharpieset.add(magenta);
        mySharpieset.add(ochre);
        mySharpieset.add(khaki);

//        for (int i = 0; i < mySharpieset.listOfSharpies.size(); i++) {
//            System.out.println(mySharpieset.listOfSharpies.get(i).toString());
//        }

        for (int i = 0; i < 100 ; i++) {
            blue.use();
        }


        System.out.println("My sharpieset contains: " + mySharpieset.countUsable() + " element(s).");

        mySharpieset.removesToTrash();














    }
}
