
package video_java;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public final class formulario_pricipiante extends JFrame{
    JPanel contenedor;
    JButton button;
    JTextField caja;
    JLabel texto;
    JTextArea area;

    public formulario_pricipiante(String string) throws HeadlessException {
        super(string);
        contenedor =new JPanel();
        this.setBounds(100, 200, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.contenedor);
        
        //accionButton();
        //accionRaton();
        //accionTeclado();
        //validarNumeros();
        validarCorreo();
    }
    protected void validarCorreo() {
        caja =new JTextField();
        caja.setColumns(20);
        caja.setLocation(100, 100);
        contenedor.add(caja);
        
        area =new JTextArea();
        area.setColumns(30);
        area.setRows(10);
        contenedor.add(area);
        
        KeyListener kl=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
               
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyChar()=='\n') {
                    if (esCorreo(caja.getText())==true) {
                        area.append("ha ingresado correo\n");
                    }else{
                        area.append("correo invalido\n");
                    }
                }
            }
        };
        
        caja.addKeyListener(kl);
    }
    public boolean esCorreo(String correo){
        Pattern protroncito = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher comparar=protroncito.matcher(correo);
        return comparar.find();
        
    }
    protected void validarNumeros() {
        caja =new JTextField();
        caja.setColumns(20);
        caja.setLocation(100, 100);
        contenedor.add(caja);
        
        area =new JTextArea();
        area.setColumns(30);
        area.setRows(10);
        contenedor.add(area);
        
    }
    public boolean esNumero(String texto){
        boolean resultado;
        try{
            Integer.parseInt(texto);
            resultado = true;
        }catch(NumberFormatException e){
        resultado = false;
    }
        return resultado;
    }
    protected void accionButton() {
        button =new JButton("Ingresa texto");
        button.setBounds(10, 10, 400, 100);
        contenedor.add(button);
        
        caja =new JTextField();
        caja.setColumns(20);
        contenedor.add(caja);
        
        texto =new JLabel("resultado");
        texto.setBounds(10, 10, 400, 200);
        contenedor.add(texto);
        
        ActionListener action=(ActionEvent e) -> {
            texto.setText(caja.getText());
        };
        button.addActionListener(action);
    }
    
    protected void accionRaton() {
        button =new JButton("Ingresa texto");
        button.setBounds(10, 10, 400, 100);
        contenedor.add(button);
        
        caja =new JTextField();
        caja.setColumns(20);
        contenedor.add(caja);
        
        MouseListener mouse=new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                //caja.setText("hola guapetones");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                //caja.setText("hola guapetones");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //caja.setText("hola guapetones");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                //caja.setText("hola guapetones");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                //caja.setText("hola guapetones");
               
            }
        };
        
        button.addMouseListener(mouse);
    }
    
    protected void accionTeclado() {
        caja =new JTextField();
        caja.setColumns(20);
        caja.setLocation(100, 100);
        contenedor.add(caja);
        
        area =new JTextArea();
        area.setColumns(30);
        area.setRows(10);
        contenedor.add(area);
        
        KeyListener kl=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //area.append("key\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //area.append("key\n");
                if (esNumero(caja.getText())==true) {
                    area.append("Si es numero \n");
                }else{
                    area.append("no es numero \n");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //area.append("key\n");
                switch (e.getKeyChar()) {
                    case 's':
                        area.append("Has presionado la s \n");
                        break;
                    case '\n':
                        area.append("Has presionado enter \n");
                        break;
                    case ' ':
                        area.append("Has presionado espacio \n");
                        break;
                    default:
                        break;
                }
            }
        };
        
        caja.addKeyListener(kl);
        
    }
    public static void main(String []args){
        formulario_pricipiante form=new formulario_pricipiante("Titulon");
        form.setVisible(true);
        
    }

    

    
}
