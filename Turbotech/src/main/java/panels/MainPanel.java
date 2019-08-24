package panels;

import BackWork.OnlineData;
import res.MyColor;
import res.MySize;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {
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

        borderLayout = new BorderLayout(10,10);

        receivepanel = new Receivepanel();

        cardPanel = new JPanel();
        onlinePanel = new OnlinePanel();
        OnlineData onlineData = new OnlineData(onlinePanel);


        cardLayout = new CardLayout();
        cardPanel.add(receivepanel);
        cardPanel.add(onlinePanel);
        cardPanel.setLayout(cardLayout);

        Mbutton b = new Mbutton("first", 1);
        Mbutton b1 = new Mbutton("Offline", 1);
        Mbutton b2 = new Mbutton("Online", 2);

        JPanel menu = new JPanel();
        addGap(menu,650);
        menu.add(b1);
        addGap(menu,80);
        menu.add(b2);
        addGap(menu, 650);
        menu.setBackground(MyColor.btnMenu);

        boxLayout = new BoxLayout(menu, BoxLayout.X_AXIS);
        menu.setLayout(boxLayout);
        borderLayout.setVgap(0);
        frame.setBackground(MyColor.panelBack);
        frame.setLayout(borderLayout);
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(menu, BorderLayout.NORTH);
        frame.setSize(MySize.mainFrameSize);
        frame.setLocation(700,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


    }

    private void addGap(JPanel menu, int width) {
        menu.add(Box.createRigidArea(new Dimension(width, 80)));
    }
}
