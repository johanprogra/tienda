
package pruebas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class formulario {
    JFrame jframe;
    JPanel jpanel,jpanelb;
    JLabel user,pass;
    JTextField user1;
    JPasswordField pass1;
    JButton jbutton;
    
    public formulario(){
        jframe=new JFrame();
        jframe.setSize(400,150);
        user=new JLabel("Usuario");
        user1=new JTextField(15);
        jpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jpanel.setSize(100,100);
        jpanel.add(user,BorderLayout.WEST);
        jpanel.add(user1,BorderLayout.CENTER);
        
       
        pass = new JLabel("pass");
        pass1=new JPasswordField(15);
        jpanelb=new JPanel();
        jpanelb.setLayout(new FlowLayout(FlowLayout.LEFT));
        jpanelb.add(pass,BorderLayout.WEST);
        jpanelb.add(pass1,BorderLayout.CENTER);
        
        jbutton =new JButton("Enviar");
        
        jbutton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(jframe,"hola");
        }    
        });
        jframe.setLayout(new BoxLayout(jframe.getContentPane(),BoxLayout.Y_AXIS));
        jframe.add(jpanel);
        jframe.add(jpanelb);
        jframe.add(jbutton);
        jframe.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
       formulario form=new formulario();
       
    }
    
}
