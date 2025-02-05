import javax.swing.WindowConstants;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmEstadistica extends JFrame {

    public frmEstadistica(){
        setSize (600,300);
        setTitle("Estadistica");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lbDato=new JLabel("dato");
        lbDato.setBounds(10,10,100,25);
        getContentPane().add(lbDato);

        JTextField txDato=new JTextField("");
        txDato.setBounds(100,10,100,25);
        getContentPane().add(txDato);

        JLabel  lblDatos=new JLabel("La muestra");
        lblDatos.setBounds(210,10,100,25);
        getContentPane().add(lblDatos);

    }
}


