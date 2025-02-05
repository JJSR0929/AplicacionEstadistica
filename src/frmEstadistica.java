import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
        txDato.setBounds(80,10,100,25);
        getContentPane().add(txDato);   

        JLabel  lblDatos=new JLabel("La muestra");
        lblDatos.setBounds(250,10,100,25);
        getContentPane().add(lblDatos);

        JButton btnAgregar=new JButton("Agregar");
        btnAgregar.setBounds(80,40,100,25);
        getContentPane().add(btnAgregar);

        JButton btnQuitar=new JButton("Quitar");
        btnQuitar.setBounds(80,70,100,25);
        getContentPane().add(btnQuitar);

        JList lstMuestra=new JList();
        lstMuestra.setBounds(250,40,100,150);
        getContentPane().add(lstMuestra);

    }
}


