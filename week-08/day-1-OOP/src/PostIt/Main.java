package PostIt;

import java.awt.*;

public class Main {
    public static void main(String[] args) {


//    public static void main(String[] args) {
//        Create a PostIt class that has
//                a backgroundColor
//                a text on it
//                a textColor
//                Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"
//    }

        PostIt postIt1 = new PostIt(Color.orange,"Idea 1", Color.blue);
        System.out.println(postIt1.textOnIt + postIt1.textColor + postIt1.backgroundColor);

        PostIt postIt2 = new PostIt(Color.pink, "Awesome", Color.black);
        System.out.println(postIt2.backgroundColor + postIt2.textOnIt + postIt2.textColor );

        PostIt postIt3 = new PostIt(Color.yellow,"Superb!", Color.green);
        System.out.println(postIt3.backgroundColor.toString() + postIt3.textColor + postIt3.textOnIt);

        //ha 2 colorral keydek, akkor nem nyomtatja ki, eloszor stringet kell neki megaadni

    }
}
