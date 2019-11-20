/*package IHM;

import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.List;

public class Color {

    private static final Color WHITE = "\u001B[37m";
    private static final Color YELLOW = "\u001B[33m";

    static class MyTableModel extends DefaultTableModel {

        List<Color> rowColours = Arrays.asList() {
                Color.WHITE,
                Color.YELLOW,
        }


        public void setRowColour(int row, Color c) {
            rowColours.set(row, c);
            fireTableRowsUpdated(row, row);
        }

        public Color getRowColour(int row) {
            return rowColours.get(row);
        }


        @Override
        public int getRowCount() {
            return 2;
        }

        @Override
        public Object getValueAt(int row, int column) {
            return String.format("%d %d", row, column);
        }
    }

}*/
