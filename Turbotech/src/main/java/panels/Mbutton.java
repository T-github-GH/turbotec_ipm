package panels;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mbutton extends Button {
    private int number ;
    Dimension dimension;
    public Mbutton(String lable, final int number){
        setLabel("  " + lable + "  ");
        this.number = number;
        dimension = new Dimension(1900,150);

        setMinimumSize(dimension);
        setMaximumSize(dimension);
        setFont(new Font(Font.SERIF, Font.BOLD, 28));

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
