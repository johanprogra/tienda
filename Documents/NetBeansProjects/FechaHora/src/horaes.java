


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.util.*;

public class horaes extends javax.swing.JFrame{

    public horaes() {
        initComponents();
        
        Timer tiempo1=new Timer(100, new horaes.horas());
        tiempo1.start();
    }
     class horas implements ActionListener {
        @Override
      public void actionPerformed(ActionEvent ae) {
      
      Date sistFecha=new Date();
      SimpleDateFormat format=new SimpleDateFormat("dd MMMMM YYYY");
      String horaactual=format.format(sistFecha);
      
      Date sistema=new Date();
      String pmAm="hh:mm:ss a";
      SimpleDateFormat formato=new SimpleDateFormat(pmAm);
      Calendar hoy=Calendar.getInstance();
      
      Date dia=new Date();
      String dias=("EEEE  ");
      SimpleDateFormat fromat1=new SimpleDateFormat(dias);
      String diaactual=fromat1.format(dia);
      
      String fechaactual=String.format(formato.format(sistema),hoy);
      hora.setText(diaactual+"  "+horaactual+"\n     "+fechaactual);
      
        }
      
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new horaes().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables

    
}
