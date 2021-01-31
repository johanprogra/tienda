
package tienda;

import funciones.hora;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Icon;

public class inicio extends javax.swing.JFrame {
      
    public inicio() {
        
        initComponents();
       
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/imagenes/logoini.jpg"));
        Icon fon1=new ImageIcon(imagen1.getImage().getScaledInstance(presen.getWidth(),presen.getHeight(),Image.SCALE_DEFAULT));
        presen.setIcon(fon1);
        this.repaint();
        this.setSize(new Dimension(630,520)); 
        setLocationRelativeTo(null);
        
        Timer tiempo1=new Timer(100, new inicio.horas());
        tiempo1.start();
    }
    
    
    
    class horas implements ActionListener {
        @Override
      public void actionPerformed(ActionEvent ae) {
      hora hor=new hora(); 
      hor.tiempo(horario);
      
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        horario = new javax.swing.JLabel();
        presen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        horario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(horario);
        horario.setBounds(20, 10, 480, 40);
        jPanel1.add(presen);
        presen.setBounds(2, 2, 622, 466);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel horario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel presen;
    // End of variables declaration//GEN-END:variables
}
