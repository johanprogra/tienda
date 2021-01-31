
package tienda;

import funciones.autocompletar;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class factura extends javax.swing.JFrame implements Printable{
public static String fact1="";
    public factura() {
        initComponents();
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/imagenes/logoini.jpg"));
        Icon fon1=new ImageIcon(imagen1.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT));
        logo.setIcon(fon1);
        this.repaint();
        this.setSize(new Dimension(620,740)); 
        setLocationRelativeTo(null);
        autocompletar auto=new autocompletar();
        auto.enviar_factura(n_factura1, n_fecha1, c_cliente2, n_nombre, n_direccion1, n_telefono1, n_vendedor2, n_identidad, c_producto1, n_producto1, und1, v_p, forma1, ssubtotal2, decuento1, neto1, n_ciudad1, forma1, ssubtotal2, iva);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        impresion1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        v_p = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        forma1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        n_nombre = new javax.swing.JLabel();
        n_factura1 = new javax.swing.JLabel();
        n_fecha1 = new javax.swing.JLabel();
        n_identidad = new javax.swing.JLabel();
        c_cliente2 = new javax.swing.JLabel();
        n_direccion1 = new javax.swing.JLabel();
        n_ciudad1 = new javax.swing.JLabel();
        n_telefono1 = new javax.swing.JLabel();
        neto1 = new javax.swing.JLabel();
        n_vendedor2 = new javax.swing.JLabel();
        c_producto1 = new javax.swing.JLabel();
        n_producto1 = new javax.swing.JLabel();
        und1 = new javax.swing.JLabel();
        decuento1 = new javax.swing.JLabel();
        ssubtotal2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        impresion1.setBackground(new java.awt.Color(255, 255, 255));
        impresion1.setForeground(new java.awt.Color(255, 255, 255));
        impresion1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setBackground(new java.awt.Color(153, 153, 153));
        impresion1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 100));

        v_p.setBackground(new java.awt.Color(153, 153, 153));
        v_p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        impresion1.add(v_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 150, 30));

        iva.setBackground(new java.awt.Color(153, 153, 153));
        impresion1.add(iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 140, 30));

        forma1.setBackground(new java.awt.Color(153, 153, 153));
        impresion1.add(forma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 90, 30));

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Nombre del producto");
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setEnabled(false);
        impresion1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 180, 30));

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Numero de factura");
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setEnabled(false);
        impresion1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        jTextField3.setBackground(new java.awt.Color(153, 153, 153));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Fecha");
        jTextField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField3.setEnabled(false);
        impresion1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        jTextField4.setBackground(new java.awt.Color(153, 153, 153));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Nombre del vendedor");
        jTextField4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField4.setEnabled(false);
        impresion1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 180, 30));

        jTextField5.setBackground(new java.awt.Color(153, 153, 153));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Dirección");
        jTextField5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField5.setEnabled(false);
        impresion1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        jTextField6.setBackground(new java.awt.Color(153, 153, 153));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Ciudad");
        jTextField6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField6.setEnabled(false);
        impresion1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 30));

        jTextField7.setBackground(new java.awt.Color(153, 153, 153));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Doc identidad cliente");
        jTextField7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField7.setEnabled(false);
        impresion1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, 30));

        jTextField9.setBackground(new java.awt.Color(153, 153, 153));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Doc identidad vendedor");
        jTextField9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField9.setEnabled(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        impresion1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 170, 30));

        jTextField10.setBackground(new java.awt.Color(153, 153, 153));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Telefono");
        jTextField10.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField10.setEnabled(false);
        impresion1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 30));

        jTextField11.setBackground(new java.awt.Color(153, 153, 153));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Subtotal");
        jTextField11.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField11.setEnabled(false);
        impresion1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 300, 30));

        jTextField12.setBackground(new java.awt.Color(153, 153, 153));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Nombre");
        jTextField12.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField12.setEnabled(false);
        impresion1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 80, 30));

        jTextField13.setBackground(new java.awt.Color(153, 153, 153));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Unidades");
        jTextField13.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField13.setEnabled(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        impresion1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 130, 30));

        jTextField14.setBackground(new java.awt.Color(153, 153, 153));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Precio V.P");
        jTextField14.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField14.setEnabled(false);
        impresion1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 150, 30));

        jTextField15.setBackground(new java.awt.Color(153, 153, 153));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Cod producto");
        jTextField15.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField15.setEnabled(false);
        impresion1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 90, 30));

        jTextField16.setBackground(new java.awt.Color(153, 153, 153));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("Neto pagado");
        jTextField16.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField16.setEnabled(false);
        impresion1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 160, 30));

        jTextField17.setBackground(new java.awt.Color(153, 153, 153));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Forma de pago");
        jTextField17.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField17.setEnabled(false);
        impresion1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 110, 30));

        jTextField18.setBackground(new java.awt.Color(153, 153, 153));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("Descuento");
        jTextField18.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField18.setEnabled(false);
        impresion1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 80, 30));

        jTextField19.setBackground(new java.awt.Color(153, 153, 153));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("IVA");
        jTextField19.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField19.setEnabled(false);
        impresion1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 80, 30));

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        impresion1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 100, 40));
        impresion1.add(n_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 200, 30));
        impresion1.add(n_factura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 30));
        impresion1.add(n_fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, 30));

        n_identidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        impresion1.add(n_identidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 170, 30));
        impresion1.add(c_cliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 110, 30));
        impresion1.add(n_direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 340, 30));
        impresion1.add(n_ciudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, 30));
        impresion1.add(n_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 100, 30));
        impresion1.add(neto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 160, 30));

        n_vendedor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        impresion1.add(n_vendedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 180, 30));

        c_producto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        impresion1.add(c_producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 90, 30));

        n_producto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        impresion1.add(n_producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 180, 30));

        und1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        impresion1.add(und1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 130, 30));
        impresion1.add(decuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 160, 30));

        ssubtotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        impresion1.add(ssubtotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(impresion1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(impresion1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            boolean top=job.printDialog();
            if(top){

                job.print();
            }
        }catch (HeadlessException | PrinterException ex){
            JOptionPane.showMessageDialog(null,"no funciona");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
       
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        
    }//GEN-LAST:event_jTextField9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c_cliente2;
    private javax.swing.JLabel c_producto1;
    private javax.swing.JLabel decuento1;
    private javax.swing.JLabel forma1;
    private javax.swing.JPanel impresion1;
    private javax.swing.JLabel iva;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel n_ciudad1;
    private javax.swing.JLabel n_direccion1;
    private javax.swing.JLabel n_factura1;
    private javax.swing.JLabel n_fecha1;
    private javax.swing.JLabel n_identidad;
    private javax.swing.JLabel n_nombre;
    private javax.swing.JLabel n_producto1;
    private javax.swing.JLabel n_telefono1;
    private javax.swing.JLabel n_vendedor2;
    private javax.swing.JLabel neto1;
    private javax.swing.JLabel ssubtotal2;
    private javax.swing.JLabel und1;
    private javax.swing.JLabel v_p;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics Graphics, PageFormat PageFormat, int pageIndex) throws PrinterException {
        
        if(pageIndex==0){
            Graphics2D Graphics2d=(Graphics2D) Graphics;
            Graphics2d.drawString("1", 100,100);
            impresion1.printAll(Graphics);
            return PAGE_EXISTS;
        }else{
            return NO_SUCH_PAGE;
        }
        
        
        
       
    }


}
