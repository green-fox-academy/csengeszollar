import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawCircle {
    public static void mainDraw(Graphics graphics) {
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        int circleSize = 600;
        graphics.drawOval(WIDTH / 2 - circleSize / 2, HEIGHT / 2 - circleSize / 2, circleSize, circleSize);
        graphics.drawOval(WIDTH / 2 - circleSize / 2 + WIDTH / 4, HEIGHT / 2 - circleSize / 2, circleSize / 2 , circleSize / 2 );
        graphics.drawOval(WIDTH / 2 - circleSize / 2 + 3 * WIDTH / 8, HEIGHT / 2 - circleSize / 2, circleSize / 4 , circleSize / 4 );
        graphics.drawOval(WIDTH / 2 - circleSize / 2 + 7 * WIDTH / 16, HEIGHT / 2 - circleSize / 2, circleSize / 8 , circleSize / 8 );
        graphics.drawOval(WIDTH / 2 - circleSize / 2 + 15 * WIDTH / 32, HEIGHT / 2 - circleSize / 2, circleSize / 16 , circleSize / 16 );

        //graphics.drawOval(WIDTH / 2 - circleSize / 2, HEIGHT / 2 - circleSize / 2 + 3 * HEIGHT / 4, circleSize/2, circleSize/2);

    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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