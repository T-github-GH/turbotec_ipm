package panels;

import javax.swing.*;
import java.awt.*;

public class ColumnR extends JPanel {
    private int rects ;
    private int height = 30;
    private int weight = 70;
    private int X = 10;
    private int Y = 400;
    private int gap = height + 10;
    private Color fillColor ;

    private int r = 1;
    public ColumnR(int rects, Color color) {
        setBackground(new Color(137, 160, 236));
        this.rects = rects;
        fillColor = color;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(fillColor);
        for (int i=0; i<rects; i++) {
            g.fillRect(X, Y, weight, height);
            Y = Y-gap;
            height = (height + 30) + gap;
        }
        Y=400;
    }

    public void setRects(int rects) {
        this.rects = rects;
    }

    public void start () {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (r>rects)
                        for (int i=rects; i<=r; i++) {
                            Thread.sleep(1000);
                            setRects(i);
                            if (OnlinePanel.isOpen())
                                repaint();
                        }
                    else
                        for (int j=rects; j>=r; j--){
                            Thread.sleep(1000);
                            setRects(j);
                            if (OnlinePanel.isOpen())
                                repaint();
                        }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }

    public void setR(int r) {
        this.r = r;
    }
}
