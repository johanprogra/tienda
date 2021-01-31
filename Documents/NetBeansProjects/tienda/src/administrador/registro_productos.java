
package administrador;

import static administrador.menuadmin.ID;
import static administrador.ventas_admin.act1;
import static administrador.ventas_admin.observacion;
import funciones.autocompletar;
import funciones.comparacion;
import funciones.metodos;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import static tienda.factura.fact1;

public class registro_productos extends javax.swing.JFrame {

    public registro_productos() {
        initComponents();
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/imagenes/lapiz_registro.png"));
        ImageIcon imagen2=new ImageIcon(getClass().getResource("/imagenes/reg.png"));
        ImageIcon imagen3=new ImageIcon(getClass().getResource("/imagenes/most.png"));
        ImageIcon imagen4=new ImageIcon(getClass().getResource("/imagenes/act.png"));
        ImageIcon imagen5=new ImageIcon(getClass().getResource("/imagenes/bor.png"));
        ImageIcon imagen6=new ImageIcon(getClass().getResource("/imagenes/limpiar.png"));
        ImageIcon imagen7=new ImageIcon(getClass().getResource("/imagenes/dev.png"));
        
        Icon fon1=new ImageIcon(imagen1.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT));
        Icon fon2=new ImageIcon(imagen2.getImage().getScaledInstance(regi.getWidth(),regi.getHeight(),Image.SCALE_DEFAULT));
        Icon fon3=new ImageIcon(imagen3.getImage().getScaledInstance(mostrara.getWidth(),mostrara.getHeight(),Image.SCALE_DEFAULT));
        Icon fon4=new ImageIcon(imagen4.getImage().getScaledInstance(actualizar.getWidth(),actualizar.getHeight(),Image.SCALE_DEFAULT));
        Icon fon5=new ImageIcon(imagen5.getImage().getScaledInstance(borrar.getWidth(),borrar.getHeight(),Image.SCALE_DEFAULT));
        Icon fon6=new ImageIcon(imagen6.getImage().getScaledInstance(limpiar.getWidth(),limpiar.getHeight(),Image.SCALE_DEFAULT));
        Icon fon7=new ImageIcon(imagen7.getImage().getScaledInstance(dev.getWidth(),dev.getHeight(),Image.SCALE_DEFAULT));
        
        logo.setIcon(fon1);
        regi.setIcon(fon2);
        mostrara.setIcon(fon3);
        actualizar.setIcon(fon4);
        borrar.setIcon(fon5);
        limpiar.setIcon(fon6);
        dev.setIcon(fon7);
        
        this.repaint();
        this.setSize(new Dimension(1200,630)); 
        setLocationRelativeTo(null);
        
        SpinnerNumberModel nm=new SpinnerNumberModel();
        nm.setValue(1);
        nm.setMinimum(1);
        cuenta.setModel(nm);
        
        autocompletar auto=new autocompletar();
        auto.enviar_historial_productos(cod_producto, nombre, precio, talla, color, cuenta, observacion1);
        
