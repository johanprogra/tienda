/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desingclothing;
import baseDatos.conexionMYSQL;
import java.sql.*;
import java.sql.PreparedStatement;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.Icon;
public class clave extends javax.swing.JFrame {
DefaultTableModel modelo= new DefaultTableModel();
    public clave() {
        initComponents();
        this.setSize(new Dimension(870, 710));
        setLocationRelativeTo(null);
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/imagenes/logo.png"));
        Icon fon1=new ImageIcon(imagen1.getImage().getScaledInstance(moda.getWidth(),moda.getHeight(),Image.SCALE_DEFAULT));
        moda.setIcon(fon1);
        this.repaint();
        this.setSize(new Dimension(515,345)); 
        setLocationRelativeTo(null);
        usuario.setEnabled(false);
        contraseña.setEnabled(false);
        ingresar.setEnabled(false);
        r.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        r = new javax.swing.JButton();
        moda = new javax.swing.JLabel();
        seleccion = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TIPO DE USUARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 30, 140, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 60, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 110, 110, 17);
        getContentPane().add(contraseña);
        contraseña.setBounds(210, 100, 240, 30);
        getContentPane().add(usuario);
        usuario.setBounds(210, 60, 240, 30);

        ingresar.setText("INGRESAR");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar);
        ingresar.setBounds(210, 150, 120, 30);

        r.setText("REGISTRARSE");
        r.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        getContentPane().add(r);
        r.setBounds(350, 150, 100, 30);
        getContentPane().add(moda);
        moda.setBounds(270, 200, 210, 80);

        seleccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "................", "vendedor", "administrador" }));
        seleccion.setBorder(null);
        seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionActionPerformed(evt);
            }
        });
        getContentPane().add(seleccion);
        seleccion.setBounds(260, 20, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        
        if(seleccion.getSelectedItem().equals("vendedor")){
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
        String usu,contra;
        usu=usuario.getText();
        contra=contraseña.getText();
           try
        {
        Statement b =  cn.createStatement();
        ResultSet busqusua = b.executeQuery("SELECT * FROM registro WHERE usuario='"+usu+"' and contraseña='"+contra+"'");
        boolean found = false;
        int user_id = 0;
        while(busqusua.next()){found=true; user_id = busqusua.getInt("ID_registro");}
        if(found)
        {
            JOptionPane.showMessageDialog(rootPane, "Acceso concedido...","Ingresando",JOptionPane.INFORMATION_MESSAGE);
            menu_vendedor e2=new menu_vendedor();
            e2.setVisible(true);
            dispose();   
                                 
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Usuario incorrecto...","Incorrecto",JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null,ex, "Error!!", JOptionPane.ERROR_MESSAGE);
        }
       }
        
       else if(seleccion.getSelectedItem().equals("administrador")){
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
        String usu,contra;
        usu=usuario.getText();
        contra=contraseña.getText();
           try
        {
        Statement b =  cn.createStatement();
        ResultSet busqusua = b.executeQuery("SELECT * FROM administrador WHERE usuario='"+usu+"' and clave='"+contra+"'");
        boolean found = false;
        int user_id = 0;
        while(busqusua.next()){found=true; user_id = busqusua.getInt("ID_nit");}
        if(found)
        {
            JOptionPane.showMessageDialog(rootPane, "Acceso concedido...","Ingresando",JOptionPane.INFORMATION_MESSAGE);
            menu_adimistrador e2=new menu_adimistrador();
            e2.setVisible(true);
            dispose();   
                                 
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Usuario incorrecto...","Incorrecto",JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null,ex, "Error!!", JOptionPane.ERROR_MESSAGE);
        }
       }
                                              
             
    }//GEN-LAST:event_ingresarActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        registro registro=new registro();
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_rActionPerformed

    private void seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionActionPerformed

        if(seleccion.getSelectedItem().equals("................")){
           usuario.setEnabled(false);
            contraseña.setEnabled(false);
            ingresar.setEnabled(false);
           r.setEnabled(false);
       }
        else if(seleccion.getSelectedItem().equals("administrador")){
           usuario.setEnabled(true);
            contraseña.setEnabled(true);
            ingresar.setEnabled(true);
           r.setEnabled(false);
       }
       else if(seleccion.getSelectedItem().equals("vendedor")){
           usuario.setEnabled(true);
            contraseña.setEnabled(true);
            ingresar.setEnabled(true);
           r.setEnabled(true);
       }
       
    }//GEN-LAST:event_seleccionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel moda;
    private javax.swing.JButton r;
    private javax.swing.JComboBox seleccion;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
