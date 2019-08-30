package panels;

import BackWork.OnlineData;
import res.MyColor;
import res.MySize;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.python.google.common.io.Resources.getResource;

public class MainPanel extends JFrame {
    private static JFileChooser fileChooser ;
    private static BorderLayout borderLayout ;
    private static BoxLayout boxLayout ;
    private static Receivepanel receivepanel ;
    static JPanel cardPanel ;
    static CardLayout cardLayout ;
    static OnlinePanel onlinePanel ;

    public MainPanel () {
        try {
            preProcess(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    private void preProcess(JFrame frame) throws IOException {

        borderLayout = new BorderLayout(10,10);

        receivepanel = new Receivepanel();

        cardPanel = new JPanel();
        onlinePanel = new OnlinePanel();
        OnlineData onlineData = new OnlineData(onlinePanel);


        cardLayout = new CardLayout();
        cardPanel.add(onlinePanel);
        cardPanel.add(receivepanel);
        cardPanel.setLayout(cardLayout);

        Mbutton b = new Mbutton("first", 1);
        Mbutton b1 = new Mbutton("Offline", 2);
        b1.setMaximumSize(MySize.btnMenuSize);
        Mbutton b2 = new Mbutton("Online", 1);
        b2.setMaximumSize(MySize.btnMenuSize);
        ImageIcon settingIcon = new ImageIcon("settingsicon64.png");
        ImageIcon helpIcon = new ImageIcon("helpicon64.png");
        JLabel imageSetting = new JLabel();
        JLabel imageHelp = new JLabel();
        imageSetting.setIcon(settingIcon);
        imageHelp.setIcon(helpIcon);

        JPanel menu = new JPanel();
        addGap(menu,620);
        menu.add(b1);
        addGap(menu,80);
        menu.add(b2);
        addGap(menu, 350);
        menu.add(imageHelp);
        addGap(menu, 10);
        menu.add(imageSetting);
        menu.setBackground(MyColor.btnMenu);

        boxLayout = new BoxLayout(menu, BoxLayout.X_AXIS);
        menu.setLayout(boxLayout);
        borderLayout.setVgap(0);
        setBackground(MyColor.panelBack);
        frame.setLayout(borderLayout);
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(menu, BorderLayout.NORTH);
        frame.setSize(MySize.mainFrameSize);
        frame.setLocation(700,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


    }

    private void addGap(JPanel menu, int width) {
        menu.add(Box.createRigidArea(new Dimension(width, 120)));
    }


}