        metodos metos=new metodos();
        metos.mostrar_producto_historial(result);
    }   

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cod_producto = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        talla = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cuenta = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacion1 = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        result = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        regi = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        dev = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        mostrara = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRO DE PRODUCTOS");

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cod_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cod_productoKeyTyped(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nombre producto");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Color");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Existencias");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Talla");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Codigo del producto");

        cuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cuenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cuentaStateChanged(evt);
            }
        });
        cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuentaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuentaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cuentaMouseReleased(evt);
            }
        });
        cuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cuentaKeyReleased(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Observación");

        observacion1.setColumns(20);
        observacion1.setRows(5);
        jScrollPane1.setViewportView(observacion1);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Precio");

        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cod_producto)
                    .addComponent(talla, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre)
                    .addComponent(color)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel27))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        result.setBackground(new java.awt.Color(153, 153, 153));
        result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_producto", "Nombre_producto", "Talla", "Existencias", "Observacion"
            }
        ));
        jScrollPane3.setViewportView(result);

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BORRAR");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(350, 0, 100, 17);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LIMPIAR");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(470, 0, 69, 17);

        regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiActionPerformed(evt);
            }
        });
        jPanel7.add(regi);
        regi.setBounds(10, 20, 91, 51);

        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel7.add(limpiar);
        limpiar.setBounds(460, 20, 83, 51);

        dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devActionPerformed(evt);
            }
        });
        jPanel7.add(dev);
        dev.setBounds(560, 20, 83, 51);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("REGRESAR");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(570, 0, 69, 17);

        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel7.add(borrar);
        borrar.setBounds(360, 20, 80, 50);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("BUSCAR PRODUCTO");
        jPanel7.add(jLabel28);
        jLabel28.setBounds(120, 0, 130, 17);

        mostrara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraraActionPerformed(evt);
            }
        });
        jPanel7.add(mostrara);
        mostrara.setBounds(140, 20, 80, 50);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("ACTUALIZAR");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(250, 0, 100, 17);

        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel7.add(actualizar);
        actualizar.setBounds(260, 20, 80, 50);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("REGISTRAR");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(20, 0, 73, 17);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cuentaStateChanged

    }//GEN-LAST:event_cuentaStateChanged

    private void cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentaMouseClicked

    }//GEN-LAST:event_cuentaMouseClicked

    private void cuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentaMousePressed

    }//GEN-LAST:event_cuentaMousePressed

    private void cuentaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuentaMouseReleased

    }//GEN-LAST:event_cuentaMouseReleased

    private void cuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuentaKeyReleased

    }//GEN-LAST:event_cuentaKeyReleased

    private void regiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiActionPerformed
    ID="1"; 
    comparacion comp=new comparacion();
    comp.validacion_campos_productos(result, cod_producto, nombre, talla, precio, color, cuenta, observacion1);
    
    }//GEN-LAST:event_regiActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
     fact1="";
     metodos met=new metodos();
     met.limpiar_productos(result, cod_producto, nombre, talla, precio, color, cuenta, observacion1);
    }//GEN-LAST:event_limpiarActionPerformed

    private void devActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devActionPerformed
        act1="";
        menuadmin e2=new menuadmin();
        e2.setVisible(true);
        dispose();
    }//GEN-LAST:event_devActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        try{
        if(act1.equals("actualiza1")){
           observacion=JOptionPane.showInputDialog("Digite el motivo para borrar el producto");
        if(observacion.equals("")){
            JOptionPane.showMessageDialog(null,"Por favor ingresar el motivo para borrar el producto");
        }else{
        metodos net=new metodos();
        net.borrar_producto(result);
        net.ingresar_observacion_productos();
        net.mostrar_producto_historial(result);
        }
           
       }else if(act1.equals("")){
           JOptionPane.showMessageDialog(null,"Para poder actualizar o borrar debe buscar el producto");
       }
        }catch(HeadlessException ex){
        
    }
        
    }//GEN-LAST:event_borrarActionPerformed

    private void mostraraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraraActionPerformed
    buscar_producto e2=new buscar_producto();
    e2.setVisible(true);
    dispose();
    }//GEN-LAST:event_mostraraActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        try{
        if(act1.equals("actualiza1")){
           observacion=JOptionPane.showInputDialog("Digite el motivo de la modificacion del producto");
        
        if(observacion1.equals("")){
            JOptionPane.showMessageDialog(null,"Por favor falta ingresar el motivo para la actalizacion del producto");
        }else{
           metodos net=new metodos();
           net.actualizar_producto(result, cod_producto, nombre, talla, precio, color, cuenta, observacion1);
           net.ingresar_observacion_productos();
           net.mostrar_producto_historial(result);
           }
           
       }else if(act1.equals("")){
           JOptionPane.showMessageDialog(null,"Para poder actualizar o borrar debe buscar el producto");
       }
        }catch(Exception ex){
        
    }
        
    }//GEN-LAST:event_actualizarActionPerformed

    private void cod_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_productoKeyTyped
     comparacion comp=new comparacion();
     comp.validacion_numeros(evt);
    }//GEN-LAST:event_cod_productoKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
     comparacion comp=new comparacion();
     comp.validacion_numeros(evt);
    }//GEN-LAST:event_precioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton borrar;
    private javax.swing.JTextField cod_producto;
    private javax.swing.JTextField color;
    public javax.swing.JSpinner cuenta;
    public javax.swing.JButton dev;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JButton limpiar;
    private javax.swing.JLabel logo;
    private javax.swing.JButton mostrara;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextArea observacion1;
    private javax.swing.JTextField precio;
    public javax.swing.JButton regi;
    private javax.swing.JTable result;
    private javax.swing.JTextField talla;
    // End of variables declaration//GEN-END:variables
}
