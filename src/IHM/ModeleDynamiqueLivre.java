package IHM;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ModeleDynamiqueLivre extends AbstractTableModel {
    private final List<Livre> livres = new ArrayList<Livre>();

    private final String[] entetes = {"Titre", "Auteur", "Présentation", "Parution","Colonne", "Rangée"};

    public ModeleDynamiqueLivre() {
        super();

        livres.add(new Livre("Harry potter", "Rowling J.K.", "Ce livre est une introduction au schema XSD", 1996, 4, 1));
        livres.add(new Livre("le petit Nicolas", "Sarkozy Nicolas", "blablabla", 2015, 4, 3));
        livres.add(new Livre("XSD pour les nuls", "Dupond Jean", "Ce livre est une introduction au schema XSD", 2000, 5, 2));
        livres.add(new Livre("Eragon", "Paolini Christopher", "Ce livre est une introduction au schema XSD", 2001, 5, 2));
        livres.add(new Livre("Harry potter 2", "Rowling J.K.", "Ce livre est une introduction au schema XSD", 1996, 4, 1));
        livres.add(new Livre("le petit Nicolas 2", "Sarkozy Nicolas", "blablabla", 2015, 4, 3));
        livres.add(new Livre("XSD pour les gros nuls", "Dupond Jean", "Ce livre est une introduction au schema XSD", 2000, 5, 2));
        livres.add(new Livre("Eragon volume 4", "Paolini Christopher", "Ce livre est une introduction au schema XSD", 2001, 5, 2));


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
                return livres.get(rowIndex).getTitre();
            case 1:
                return livres.get(rowIndex).getAuteur();
            case 2:
                return livres.get(rowIndex).getPresentation();
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