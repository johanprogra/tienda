
package video_java;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class pruebas_2_0 extends JFrame{
    
    private JPanel panel2;
    private JPanel panel1;
    private JPanel panel3;
   
    public pruebas_2_0(String title) throws HeadlessException {
        super(title);
        //Dimension d=new Dimension(500,500);
        //this.setSize(d);
        this.setBounds(400,300,400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(400,100);
        this.setLocationRelativeTo(null);
        iniciarPaneles();
        iniciaetiquetas();
    }
    protected void iniciarPaneles() {
        JPanel contenedor=new JPanel();
        this.getContentPane().add(contenedor);
        this.panel1=new JPanel();
        this.panel2=new JPanel();
        this.panel3=new JPanel();
        contenedor.add(this.panel1);
        contenedor.add(this.panel2);
        contenedor.add(this.panel3);
        this.panel1.setBackground(new Color(243, 156, 18 ));
        this.panel2.setBackground(Color.GRAY);        
        this.panel3.setBackground(Color.BLUE);
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.X_AXIS));
    }
    private void iniciaetiquetas() {
        //ImageIcon icon = new ImageIcon(this.getClass().getResource("/imagenes/4.png"));
        //ImageIcon icon2 = new ImageIcon(icon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        JLabel label1=new JLabel("<html>Hola guapetones 1</html>");
        JLabel label2=new JLabel("<html>Hola guapetones 2</html>");
        JLabel label3=new JLabel("<html>Hola guapetones 3</html>");
        
        label3.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/imagenes/4.png")).getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        
        this.panel1.add(label1);
        this.panel2.add(label2);
        this.panel3.add(label3);
        
        label1.setForeground(Color.white);
        label2.setForeground(Color.white);
        label3.setForeground(Color.white);
        
        this.panel1.setLayout(null);
        this.panel2.setLayout(null);
        this.panel3.setLayout(null);
        
        
        label1.setBounds(10, 100, 90, 60);
        label2.setBounds(10, 100, 90, 60);
        label3.setBounds(10, 100, 200, 60);
        
        label1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        
        
    }
    
    public static void main(String []args){
        pruebas_2_0 pru=new pruebas_2_0("titulon");
        pru.setVisible(true);
    }

   
    

    
}
