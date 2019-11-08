import javax.swing.*;

import java.awt.*;
import java.security.PublicKey;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Vasarely {
    public static void mainDraw(Graphics graphics) {


        graphics.setColor(new Color(135, 31, 120));
        graphics.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT / 2);


        graphics.drawLine(WIDTH /2, 0, WIDTH / 2, HEIGHT);

        for (int i = 0; i < 20; i++) {
                graphics.drawLine(WIDTH / 2, i * HEIGHT / 40, WIDTH / 2 + (i + 1) * WIDTH / 40, HEIGHT / 2);
            }

        for (int j = 0; j < 20; j++) {
           graphics.drawLine(WIDTH / 2, HEIGHT / 2 + (j + 1) * HEIGHT / 40, WIDTH / 2 + ((20 - j) * WIDTH / 40),HEIGHT / 2);
        }

        //graphics.drawLine(WIDTH, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + HEIGHT / 20);
        //graphics.drawLine(WIDTH / 2, HEIGHT / 2 + 1 * HEIGHT / 20, WIDTH / 2 + 10 * WIDTH / 20, HEIGHT / 2);
        //graphics.drawLine(WIDTH / 2, HEIGHT / 2 + 2 * HEIGHT / 20, WIDTH / 2 + 9 * WIDTH / 20, HEIGHT/2);
        //graphics.drawLine(WIDTH / 2, HEIGHT / 2 + 3 * HEIGHT / 20, WIDTH / 2 + 8 * WIDTH / 20, HEIGHT/2);

        //graphics.drawLine(WIDTH / 2, HEIGHT / 2 + 10 * HEIGHT / 20, 9 * WIDTH / 20, HEIGHT / 2);
        //graphics.drawLine(WIDTH / 2, HEIGHT / 2 + 9 * HEIGHT / 20, 8 * WIDTH / 20, HEIGHT / 2);

        for (int k = 20; k > 0; k--) {
            graphics.drawLine(WIDTH /2,HEIGHT / 2 + k * HEIGHT / 40,(k - 1) * WIDTH / 40, HEIGHT / 2);
        }

        for (int l = 0; l < 20; l++) {
            graphics.drawLine(l * WIDTH / 40, HEIGHT / 2, WIDTH / 2, (20 - l) * WIDTH / 40);
        }





        //graphics.drawLine(WIDTH / 2, 0, 11 * WIDTH / 20, HEIGHT / 2);
        //graphics.drawLine(WIDTH / 2, HEIGHT / 20,12 * WIDTH / 20, HEIGHT / 2);
        //graphics.drawLine(WIDTH / 2, HEIGHT / 20 * 2, 13 * WIDTH / 20, HEIGHT / 2);



        //int x = 0;
        //int y = 0;

        // drawALineFunction(x, y, gr);

        //for (int i = 0; i < 17 ; i++) {
           // graphics.drawLine(0, i * 20, WIDTH / 2, HEIGHT / 2);
           // graphics.drawLine(i * 20, 0, WIDTH / 2, HEIGHT / 2);
           // graphics.drawLine(WIDTH, i * 20, WIDTH / 2, HEIGHT / 2);
           // graphics.drawLine(i * 20, HEIGHT, WIDTH / 2, HEIGHT / 2);

       // }


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
