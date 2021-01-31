
package functions;

import java.awt.Toolkit;
import javax.swing.*;

public class funtion_validacion {
    public void validacion_numeros(java.awt.event.KeyEvent evt) {
        char validacion = evt.getKeyChar();
        if (Character.isLetter(validacion)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"solo se puede ingresar solo numeros");
        }
    }
    public void validacion_letras(java.awt.event.KeyEvent evt) {
        char validacion = evt.getKeyChar();
        if (Character.isDigit(validacion)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"solo se puede ingresar letras");
        }
    }
    public void validacion_caracteres(java.awt.event.KeyEvent evt) {
        char validacion = evt.getKeyChar();
        if (
            evt.getKeyChar()>=33 || evt.getKeyChar()<=64  ||
            evt.getKeyChar()>=91  || evt.getKeyChar()<=96  ||
            evt.getKeyChar()>=123  || evt.getKeyChar()<=208  ||
            evt.getKeyChar()>=210 || evt.getKeyChar()<=240  ||
            evt.getKeyChar()>=242 || evt.getKeyChar()<=255    
                ) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"solo se puede ingresar solo numeros");
        }
    }
}
