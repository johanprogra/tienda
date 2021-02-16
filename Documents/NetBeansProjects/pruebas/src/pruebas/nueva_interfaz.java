
package pruebas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class nueva_interfaz extends JFrame{
    JLabel jlabel;
    JPanel jpanel;
    JButton jbutton;
    
    public nueva_interfaz(){
    jlabel = new JLabel();
    jpanel = new JPanel();
    jbutton = new JButton();
    
    setSize(700,500);
    
    jbutton.setText("Enviar datos");
    setTitle("Mi primera aplicación");
    setSize(600,400);
    setVisible(true);
    
    jpanel.add(jbutton);
    jpanel.add(jlabel);
    add(jpanel);
    
    jbutton.addMouseListener(new MouseAdapter() {
        public void mouseCliked(MouseEvent e){
            clic(e);
        }
    });
}
    
    public static void main(String ...args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new nueva_interfaz();
            }
        });
    }
    private void clic(MouseEvent e){
        JOptionPane.showMessageDialog(null,"hola geo");
    }
    
}
