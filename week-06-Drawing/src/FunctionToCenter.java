import javax.swing.*;

import java.awt.*;
import java.security.PublicKey;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x = 0;
        int y = 0;

        graphics.setColor(Color.BLUE);
        for (int i = 0; i < 17 ; i++) {
            drawALineToCenter (0, i * 20, graphics);
            drawALineToCenter (i * 20, 0, graphics);
            drawALineToCenter (WIDTH, i * 20, graphics);
            drawALineToCenter (i * 20, HEIGHT, graphics);
        }


        //for (int i = 0; i < 17; i++) {
          //  graphics.drawLine(0, i * 20, WIDTH / 2, HEIGHT / 2);
          //  graphics.drawLine(i * 20, 0, WIDTH / 2, HEIGHT / 2);
           // graphics.drawLine(WIDTH, i * 20, WIDTH / 2, HEIGHT / 2);
          //  graphics.drawLine(i * 20, HEIGHT, WIDTH / 2, HEIGHT / 2);
        //}


    }
    public static void drawALineToCenter (int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT /2 );
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
