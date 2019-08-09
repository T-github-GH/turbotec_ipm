package panels;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
//import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
//import com.jtattoo.plaf.graphite.GraphiteLookAndFeel
//import com.jtattoo.plaf.hifi.HiFiLookAndFeel
//import com.jtattoo.plaf.mcwin.McWinLookAndFeel
//import com.jtattoo.plaf.mint.MintLookAndFeel
//import com.jtattoo.plaf.noire.NoireLookAndFeel
import com.jtattoo.plaf.texture.TextureLookAndFeel;

public class Mbutton extends JButton {
//    private Color press = new Color(0, 173, 181);
//    private Color defult = new Color(227, 227, 227);
//    private Color pressed = new Color(82, 86, 106);

    private final int number ;

    Dimension dimension;
    public Mbutton(String lable, final int number){
        super("  " + lable + "  ");
        this.number = number;
        dimension = new Dimension(500,100);

        setMaximumSize(dimension);
        setMinimumSize(dimension);
        setFont(new Font(Font.SERIF, Font.BOLD, 38));
//        setBackground(defult);

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainPanel.cardLayout.first(MainPanel.cardPanel);
                for (int i=1; i<number; i++)
                    MainPanel.cardLayout.next(MainPanel.cardPanel);

            }
        });

    }
}
