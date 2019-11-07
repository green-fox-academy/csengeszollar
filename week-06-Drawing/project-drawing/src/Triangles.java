import com.sun.deploy.util.BlackList;

import javax.swing.*;

import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {


        graphics.setColor(new Color((int)(Math.random()*(320 + 1)), (int)(Math.random()*(320 + 1)), (int)(Math.random()*(320 + 1))));
        graphics.drawLine(WIDTH / 2, 0, 0, HEIGHT);
        graphics.drawLine(WIDTH / 2, 0, WIDTH, HEIGHT);
        graphics.drawLine(0, HEIGHT, WIDTH, HEIGHT);



        //graphics.drawLine(WIDTH/32 * 15, HEIGHT/32 * 2, WIDTH/32 * 17, HEIGHT/32 * 2);
//        graphics.drawLine(WIDTH/32 * 14, HEIGHT/32 * 4, WIDTH/32 * 18, HEIGHT/32 * 4);
//        graphics.drawLine(WIDTH/32 * 13, HEIGHT/32 * 6, WIDTH/32 * 19, HEIGHT/32 * 6);

        for (int i = 1; i < 16; i++) {
            graphics.drawLine(WIDTH / 32 * (16 - i), HEIGHT / 32 * i * 2, WIDTH / 32 * (i + 16), HEIGHT / 32 * i * 2);
        }

       // graphics.drawLine(WIDTH / 32 * 15, HEIGHT/32 * 2, WIDTH/32 * 30, HEIGHT/32 * 32);
       // graphics.drawLine(WIDTH / 32 * 14, HEIGHT/32 * 4, WIDTH / 32 * 28, HEIGHT/32 * 32);

        for (int j = 1; j < 16 ; j++) {
            graphics.drawLine(WIDTH / 32 * (16 - j), HEIGHT/32 * j * 2, WIDTH/32 * (32 - 2 * j), HEIGHT/32 * 32);
        }

//        graphics.drawLine(WIDTH/32 * 17, HEIGHT/32 * 2,WIDTH/32 * 2, HEIGHT/32 * 32);
//        graphics.drawLine(WIDTH/32 * 18, HEIGHT/32 * 4,WIDTH/32 * 4, HEIGHT/32 * 32);
//        graphics.drawLine(WIDTH/32 * 19, HEIGHT/32 * 6,WIDTH/32 * 6, HEIGHT/32 * 32);

        for (int k = 1; k < 16 ; k++) {
            graphics.drawLine(WIDTH/32 * (k + 16), HEIGHT/32 * k * 2,WIDTH/32 * k * 2, HEIGHT/32 * 32);
        }


//        for (int i = 1; i < 32; i++) {
//
//            graphics.drawLine(WIDTH / 2 - i * WIDTH / 32, i * HEIGHT / 32, WIDTH / 2 + i * WIDTH / 32, i * HEIGHT / 2 );
//
//        }

       // double SideA = Math.sqrt((Math.pow(HEIGHT, 2)) + (Math.pow((WIDTH / 2), 2)));
       // double SideB = Math.sqrt((Math.pow(HEIGHT, 2)) + (Math.pow((WIDTH / 2), 2)));
        //graphics.setColor(Color.GREEN);

        //graphics.drawLine(WIDTH / 2 - WIDTH / 4, HEIGHT /2, WIDTH / 2 + WIDTH / 4, HEIGHT / 2);
//       graphics.setColor(Color.BLACK);
//        graphics.drawLine(WIDTH / 8 , HEIGHT /4 * 3, WIDTH / 8 * 7, HEIGHT / 4 * 3);
//        graphics.drawLine(WIDTH / 8 * 3 , HEIGHT /4, WIDTH / 8 * 5, HEIGHT / 4);
//        graphics.drawLine(WIDTH / 16 * 7, HEIGHT / 16 * 2, WIDTH / 16 * 9, HEIGHT / 16 * 2);
//        graphics.drawLine(WIDTH / 16 * 5, HEIGHT / 16 * 6, WIDTH / 16 * 11, HEIGHT / 16 * 6);
//        graphics.drawLine(WIDTH / 16 * 3, HEIGHT / 16 * 10, WIDTH / 16 * 13, HEIGHT / 16 * 10);
//        graphics.drawLine(WIDTH / 16 * 1, HEIGHT / 16 * 14, WIDTH / 16 * 15, HEIGHT / 16 * 14);
//        graphics.drawLine(WIDTH / 32 * 15, HEIGHT / 32 * 2, WIDTH / 32 * 17, HEIGHT / 32 * 2);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}