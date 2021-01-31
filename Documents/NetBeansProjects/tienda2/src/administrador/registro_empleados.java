
package administrador;

import static administrador.menuadmin.ID;
import static administrador.ventas_admin.act1;
import static administrador.ventas_admin.actualidad_act;
import static administrador.ventas_admin.actualidad_bor;
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
import static tienda.factura.fact1;


public class registro_empleados extends javax.swing.JFrame {

    public registro_empleados() {
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
        this.setSize(new Dimension(1200,530)); 
        setLocationRelativeTo(null);
        
        autocompletar auto=new autocompletar();
        auto.enviar_empleado_admin(result, tipo_documento, documento, nombres, apellidos, direcccion, telefono);
        metodos net=new metodos();
        net.mostrar_empleados_actualizar(result);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        direccion = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        tipo_documento = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        documento = new javax.swing.JTextField();
        j = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        j1 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        j2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        direcccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        result = new javax.swing.JTable();
        logo = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Bienvenido al registro de empleados");

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        direccion.setBackground(new java.awt.Color(51, 153, 255));
        direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Tipo de documento");

        tipo_documento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "............", "C.C", "T.I", "P.E.P", "EXTRANJERA", "OTRO" }));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Numero de documento");

        documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                documentoKeyTyped(evt);
            }
        });

        j.setBackground(new java.awt.Color(255, 255, 255));
        j.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j.setForeground(new java.awt.Color(255, 255, 255));
        j.setText("Apellidos");

        j1.setBackground(new java.awt.Color(255, 255, 255));
        j1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 255, 255));
        j1.setText("Nombres");

        j2.setBackground(new java.awt.Color(255, 255, 255));
        j2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 255));
        j2.setText("Telefono");

        j3.setBackground(new java.awt.Color(255, 255, 255));
        j3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j3.setForeground(new java.awt.Color(255, 255, 255));
        j3.setText("Dirección");

        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout direccionLayout = new javax.swing.GroupLayout(direccion);
        direccion.setLayout(direccionLayout);
        direccionLayout.setHorizontalGroup(
            direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, direccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(direccionLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(direccionLayout.createSequentialGroup()
                        .addGroup(direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombres)
                            .addComponent(direcccion, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(direccionLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(direccionLayout.createSequentialGroup()
                        .addGroup(direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidos)
                            .addComponent(telefono))))
                .addGap(19, 19, 19))
        );
        direccionLayout.setVerticalGroup(
            direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(direccionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tipo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j1))
                .addGap(18, 18, 18)
                .addGroup(direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j2)
                    .addComponent(j3)
                    .addComponent(direcccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        jLabel28.setText("BUSCAR EMPLEADO");
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

        result.setBackground(new java.awt.Color(153, 153, 153));
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id_cod", "nombres", "apellidos", "telefono"
            }
        ));
        jScrollPane2.setViewportView(result);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiActionPerformed
        ID="1";  
        comparacion comp=new comparacion();
        comp.validacion_de_campos_empleados(result, tipo_documento, documento, nombres, apellidos, direcccion, telefono);
    }//GEN-LAST:event_regiActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        fact1="";
        metodos met=new metodos();
        met.limpiar_empleados(result, tipo_documento, documento, nombres, apellidos, direcccion, telefono);
    }//GEN-LAST:event_limpiarActionPerformed

    private void devActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devActionPerformed
        act1="";
        menuadmin e2=new menuadmin();
        e2.setVisible(true);
        dispose();
    }//GEN-LAST:event_devActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        actualidad_act="";
        try{
          if(act1.equals("actualiza1")){
           
           observacion=JOptionPane.showInputDialog(null,"Digite el motivo para borrar el empleado");
        
        if(observacion.equals("")){
        JOptionPane.showMessageDialog(null,"Por favor ingresar el motivo el motivo para borrar el empleado");
        }else{
       metodos met=new metodos();
        met.borrar_empleado(result);
        met.ingresar_observacion_empleados();
           }
           
       }else if(act1.equals("")){
           JOptionPane.showMessageDialog(null,"Para poder actualizar o borrar debe buscar el empleado");
       } 
       }catch(HeadlessException ex){
           
       }
    }//GEN-LAST:event_borrarActionPerformed

    private void mostraraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraraActionPerformed
        buscar_empleado e2=new buscar_empleado();
        e2.setVisible(true);
        dispose();
    }//GEN-LAST:event_mostraraActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
      actualidad_bor="";
        try{
          if(act1.equals("actualiza1")){
           
           observacion=JOptionPane.showInputDialog(null,"Digite el motivo de la modificacion del empleado");
        
        if(observacion.equals("")){
        JOptionPane.showMessageDialog(null,"Por favor ingresar el motivo para la actualización del empleado");
        }else{
           metodos net=new metodos();
           net.actualizar_empleado(result, tipo_documento, documento, nombres, apellidos, direcccion, telefono);
           net.ingresar_observacion_empleados();
           net.mostrar_empleados_actualizar(result);
           
           }
           
       }else if(act1.equals("")){
           JOptionPane.showMessageDialog(null,"Para poder actualizar o borrar debe buscar el empleado");
       } 
       }catch(HeadlessException ex){
           
       }
               
    }//GEN-LAST:event_actualizarActionPerformed

    private void documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentoKeyTyped
       comparacion comp=new comparacion();
       comp.validacion_numeros(evt);
    }//GEN-LAST:event_documentoKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
       comparacion comp=new comparacion();
       comp.validacion_numeros(evt);
    }//GEN-LAST:event_telefonoKeyTyped

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
            java.util.logging.Logger.getLogger(registro_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton borrar;
    public javax.swing.JButton dev;
    private javax.swing.JTextField direcccion;
    private javax.swing.JPanel direccion;
    private javax.swing.JTextField documento;
    private javax.swing.JLabel j;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JButton limpiar;
    private javax.swing.JLabel logo;
    private javax.swing.JButton mostrara;
    private javax.swing.JTextField nombres;
    public javax.swing.JButton regi;
    private javax.swing.JTable result;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipo_documento;
    // End of variables declaration//GEN-END:variables
}
