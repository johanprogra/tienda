
package Formularios;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class FrmGraficas extends javax.swing.JFrame {

    public FrmGraficas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEjecutar = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        rb3D = new javax.swing.JRadioButton();
        rb2D = new javax.swing.JRadioButton();
        rbBarra = new javax.swing.JRadioButton();
        rbCircular = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultas = new javax.swing.JTable();
        cmbConsultas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        rb3D.setText("3D");

        rb2D.setText("2D");

        rbBarra.setText("Barra");

        rbCircular.setText("Circular");

        tblConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblConsultas);

        cmbConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecciona una consulta --", "Mostrar tabla persona", "Agrupar personas", "Mostrar tabla genero" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb3D)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb2D)
                                .addGap(18, 18, 18)
                                .addComponent(rbBarra)
                                .addGap(18, 18, 18)
                                .addComponent(rbCircular))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(712, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(cmbConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb3D)
                    .addComponent(rb2D)
                    .addComponent(rbBarra)
                    .addComponent(rbCircular))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel miModelo;
        DGraficar miGrafica = new DGraficar();
        int op = cmbConsultas.getSelectedIndex();
        switch(op){
            case 1:
                miModelo = miGrafica.mostrarPersona();
                tblConsultas.setModel(miModelo);
                break;
            case 2:
                miModelo = miGrafica.agruparPersona();
                tblConsultas.setModel(miModelo); 
                break;
            case 3:
                miModelo = miGrafica.mostrarGenero();
                tblConsultas.setModel(miModelo); 
                break; 
            default: JOptionPane.showMessageDialog(rootPane, "Sigue Asi!!!!");
        }
        
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
     
        if(rb3D.isSelected() && rbBarra.isSelected()){
            DefaultCategoryDataset dtsc = new DefaultCategoryDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(Integer.parseInt(tblConsultas.getValueAt(i, 0).toString()), tblConsultas.getValueAt(i, 1).toString(), tblConsultas.getValueAt(i, 2).toString());
            }
            JFreeChart ch = ChartFactory.createBarChart3D("Grafica de barras 3D", "Cantidad", "Genero", dtsc,PlotOrientation.HORIZONTAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }
        if(rb2D.isSelected() && rbBarra.isSelected()){
            DefaultCategoryDataset dtsc = new DefaultCategoryDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(Integer.parseInt(tblConsultas.getValueAt(i, 0).toString()), tblConsultas.getValueAt(i, 1).toString(), tblConsultas.getValueAt(i, 2).toString());
            }
            JFreeChart ch = ChartFactory.createBarChart("Grafica de barras 3D", "Cantidad", "Genero", dtsc,PlotOrientation.HORIZONTAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }        
        
        if(rb3D.isSelected() && rbCircular.isSelected()){
            DefaultPieDataset dtsc = new DefaultPieDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(tblConsultas.getValueAt(i, 0).toString(), Integer.parseInt(tblConsultas.getValueAt(i, 1).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart3D("Grafica de barras 3D", dtsc,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }        
        if(rb2D.isSelected() && rbCircular.isSelected()){
            DefaultPieDataset dtsc = new DefaultPieDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(tblConsultas.getValueAt(i, 0).toString(), Integer.parseInt(tblConsultas.getValueAt(i, 1).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart("Grafica de barras 3D", dtsc,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }           
        
        
    }//GEN-LAST:event_btnGraficarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGraficas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JComboBox<String> cmbConsultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb2D;
    private javax.swing.JRadioButton rb3D;
    private javax.swing.JRadioButton rbBarra;
    private javax.swing.JRadioButton rbCircular;
    private javax.swing.JTable tblConsultas;
    // End of variables declaration//GEN-END:variables
}
