package DeiteChapter3;


import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(width, height, 0, 0);// draw a line from upper-left to lower-right

        g.drawLine(0, height, width, 0);// draw a line from the lower-left to upper-right


        /**
         * Draws a line, using the current color, between the points
         * <code>(x1,&nbsp;y1)</code> and <code>(x2,&nbsp;y2)</code>
         * in this graphics context's coordinate system.
         * @param   x1  the first point's <i>x</i> coordinate.
         * @param   y1  the first point's <i>y</i> coordinate.
         * @param   x2  the second point's <i>x</i> coordinate.
         * @param   y2  the second point's <i>y</i> coordinate.
        
        public abstract void drawLine(int x1, int y1, int x2, int y2);
         */
        int loop = 1;
        int a = 10;
        while (loop < 15) {
            g.drawLine(0, height, width, 0);
            g.drawLine(0, width, 0, height);
            g.drawLine(0, 0, a, a);
            g.drawLine(0, 0, a, height);
            g.drawLine(width, a, 0, 0);

            a = a + 10;
            loop++;
        }
    }// end PaintComponent
}// end Draw Panel
