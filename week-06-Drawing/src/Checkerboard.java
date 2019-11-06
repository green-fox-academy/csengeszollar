import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int y = 0;
        int rectSize = 40;

       /* graphics.fillRect(0, 0, rectSize, rectSize);
        graphics.fillRect(20, 0, rectSize, rectSize);
        graphics.fillRect(40,0,rectSize, rectSize); */



       // graphics.fillRect(10, 10, rectSize, rectSize);
       // graphics.fillRect(30, 10, rectSize, rectSize);
        //graphics.fillRect(50, 10, rectSize, rectSize);
      // for (int j = 0; j < 4; j++) { // draws rectangles in a line
          // graphics.fillRect(j * (2 * rectSize) + rectSize, (y + rectSize), rectSize, rectSize);
      // }
        for (int j = 0; j < 4; j++) {

            for (int i = 0; i < 4; i++) {
                graphics.fillRect(i * (2 * rectSize) + rectSize, j * (2 * rectSize), rectSize, rectSize);
                graphics.fillRect(i * (2 * rectSize), j * (2 * rectSize) + rectSize, rectSize, rectSize);
            }
        }
// dupla for loop, mert az i-vel az x, a j-vel az y erteket tudom valtoztatni
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