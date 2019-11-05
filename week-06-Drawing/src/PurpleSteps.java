import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
        int rectSize = 12;

        graphics.setColor(new Color(149, 33, 246));
        graphics.fillRect(12, 12, rectSize, rectSize);

        for (int i = 1; i < 20; i++) {
            graphics.fill3DRect(i * rectSize, i * rectSize, rectSize, rectSize, true);
        }






    }

   // public static void drawSquaresFunction (int x, int y, int rectSize, Graphics graphics) {
    //    graphics.fillRect(10, 10, rectSize, rectSize);
   // }

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
