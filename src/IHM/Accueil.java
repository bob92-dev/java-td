package IHM;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Accueil extends JFrame {

    private  File myFile;
    private JPanel container;
    private JButton button1;
    private JButton myBtnValider;
    private JButton FICHIERButton;

    public Accueil (){


        this.setTitle("bibliothèque");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel myPanel = new JPanel();
        this.setContentPane(myPanel);


        GridBagLayout myLayout = new GridBagLayout();
        myPanel.setLayout(myLayout);
        GridBagConstraints myGBC = new GridBagConstraints();





        myGBC.gridx = 0;
        myGBC.gridy = 0;
        myGBC.gridheight = 2;

        /* String header[] = {"Livre","Auteur","Résumé","Année"};
       String data[][] = {{"Harry Potter","Jk.Rowling", "Dystopie un petit magicien famélique affublé d'une cicatrice sauve le monde", "2005"},{"Le seigneur des Anneaux", "JRR.Tolkien", "Un borgne perd sa bague et la cherche ardument , tandis qu'une bande de nabots poilus des pieds se dressent sur son chemin","1953"}};
        JTable table = new JTable(data,header);*/

        /*DefaultTableCellRenderer tbl = new DefaultTableCellRenderer();
        Component c = tbl.getTableCellRendererComponent(table,table.getValueAt(0,0),true,true, 1,1);
        c.setBackground(Color.RED);
        myPanel.add(new JScrollPane(table));*/


        JMenuBar myMenuBar = new JMenuBar();
        this.setJMenuBar(myMenuBar);
        JMenu myMenu = new JMenu("Fichier");
        myMenuBar.add(myMenu);
        JMenuItem menuOpen = new JMenuItem("Ouvrir");
        myMenu.add(menuOpen);
        JMenuItem menuSave = new JMenuItem("Sauvegarder");
        myMenu.add(menuSave);
        JMenuItem menuSaveunder = new JMenuItem("Sauvegarder sous");
        myMenu.add(menuSaveunder);
        JMenuItem menuExit = new JMenuItem("Quitter");
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



        menuOpen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("fichier xml", "xml");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(null);
                myFile = chooser.getSelectedFile();
                System.out.println(myFile.getAbsolutePath());
                processXml(myFile);
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


    private void processXml (File myFile){


    }


    public static void main(String[]args){
        new JtableBasique().setVisible(true);
        Accueil accueil = new Accueil();
        accueil.pack();
        accueil.setVisible(true);






    }


}
