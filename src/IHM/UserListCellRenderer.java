package IHM;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class UserListCellRenderer extends DefaultTableCellRenderer {

    /** Creates a new instance of UserListCellRenderer */
    public UserListCellRenderer() {
        super();
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
        if (table.getSelectedRow() == row) {
            component.setForeground(table.getSelectionForeground());
            component.setBackground(table.getSelectionBackground());
        }
        else if (table.getValueAt(row, 1).equals("ONLINE")) {
            component.setForeground(Color.BLACK);
            component.setBackground(Color.GREEN);
        }
        else if (table.getValueAt(row, 1).equals("OFFLINE")) {
            component.setForeground(Color.RED);
            component.setBackground(Color.LIGHT_GRAY);
        }
        return component;
    }

}