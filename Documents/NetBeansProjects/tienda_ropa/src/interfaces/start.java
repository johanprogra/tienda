
package interfaces;

import functions.funtionProgressbar;
import functions.time;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.Icon;

public class start extends javax.swing.JFrame {

    int send=0;
    public start() {
        
        initComponents();
       
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/images/logoini.jpg"));
        Icon fon1=new ImageIcon(imagen1.getImage().getScaledInstance(presen.getWidth(),presen.getHeight(),Image.SCALE_DEFAULT));
        presen.setIcon(fon1);
        this.repaint();
        this.setSize(new Dimension(630,520)); 
        setLocationRelativeTo(null);
        
        funtionProgressbar funt=new funtionProgressbar();
        
        funt.progress(bar);
        
        Timer time=new Timer(100, new start.horas());
        time.start();
    }
    
    class horas implements ActionListener {
        @Override
      public void actionPerformed(ActionEvent ae) {
      time hor=new time(); 
      hor.tiempo(schedule);
           send++;
            if (send==31) {
                dispose();
                MenuLogin login=new MenuLogin();
                login.setVisible(true);
            }
        }
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        schedule = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        presen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        schedule.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        getContentPane().add(schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 560, 40));
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 461, 580, -1));
        getContentPane().add(presen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 622, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel presen;
    private javax.swing.JLabel schedule;
    // End of variables declaration//GEN-END:variables
}
