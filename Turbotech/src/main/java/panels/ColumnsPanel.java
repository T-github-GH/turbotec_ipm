package panels;

import javax.swing.*;
import java.awt.*;

public class ColumnsPanel extends JPanel {
    ColumnR resultPanel;
    JPanel txtPanel;

    public ColumnsPanel(int rects, Color color, String title) {
        resultPanel = new ColumnR(rects, color);
        txtPanel = new JPanel();
        JLabel label = new JLabel(title);
        //txtPanel.add(label);
        txtPanel.setSize(20,200);
        txtPanel.setMinimumSize(new Dimension(20,100));
        txtPanel.setMaximumSize(new Dimension(20,100));
        label.setFont(new Font(Font.SERIF, Font.ITALIC, 24));
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        add(resultPanel);
        add(txtPanel);


    }

    public void setRects(int rects) {
        resultPanel.setRects(rects);
    }

    public void setR(int r) {
        resultPanel.setR(r);
    }

    public void start () {
        resultPanel.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
