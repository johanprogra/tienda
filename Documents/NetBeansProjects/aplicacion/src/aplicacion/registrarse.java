package aplicacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import aplicacion.logueo;
import baseDatos.conexionMYSQL;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.Icon;
public class registrarse extends javax.swing.JFrame {
DefaultTableModel modelo= new DefaultTableModel();

    
    public registrarse() {
        initComponents();
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/imagenes/reg.png"));
        ImageIcon imagen2=new ImageIcon(getClass().getResource("/imagenes/act.png"));
        ImageIcon imagen3=new ImageIcon(getClass().getResource("/imagenes/bor.png"));
        ImageIcon imagen4=new ImageIcon(getClass().getResource("/imagenes/dev.png"));
        ImageIcon imagen5=new ImageIcon(getClass().getResource("/imagenes/logo2.png"));
        ImageIcon imagen6=new ImageIcon(getClass().getResource("/imagenes/most.png"));
        Icon fon1=new ImageIcon(imagen1.getImage().getScaledInstance(a1.getWidth(),a1.getHeight(),Image.SCALE_DEFAULT));
        Icon fon2=new ImageIcon(imagen2.getImage().getScaledInstance(a2.getWidth(),a2.getHeight(),Image.SCALE_DEFAULT));
        Icon fon3=new ImageIcon(imagen3.getImage().getScaledInstance(a3.getWidth(),a3.getHeight(),Image.SCALE_DEFAULT));
        Icon fon4=new ImageIcon(imagen4.getImage().getScaledInstance(a4.getWidth(),a4.getHeight(),Image.SCALE_DEFAULT));
        Icon fon5=new ImageIcon(imagen5.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT));
        Icon fon6=new ImageIcon(imagen6.getImage().getScaledInstance(mostrar.getWidth(),mostrar.getHeight(),Image.SCALE_DEFAULT));
        a1.setIcon(fon1);
        a2.setIcon(fon2);
        a3.setIcon(fon3);
        a4.setIcon(fon4);
        logo.setIcon(fon5);
        mostrar.setIcon(fon6);
        this.repaint();
        this.setSize(new Dimension(620,375)); 
        setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        h = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();
        a1 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTable();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mostrar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        a5 = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        h.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(h);
        h.setBounds(30, 310, 34, 14);
        getContentPane().add(logo);
        logo.setBounds(10, 43, 110, 140);

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 53, 46, 25);

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Contraseña nueva");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 93, 110, 14);
        getContentPane().add(usuario);
        usuario.setBounds(270, 43, 263, 30);
        getContentPane().add(contraseña);
        contraseña.setBounds(270, 83, 263, 30);

        a1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        getContentPane().add(a1);
        a1.setBounds(170, 163, 70, 40);

        a4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        getContentPane().add(a4);
        a4.setBounds(440, 163, 70, 40);

        result.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "                     ID", "                         USUARIO", "                    CONTRASEÑA"
            }
        ));
        result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(result);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 233, 480, 90);

        a2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        getContentPane().add(a2);
        a2.setBounds(260, 163, 70, 40);

        a3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        getContentPane().add(a3);
        a3.setBounds(350, 163, 70, 40);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel4.setText("REGISTRAR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 143, 73, 17);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("ACTUALIZAR");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 143, 81, 17);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel9.setText("BORRAR");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 143, 54, 17);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel10.setText("REGRESAR");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 143, 69, 17);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(130, 33, 430, 90);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(140, 143, 400, 70);

        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar);
        mostrar.setBounds(20, 243, 70, 50);

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel6);
        jPanel6.setBounds(10, 43, 110, 140);
        getContentPane().add(a5);
        a5.setBounds(0, 33, 130, 160);
        getContentPane().add(f);
        f.setBounds(10, 323, 40, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 233, 90, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
    conexionMYSQL mysql=new conexionMYSQL();
    Connection cn=mysql.Conectar();
    String Ssql="";
    String mensaje="";
    String usu,contra;
    usu=usuario.getText();
    contra=contraseña.getText();
    Ssql="INSERT INTO registro(usuario,clave) VALUES(?,?)";
    mensaje="los datos se ingresado correctamente";
    
    
    try{
     PreparedStatement pst= cn.prepareStatement(Ssql); 
     pst.setString(1,usu);
     pst.setString(2,contra);
     
     int n= pst.executeUpdate();
     if(n>0){
         JOptionPane.showMessageDialog(null, mensaje);
         mostrar();
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
    }
                       
    }//GEN-LAST:event_a1ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        logueo e2=new logueo();
        e2.setVisible(true);
        dispose();       
    }//GEN-LAST:event_a4ActionPerformed

    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked
    int fila= result.getSelectedRow();
         
       if (fila<0)
       {
             JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
       }
       else
       {
           String id=result.getValueAt(fila,0).toString();
           String USUARIO=result.getValueAt(fila,1).toString();
           String CONTRASEÑA=result.getValueAt(fila,2).toString();

           usuario.setText(USUARIO);
           contraseña.setText(CONTRASEÑA);
           h.setText(id);
           
       }   
    }//GEN-LAST:event_resultMouseClicked

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
     conexionMYSQL mysql=new conexionMYSQL();
    Connection cn=mysql.Conectar();
    String sSQL = "";
    String usu, contra,Id;
    Id=h.getText();
    usu= usuario.getText();
    contra= contraseña.getText();

     sSQL = "UPDATE registro SET usuario = ?,clave = ? WHERE ID_nit='"+Id+"'";
     String mensaje = "Los datos se han Modificado de Manera Satisfactoria...";

     try
     {
      PreparedStatement pst = cn.prepareStatement(sSQL);
      pst.setString(1, usu);
      pst.setString(2, contra);
      int n = pst.executeUpdate();

if(n > 0)
{
            JOptionPane.showMessageDialog(null, mensaje);
           mostrar();
}
}
            catch (SQLException ex)
    {
             JOptionPane.showMessageDialog(null, ex);
}    
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
    conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	try {
		String query="delete from registro where ID_nit=?";
		ps=cn.prepareStatement(query);
		ps.setString(1, h.getText());
		ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                mostrar();
	} 
        catch (SQLException ex) 
         {
           JOptionPane.showMessageDialog(null, ex.getMessage());
          }        
    }//GEN-LAST:event_a3ActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        try {
		String query="select * from registro";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_nit","usuario","clave"});
                            
              while(rs.next())
              {
                 modelo.addRow(new Object[]{rs.getString("ID_nit"),rs.getString("usuario"),rs.getString("clave")}); 
              }
              
               result.setModel(modelo);
 
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null, ex.getMessage());
        }      
    }//GEN-LAST:event_mostrarActionPerformed
private void mostrar()
  {
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        try {
		String query="select * from registro";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_nit","usuario","clave"});
                            
              while(rs.next())
              {
                 modelo.addRow(new Object[]{rs.getString("ID_nit"),rs.getString("usuario"),rs.getString("clave")}); 
              }
              
               result.setModel(modelo);
 
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
  }
   
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
            java.util.logging.Logger.getLogger(registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JLabel a5;
    private javax.swing.JTextField contraseña;
    private javax.swing.JLabel f;
    private javax.swing.JLabel h;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton mostrar;
    private javax.swing.JTable result;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
