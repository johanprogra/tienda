
package video_java;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public final class diseño3 extends JFrame{
    JPanel contenedor=new JPanel();
    JPanel contenedor2=new JPanel();
    ArrayList<JPanel> panel=new ArrayList<>();
    ArrayList<JRadioButton> radio=new ArrayList<>();
    int num=3;
    
    public diseño3(String string) throws HeadlessException {
        super(string);
        this.setBounds(400,300,500,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        //iniciarPaneles();
        //iniciarCampodetexto();
        //iniciarRadio();
        //iniciaAreaTexto();
        iniciarListaDesplegable();
        
        
    }
    protected void iniciarPaneles() {
        this.getContentPane().add(contenedor);
        this.getContentPane().add(contenedor2);
        for (int i = 0; i < this.num; i++) {
            this.panel.add(new JPanel());
            contenedor.add(this.panel.get(i));
            this.panel.get(i).setBackground(new Color(i*50,i*50,i*50));
        }
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.X_AXIS));
    }
    protected void iniciarRadio() {
        
        ButtonGroup grupo=new ButtonGroup();
        String texto[]={"Dale aqui geo","Dale aqui Guapeton","Dale aqui bestia"};
        for (int i = 0; i < texto.length; i++) {
            radio.add(new JRadioButton());
            radio.get(i).setText(texto[i]);
            contenedor.add(radio.get(i));
            radio.get(i).setBounds(100, 100+(i*50), 350, 50);
            radio.get(i).setFont(new Font(Font.SERIF,Font.BOLD,15));
            radio.get(i).setSelected(false);
            grupo.add(radio.get(i));
            this.getContentPane().add(radio.get(i));
        }
       }
    protected void iniciarCampodetexto() {
        JTextField CampoTexto=new JTextField();
        CampoTexto.setText("hola machote");
        this.contenedor2.add(CampoTexto);
        //CampoTexto.setBounds(200,200,300,25);
        CampoTexto.setColumns(20);
    }
    protected void iniciaAreaTexto() {
        this.getContentPane().add(contenedor);
        JTextArea area=new JTextArea();
        JScrollPane scroll=new JScrollPane(area);
        //area.setBounds(100, 100, 300, 300);
        area.setColumns(20);
        area.setRows(10);
        area.setText("hola machote");
        area.append("\n cierto");
        area.setEditable(true);
        
        this.contenedor.add(scroll);
    }
    protected void iniciarListaDesplegable() {
        this.getContentPane().add(contenedor);
        String texto[]={"Java","Html","CSS","Javascript","Base De Datos"};
        JComboBox lista=new JComboBox(texto);
        lista.setBounds(100, 100, 300, 300);
        //lista.setSelectedItem("CSS");
        lista.setSelectedIndex(2);
        lista.addItem("Python");
        this.contenedor.add(lista);
        
    }
    public static void main(String []args){
        diseño3 pru=new diseño3("titulon");
        pru.setVisible(true);
    }

    

    

    

    
    
}
