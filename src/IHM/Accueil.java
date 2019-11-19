package IHM;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.*;

public class Accueil extends JFrame {
    private JPanel container;
    private JButton button1;
    private JButton myBtnValider;
    private JButton FICHIERButton;

    public Accueil (){


        this.setTitle("bibliothèques");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel myPanel = new JPanel();
        this.setContentPane(myPanel);

        JButton myBtnValider = new JButton("Book");
        JButton myBtnAjouter = new JButton("Author");
        JButton myBtnQuitter = new JButton("Summary");
        JButton myBtnYear    = new JButton("Year");
        JTextField myTxtField = new JTextField();
        JTextField myTxtField2 = new JTextField();
        JTextField myTxtField3 = new JTextField();
        JTextField myTxtField4 = new JTextField();
        JTextField myTxtField5 = new JTextField();
        JTextField myTxtField6 = new JTextField();

        JCheckBox myCheckbox = new JCheckBox();
        JMenuItem menuFile = new JMenuItem();

        GridBagLayout myLayout = new GridBagLayout();
        myPanel.setLayout(myLayout);
        GridBagConstraints myGBC = new GridBagConstraints();



        myGBC.gridx = 1;
        myGBC.gridy = 0;
        myGBC.gridheight = 1;
        myGBC.gridwidth = 1;
        myPanel.add(myBtnValider, myGBC);

        myGBC.gridx = 2;
        myGBC.gridwidth = 1;
        myGBC.fill = GridBagConstraints.VERTICAL;
        myPanel.add(myBtnAjouter, myGBC);

        myGBC.gridx = 3;
        myGBC.gridwidth = 1;
        myGBC.fill = GridBagConstraints.VERTICAL;
        myPanel.add(myBtnQuitter, myGBC);


        myGBC.gridx = 1;
        myGBC.gridy = 0;
        myGBC.gridheight = 2;
        String tableau[] = {"Livre","Auteur","Résumé","Année"};
       String tableau2[][] = {{"Harry Potter","Jk.Rowling", "Dystopie un petit magicien famélique affublé d'une cicatrice sauve le monde", "2005"},{"Le seigneur des Anneaux", "JRR.Tolkien", "Un borgne perd ses bagues et les cherche ardument , tandis qu'une bande de nains poilus des pieds se dressent sur son chemin","1953"}};
        JTable table = new JTable(tableau2,tableau);


        myGBC.gridy = 2;
        myGBC.gridheight = 1;
        myGBC.gridwidth = 7;
        myPanel.add(myTxtField);




       // myGBC.gridwidth = GridBagConstraints.VERTICAL;
        myPanel.add(table, myGBC);


        JMenuBar myMenuBar = new JMenuBar();
        this.setJMenuBar(myMenuBar);
        JMenu myMenu = new JMenu("Fichier");
        myMenuBar.add(myMenu);
        JMenuItem menuSave = new JMenuItem("Sauvegarder");
        myMenu.add(menuSave);
        JMenuItem menuSaveunder = new JMenuItem("Sauvegarder sous");
        myMenu.add(menuSaveunder);
        JMenuItem menuExit = new JMenuItem("Quiter");
        myMenu.add(menuExit);




        JMenu myMenu2 = new JMenu("");
        myMenuBar.add(myMenu2);
        JMenuItem menuModif = new JMenuItem("Modifier livre");
        myMenu2.add(menuModif);

        JMenuItem menuAjout = new JMenuItem("Ajouter livre");
        myMenu2.add(menuAjout);

        JMenuItem menuDelete = new JMenuItem("Supprimer livre");
        myMenu2.add(menuDelete);


        JMenu myMenu3 = new JMenu("à propos");
        myMenuBar.add(myMenu3);
        JMenuItem menuAbout = new JMenuItem("contact us");
        myMenu3.add(menuAbout);

        menuModif.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        menuExit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                dispose();
                System.exit(DISPOSE_ON_CLOSE);


            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }


        });

    }


    public static void main(String[]args){
        Accueil accueil = new Accueil();
        accueil.pack();
        accueil.setVisible(true);



        //maFenetre.setContentPane(myPanel);



    }


}
