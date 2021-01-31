
package administrador;
import tienda.*;
import java.awt.Dimension;
import Funciones.usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static tienda.login.cer;

public class claveadmin extends javax.swing.JFrame {
    public claveadmin() {
        initComponents();
        
        this.setSize(new Dimension(460,310));
        setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        ingresar2 = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        usuario1 = new javax.swing.JTextField();

        ingresar1.setText("REGRESAR");
        ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("       BIENVENIDO");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 10, 230, 30);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 51, 204));
        jPanel1.setLayout(null);
        jPanel1.add(usuario);
        usuario.setBounds(0, 0, 0, 0);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 40, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 110, 20);

        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(contraseña);
        contraseña.setBounds(140, 70, 210, 30);

        ingresar2.setText("INGRESAR");
        ingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar2ActionPerformed(evt);
            }
        });
        jPanel1.add(ingresar2);
        ingresar2.setBounds(140, 120, 100, 30);

        regresar.setText("REGRESAR");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar);
        regresar.setBounds(250, 120, 100, 30);

        usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario1ActionPerformed(evt);
            }
        });
        usuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuario1KeyPressed(evt);
            }
        });
        jPanel1.add(usuario1);
        usuario1.setBounds(140, 30, 210, 30);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(10, 50, 400, 180);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 430, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        login e2=new login();
        e2.setVisible(true);
        dispose();   
    }//GEN-LAST:event_regresarActionPerformed

    private void ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar1ActionPerformed

    }//GEN-LAST:event_ingresar1ActionPerformed

    private void ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar2ActionPerformed
        String usuari,contraseñ;
        usuari=usuario1.getText();
        contraseñ=contraseña.getText();
        if(usuari.equals("") || contraseñ.equals("")){
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
        }else{
         usuario usu=new usuario();
         usu.Logguearse_admin(usuario1, contraseña);
         if(cer.equals("abrir")){
             menuadmin e2=new menuadmin();
             e2.setVisible(true);
             dispose();
         }}
    }//GEN-LAST:event_ingresar2ActionPerformed

    private void usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario1ActionPerformed
       
    }//GEN-LAST:event_usuario1ActionPerformed

    private void usuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuario1KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       usuario usu=new usuario();
       usu.Logguearse_admin(usuario1, contraseña);
       if(cer.equals("abrir")){
           menuadmin e2=new menuadmin();
           e2.setVisible(true);  
           dispose();
         }
       }
    }//GEN-LAST:event_usuario1KeyPressed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        
    }//GEN-LAST:event_contraseñaActionPerformed

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        usuario usu=new usuario();
        usu.Logguearse_admin(usuario1, contraseña);
        if(cer.equals("abrir")){
            menuadmin e2=new menuadmin();
            e2.setVisible(true);
            dispose();
         }
        }
    }//GEN-LAST:event_contraseñaKeyPressed
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton ingresar1;
    private javax.swing.JButton ingresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario1;
    // End of variables declaration//GEN-END:variables
}
