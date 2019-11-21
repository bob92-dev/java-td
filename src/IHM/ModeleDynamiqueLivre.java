package IHM;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ModeleDynamiqueLivre extends AbstractTableModel {
    private final List<Livre> livres = new ArrayList<Livre>();

    private final String[] entetes = {"Nom", "Auteur", "Résumé", "colonne","rangée", "parution"};

    public ModeleDynamiqueLivre() {
        super();

        livres.add(new Livre("Harry potter", "Rowling", "blablabla", 3, 4, 2034));
        livres.add(new Livre("le petit Nicolas", "Sarkozy", "blablabla", 3, 4, 2019));

    }

    public int getRowCount() {
        return livres.size();
    }

    public int getColumnCount() {
        return entetes.length;
    }

    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return livres.get(rowIndex).getNom();
            case 1:
                return livres.get(rowIndex).getAuteur();
            case 2:
                return livres.get(rowIndex).getResume();
            case 3:
                return livres.get(rowIndex).getColonne();
            case 4:
                return livres.get(rowIndex).getRangee();
            case 5:
                return livres.get(rowIndex).getParution();
            default:
                return null; //Ne devrait jamais arriver
        }
    }

    public void addLivre(Livre livre) {
        livres.add(livre);

        fireTableRowsInserted(livres.size() -1, livres.size() -1);
    }

    public void removeLivre(int rowIndex) {
        livres.remove(rowIndex);

        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}