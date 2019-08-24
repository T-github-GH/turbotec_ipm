package panels;

import res.MyColor;
import res.MyFont;
import res.MySize;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Arrays;

public class SensorPanel extends JPanel {

    JTable table;
    JScrollPane scrollPane;

    Object[] currentRow = new Object[]{0,0,0,0,0,0,0,0};

    public SensorPanel() {
        setBackground(MyColor.panelBack);

        table = new JTable(new DefaultTableModel(new Object[]{"Sensor1", "Sensor2", "Sensor3", "Sensor4", "Sensor5", "Sensor6", "Sensor7", "Temp"} , 0));
        scrollPane = new JScrollPane(table);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(MyFont.sensorPanel);
        table.setTableHeader(tableHeader);
        table.setShowGrid(true);
        table.setGridColor(Color.YELLOW);
        table.setBackground(MyColor.onlineSensorRow);
        table.setFont(MyFont.sensorPanel);
        table.setRowHeight(80);


        setLayout(new BorderLayout());
        add(table.getTableHeader(), BorderLayout.PAGE_START);
        add(scrollPane, BorderLayout.CENTER);

        setSize(MySize.sensorPanelSize);
        setMaximumSize(MySize.sensorPanelSize);

    }

    public void addData(Object[] newRow) {
        if (!Arrays.equals(newRow, currentRow)) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.insertRow(0, newRow);
            currentRow = newRow;
        }
    }

}
