package IHM;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JTableAvecModeleDynamiqueLivre extends JFrame {
    private ModeleDynamiqueLivre modele = new ModeleDynamiqueLivre();
    private JTable tableau;

    public JTableAvecModeleDynamiqueLivre() {
        super();

        setTitle("Bibliothèque");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tableau = new JTable(modele);

        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);

        JPanel boutons = new JPanel();

        boutons.add(new JButton(new AddAction()));
        boutons.add(new JButton(new RemoveAction()));

        getContentPane().add(boutons, BorderLayout.SOUTH);

        pack();

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

        JMenu myMenu2 = new JMenu("Edit");
        myMenuBar.add(myMenu2);
        JMenuItem menuModif = new JMenuItem("Modifier livre");
        myMenu2.add(menuModif);

        JMenuItem menuAjout = new JMenuItem("Ajouter livre");
        myMenu2.add(menuAjout);

        JMenuItem menuDelete = new JMenuItem("Supprimer livre");
        myMenu2.add(menuDelete);

        JMenu myMenu3 = new JMenu("à propos");
        myMenuBar.add(myMenu3);
        JMenuItem menuAbout = new JMenuItem("Informations");
        myMenu3.add(menuAbout);

        JTextField textField1 = new JTextField();

        JTextField textField2 = new JTextField();

        JTextField textField3 = new JTextField();

        JTextField textField4 = new JTextField();

        JTextField textField5 = new JTextField();
        JTextField textField6 = new JTextField();






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
                /*myFile = chooser.getSelectedFile();
                System.out.println(myFile.getAbsolutePath());
                processXml(myFile);*/
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
                JOptionPane optionPane = new JOptionPane();
                int retour = optionPane.showConfirmDialog(tableau, "Aucune sauvegarde n'a été trouvée. Voulez vous sauvegarder avant de quitter?", "Attention",JOptionPane.OK_CANCEL_OPTION);
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

        menuAbout.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                JOptionPane d = new JOptionPane();
                d.showMessageDialog( tableau, "Version 1.2"+"\n"+"Produite par Boris l'intellectuel, Romain le comique , Hugo le Pilier de comptoir",
                        "Informations", JOptionPane.INFORMATION_MESSAGE);
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

        tableau.setDefaultRenderer(Object.class, new MyCellRenderer(tableau.getDefaultRenderer(Object.class)));
    }

    public static void main(String[] args) {
        JTableAvecModeleDynamiqueLivre tabl = new JTableAvecModeleDynamiqueLivre();



        tabl.setVisible(true);



    }

    private class AddAction extends AbstractAction {
        private AddAction() {
            super("Ajouter");
        }

        public void actionPerformed(ActionEvent e) {
            modele.addLivre(new Livre("50 nuances de fion", "Troudeballe", "du cul,du cul,du cul", 2, 3, 2005));
        }
    }

    private class RemoveAction extends AbstractAction {
        private RemoveAction() {
            super("Supprimer");

        }

        public void actionPerformed(ActionEvent e) {


            int[] selection = tableau.getSelectedRows();

                if (selection.length == 0){
                    JOptionPane optionPane1 = new JOptionPane();
                    optionPane1.showMessageDialog(  tableau,"Aucune ligne sélectionnée", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                else{
            for(int i = selection.length - 1; i >= 0; i--) {
                modele.removeLivre(selection[i]);
            }
            }
        }
    }
}