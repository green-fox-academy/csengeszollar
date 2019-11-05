import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        int sideSize = 40;
        int padding = 20;

        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(padding,padding,padding + sideSize, padding);

        graphics.setColor(Color.ORANGE);
        graphics.drawLine(padding, padding, padding, padding + sideSize);

        graphics.setColor(Color.BLUE);
        graphics.drawLine(padding, padding + sideSize, padding + sideSize, padding + sideSize);

        graphics.setColor(new Color(0, 66, 37));
        graphics.drawLine(padding + sideSize, padding, padding + sideSize, padding + sideSize);



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
