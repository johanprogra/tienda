
package video_java;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class diseño2 extends JFrame{
    ArrayList<JPanel> panel=new ArrayList<>();
    ArrayList<JLabel> label=new ArrayList<>();
    JButton button;
    JButton button2;
    int num=3;
    JPanel contenedor=new JPanel();
    
    
    public diseño2(String string) throws HeadlessException {
        super(string);
        this.setBounds(400,300,400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(400,100);
        this.setLocationRelativeTo(null);
        iniciarPaneles();
        iniciaetiquetas();
        iniciarBotones();
    }

    protected void iniciarPaneles() {
        this.getContentPane().add(contenedor);
        
        for (int i = 0; i < this.num; i++) {
            this.panel.add(new JPanel());
            contenedor.add(this.panel.get(i));
            this.panel.get(i).setBackground(new Color(i*50,i*50,i*50));
        }
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.X_AXIS));
    }

    protected void iniciaetiquetas() {
        for (int i = 0; i < this.num; i++) {
            this.label.add(new JLabel("guapetones"+(i+1)));
            this.label.get(i).setForeground(Color.white);
            this.panel.get(i).add(this.label.get(i));
        }
        label.get(2).setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/imagenes/4.png")).getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
    }
    protected void iniciarBotones() {
        button=new JButton("Oprime el button");
        button2=new JButton();
        
        this.getContentPane().add(contenedor);
        
        contenedor.add(button);
        contenedor.add(button2);
        
        contenedor.setLayout(null);
        button.setBounds(100, 100, 200, 100);
        button2.setBounds(100, 250, 200, 100);
        
        button.setMnemonic(KeyEvent.VK_ENTER);
        button2.setMnemonic(KeyEvent.VK_SPACE);
        
        button.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        
        button2.setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/imagenes/siguiente.png")).getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH)));
        
        
    }
    
    
    public static void main(String []args){
        diseño2 pru=new diseño2("tiulon");
        pru.setVisible(true);
    }

    
    
}
