package IHM;

import javax.swing.*;
import java.awt.*;

public class JtableBasique extends JFrame {
    public JtableBasique (){
        super();

        setTitle("Jtable revu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable tableau = new JTable(new donnees());

        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);

        pack();

    }

}
