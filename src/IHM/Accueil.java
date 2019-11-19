package IHM;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Accueil {
    private JPanel container;
    private JButton button1;
    private JButton FICHIERButton;

    public Accueil() {
        FICHIERButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    FICHIERButton.addComponentListener(new ComponentAdapter() { } );
        button1.addActionListener(new ActionListener() {
        });
    }

    public static void main(String[] args) {
        JFrame maFenetre = new JFrame("MaBiblio");
        maFenetre.setContentPane(new Accueil().container);
        maFenetre.pack();
        maFenetre.setVisible(true);



        //JButton FICHIERButton = new JButton();


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
