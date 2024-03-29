package IHM;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JTableAvecModeleDynamiqueLivre extends JFrame {
    private ModeleDynamiqueLivre modele = new ModeleDynamiqueLivre();
    private JTable tableau;
    private JTextField textfieldTitre;
    private JTextField textfieldAuteur;
    private JTextField textfieldPresentation;
    private JTextField textfieldParution;
    private JTextField textfieldColonne;
    private JTextField textfieldRangee;


    public JTableAvecModeleDynamiqueLivre() {
        super();

        setTitle("Bibliothèque");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tableau = new JTable(modele);



        //getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);

        JPanel myPanel = new JPanel();
        JScrollPane myScrollPane = new JScrollPane(tableau);
        GridBagLayout GBL = new GridBagLayout();
        myPanel.setLayout(GBL);
        GridBagConstraints myGBC = new GridBagConstraints();

        myGBC.gridx = 0;
        myGBC.gridy = 0;
        myGBC.gridheight = 10;
        myGBC.gridwidth = 5;
        myPanel.add(myScrollPane,myGBC);


        /*myGBC.gridx = 0;
        myGBC.gridy = 1;
        myGBC.gridheight = 6;
        myGBC.gridwidth = 2;
        myPanel.add(tableau,myGBC);
         */



        myPanel.add(new JButton(new AddAction()));
        myPanel.add(new JButton(new RemoveAction()));


        getContentPane().add(myPanel);

// consruction du forumulaire



        JLabel jlabelTitre = new JLabel("Titre :");
        myGBC.gridx = 5;
        myGBC.gridy = 1;
        myGBC.gridheight = 1;
        myGBC.gridwidth = 1;
        myPanel.add(jlabelTitre,myGBC);

        JLabel jlabelAuteur = new JLabel("Auteur :");
        myGBC.gridy = 2;


        myPanel.add(jlabelAuteur,myGBC);

        JLabel jlabelPresentation = new JLabel("Présentation :");
        myGBC.gridy = 3;
        myPanel.add(jlabelPresentation,myGBC);

        JLabel jlabelParution = new JLabel("Parution :");
        myGBC.gridy = 4;

        myPanel.add(jlabelParution,myGBC);

        JLabel jlabelColonne = new JLabel("Colonne :");

        myGBC.gridy = 5;
        myPanel.add(jlabelColonne,myGBC);

        JLabel jlabelRangee = new JLabel("Rangée:");
       
        myGBC.gridy = 6;

        //myGBC.fill = GridBagConstraints.VERTICAL;
        myPanel.add(jlabelRangee,myGBC);



        textfieldTitre = new JTextField();
        myGBC.gridx = 6;
        myGBC.gridy = 1;
        myGBC.gridheight = 1;
        myGBC.gridwidth = 1;
        Dimension dim = new Dimension();
        dim.setSize(100,30);
        textfieldTitre.setPreferredSize(dim);
        myGBC.fill = GridBagConstraints.REMAINDER;
        myPanel.add(textfieldTitre,myGBC);

         JTextField textfieldAuteur= new JTextField();
        myGBC.gridy = 2;
        dim = new Dimension();
        dim.setSize(100,30);
        myGBC.fill = GridBagConstraints.REMAINDER;
        textfieldAuteur.setPreferredSize(dim);
        myPanel.add(textfieldAuteur,myGBC);

        textfieldPresentation= new JTextField();
        myGBC.gridy = 3;
        dim = new Dimension();
        dim.setSize(100,30);
       textfieldPresentation.setPreferredSize(dim);
        myGBC.fill = GridBagConstraints.REMAINDER;
        myPanel.add(textfieldPresentation,myGBC);

        textfieldParution = new JTextField();
        myGBC.gridy = 4;
        dim = new Dimension();
        dim.setSize(100,30);
        textfieldParution.setPreferredSize(dim);
        myGBC.fill = GridBagConstraints.REMAINDER;
        myPanel.add(textfieldParution,myGBC);

        textfieldColonne= new JTextField();
        myGBC.gridy = 5;
        dim = new Dimension();
        dim.setSize(100,30);
        textfieldColonne.setPreferredSize(dim);
        myGBC.fill = GridBagConstraints.REMAINDER;
        myPanel.add(textfieldColonne,myGBC);

        textfieldRangee= new JTextField();
        myGBC.gridy = 6;
        dim = new Dimension();
        dim.setSize(100,30);
        textfieldRangee.setPreferredSize(dim);
        myGBC.fill = GridBagConstraints.REMAINDER;
        myPanel.add(textfieldRangee,myGBC);



        pack();

        JMenuBar myMenuBar = new JMenuBar();
        this.setJMenuBar(myMenuBar);
        JMenu myMenu = new JMenu("Fichier");
        myMenuBar.add(myMenu);
        JMenuItem menuOpen = new JMenuItem("Ouvrir");
        myMenu.add(menuOpen);
        JMenuItem menuSave = new JMenuItem("Sauvegarder");
        myMenu.add(menuSave);
        JMenuItem menuSaveUnder = new JMenuItem("Sauvegarder sous");
        myMenu.add(menuSaveUnder);
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




        tableau.addMouseListener(new MouseListener() {
                     @Override
                     public void mouseClicked(MouseEvent e) {

                     }

                     @Override
                     public void mousePressed(MouseEvent e) {
                         Object titre = tableau.getValueAt(tableau.getSelectedRow(),0);
                         Object auteur = tableau.getValueAt(tableau.getSelectedRow(),1);
                         Object presentation = tableau.getValueAt(tableau.getSelectedRow(),2);
                         Object parution = tableau.getValueAt(tableau.getSelectedRow(),3);
                         Object colonne = tableau.getValueAt(tableau.getSelectedRow(),4);
                         Object rangee = tableau.getValueAt(tableau.getSelectedRow(),5);


                         textfieldTitre.setText((String)titre );
                         textfieldAuteur.setText((String) auteur);
                         textfieldPresentation.setText((String) presentation);
                         textfieldParution.setText(parution.toString());
                         textfieldColonne.setText(colonne.toString());
                         textfieldRangee.setText(rangee.toString());

                         System.out.format("%s %s %s %s %s %s\n", titre, auteur, presentation, parution, colonne, rangee);
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

