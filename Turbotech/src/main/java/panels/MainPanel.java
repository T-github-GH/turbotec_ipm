package panels;

import com.jtattoo.plaf.JTattooUtilities;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {
    private static Dimension dimension ;
    private static JFileChooser fileChooser ;
    private static BorderLayout borderLayout ;
    private static BoxLayout boxLayout ;
    private static Receivepanel receivepanel ;
    static JPanel cardPanel ;
    static CardLayout cardLayout ;
    static OnlinePanel onlinePanel ;

    public MainPanel () {
        preProcess(this);

        setVisible(true);
    }

    private void preProcess(JFrame frame){
        dimension = new Dimension(2200, 1500);

        borderLayout = new BorderLayout(10,10);

        receivepanel = new Receivepanel();

        cardPanel = new JPanel();
        onlinePanel = new OnlinePanel();
        onlinePanel.setBackground(new Color(221, 145, 142));
        JPanel p3 = new JPanel();
        p3.setBackground(Color.YELLOW);
        JPanel p4 = new JPanel();
        p4.setBackground(Color.ORANGE);
        JPanel p5 = new JPanel();
        p5.setBackground(Color.GREEN);
        cardLayout = new CardLayout();
        cardPanel.add(receivepanel);
        cardPanel.add(onlinePanel);
        cardPanel.add(p3);
        cardPanel.add(p4);
        cardPanel.add(p5);
        cardPanel.setLayout(cardLayout);

        Mbutton b = new Mbutton("first", 1);
        Mbutton b1 = new Mbutton("first", 1);
        Mbutton b2 = new Mbutton("second", 2);
        Mbutton b3 = new Mbutton("third",3);
        Mbutton b4 = new Mbutton("fourth", 4);
        Mbutton b5 = new Mbutton("fifth", 5);

        JPanel menu = new JPanel();
        addGap(menu);
        menu.add(b1);
        addGap(menu);
        menu.add(b2);
        addGap(menu);
        menu.add(b3);
        addGap(menu);
        menu.add(b4);
        addGap(menu);
        menu.add(b5);
        boxLayout = new BoxLayout(menu, BoxLayout.Y_AXIS);
        menu.setLayout(boxLayout);

        frame.setLayout(borderLayout);
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(menu, BorderLayout.WEST);
        frame.setSize(dimension);
        frame.setLocation(700,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addGap(JPanel menu) {
        menu.add(Box.createRigidArea(new Dimension(50, 10)));
    }
}
