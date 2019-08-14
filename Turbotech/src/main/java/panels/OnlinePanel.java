package panels;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class OnlinePanel extends JPanel {

    ColumnsPanel[] unsafes ;
    ColumnsPanel safe;
    private static boolean isOpen = false;

    public OnlinePanel() {
        setBackground(new Color(174, 193, 202));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel panel = new JPanel();
        BoxLayout resultLayout = new BoxLayout(panel, BoxLayout.X_AXIS);
        panel.setLayout(resultLayout);
        Dimension panelDimension = new Dimension(1500,30000);
        panel.setSize(panelDimension);


        safe = new ColumnsPanel(1, Color.GREEN, " H");
        unsafes = new ColumnsPanel[14];
        makeUnsafes(unsafes);



        panel.add(gap(30));
        panel.add(safe);
        addUnsafes(panel, unsafes);
        panel.add(gap(30));

        panel.setMaximumSize(panelDimension);


        add(new JPanel());
        add(panel);
        add(new JPanel());


    }

    private JPanel gap(int size) {
        JPanel p = new JPanel();
        p.setMaximumSize(new Dimension(size, size));
        return p;
    }
    private void makeUnsafes (ColumnsPanel[] panels) {
        int arz = 10;
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new ColumnsPanel(new Random().nextInt(10) + 1 , Color.RED, "P" + (i+1));
        }

    }
    private void addUnsafes(JPanel main , ColumnsPanel[] panels) {
        for (int i = 0; i < panels.length; i++) {
            main.add(gap(30));
            main.add(panels[i]);
        }
    }

    public void update() {
        safe.setR(10);
        for (int i = 0; i < unsafes.length; i++) {
//            p.setRects();
            unsafes[i].setR(1);
            unsafes[i].start();
        }
        safe.start();
    }
    public static void setOpen(boolean b) {
        isOpen = b;
    }
    public static boolean isOpen() {
        return isOpen;
    }
}
