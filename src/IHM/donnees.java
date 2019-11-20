package IHM;


import javax.swing.table.AbstractTableModel;

public class donnees extends AbstractTableModel {

        private final Livre [] livres;

        private final String[] entetes = {"Nom","Auteur","Résumé","Colonne","Rangée","Parution"};

        public donnees() {
            super();

            livres = new Livre []{
                     new Livre("Harry empoté", "rolling stones", "un petit binoclard", 4, 3, 1969),
                     new Livre("le seigneur", "tolkiem", "un mauvais livre pour un mauvais film", 3, 2, 2017)

            };

        }

        public int getRowCount() {
            return livres.length;
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
                    return livres[rowIndex].getNom();
                case 1:
                    return livres[rowIndex].getAuteur();
                case 2:
                    return livres[rowIndex].getResume();
                case 3:
                    return livres[rowIndex].getColonne();
                case 4:
                    return livres[rowIndex].getRangee();
                case 5:
                    return livres[rowIndex].getParution();
                default:
                    return null; //Ne devrait jamais arriver
            }
        }
    }

