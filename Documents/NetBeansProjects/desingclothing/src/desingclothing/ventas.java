/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desingclothing;

import baseDatos.conexionMYSQL;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.Icon;

/**
 *
 * @author jl-im
 */
public class ventas extends javax.swing.JFrame {
    DefaultTableModel modelo= new DefaultTableModel();

    /**
     * Creates new form ventas
     */
    public ventas() {
        initComponents();
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/imagenes/reg.png"));
        ImageIcon imagen2=new ImageIcon(getClass().getResource("/imagenes/act.png"));
        ImageIcon imagen3=new ImageIcon(getClass().getResource("/imagenes/logo.png"));
        ImageIcon imagen4=new ImageIcon(getClass().getResource("/imagenes/bor.png"));
        ImageIcon imagen5=new ImageIcon(getClass().getResource("/imagenes/dev.png"));
        ImageIcon imagen6=new ImageIcon(getClass().getResource("/imagenes/most.png"));
        
        Icon fon1=new ImageIcon(imagen2.getImage().getScaledInstance(registrar.getWidth(),registrar.getHeight(),Image.SCALE_DEFAULT));
        Icon fon2=new ImageIcon(imagen1.getImage().getScaledInstance(registrar.getWidth(),registrar.getHeight(),Image.SCALE_DEFAULT));
        Icon fon3=new ImageIcon(imagen3.getImage().getScaledInstance(most.getWidth(),most.getHeight(),Image.SCALE_DEFAULT));
        Icon fon4=new ImageIcon(imagen1.getImage().getScaledInstance(regi.getWidth(),regi.getHeight(),Image.SCALE_DEFAULT));
        Icon fon5=new ImageIcon(imagen4.getImage().getScaledInstance(borrar.getWidth(),borrar.getHeight(),Image.SCALE_DEFAULT));
        Icon fon6=new ImageIcon(imagen5.getImage().getScaledInstance(dev.getWidth(),dev.getHeight(),Image.SCALE_DEFAULT));
        Icon fon7=new ImageIcon(imagen6.getImage().getScaledInstance(dev.getWidth(),dev.getHeight(),Image.SCALE_DEFAULT));
        actualizar.setIcon(fon1);
        registrar.setIcon(fon2);
        logo1.setIcon(fon3);
        regi.setIcon(fon4);
        borrar.setIcon(fon5);
        dev.setIcon(fon6);
        most.setIcon(fon7);
        this.repaint();
        this.setSize(new Dimension(680,675)); 
        setLocationRelativeTo(null);
        n.setEnabled(false);
        
        
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
         try {
		String query="SELECT * FROM `empleado`";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 String ns = rs.getString("nombres");
                 vendedor.addItem(ns);
              }
              
 
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
         try {
		String query="SELECT * FROM `cliente`";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 String ns1 = rs.getString("nombres");
                 String ns2 = rs.getString("apellidos");
                 cliente.addItem(ns1+" "+ns2);
              }
              
 
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        vendedor = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cliente = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bodega = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        n1 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        descuento = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        regi = new javax.swing.JButton();
        dev = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTable();
        most = new javax.swing.JButton();
        h = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("vendedor");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("N");

        vendedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..........." }));
        vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendedor))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("cliente");

        cliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".........." }));
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, Short.MAX_VALUE))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(220, 60, 400, 140);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("REGISTRO DE VENTAS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 10, 300, 40);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 60, 190, 140);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Codigo del producto");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Nombre producto");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Precio");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Bodega");

        bodega.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...........", "Bodega 1", "Bodega 2", "Bodega 3" }));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Numero de prendas");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("descuento");

        descuento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...........", "25", "50" }));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("%");

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel12.setText("REGISTRAR");

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel14.setText("REGRESAR");

        a.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        a.setText("ACTUALIZAR");

        regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiActionPerformed(evt);
            }
        });

        dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devActionPerformed(evt);
            }
        });

        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel15.setText("BORRAR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regi, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(dev, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(a)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dev, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        result.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", " CLIENTE", "PRODUCTO", "N ARTICULOS", "SUBTOTAL", "TOTAL"
            }
        ));
        result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(result);

        most.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(most, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(7, 7, 7)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(n1)
                            .addComponent(cd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(bodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(most, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(438, 438, 438))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 230, 660, 370);

        h.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(h);
        h.setBounds(20, 600, 10, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked
    int fila= result.getSelectedRow();
         
       if (fila<0)
       {
             JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
       }
       else
       {
           String id=result.getValueAt(fila,0).toString();
           String cod=result.getValueAt(fila,1).toString();
           String vendedor1=result.getValueAt(fila,2).toString();
           String cliente1=result.getValueAt(fila,3).toString();
           String producto=result.getValueAt(fila,4).toString();
           String np1=result.getValueAt(fila,5).toString();
           String precio=result.getValueAt(fila,6).toString();
           String bodega1=result.getValueAt(fila,7).toString();
           String prendas=result.getValueAt(fila,8).toString();
           Integer prendas1 = Integer.valueOf(prendas);
           String dest=result.getValueAt(fila,9).toString();
           vendedor.setSelectedItem(vendedor1);
           n.setText(cod);
           cliente.setSelectedItem(cliente1);
           cd.setText(producto);
           np.setText(np1);
           p.setText(precio);
           bodega.setSelectedItem(bodega1);
           n1.setValue(prendas1);
           descuento.setSelectedItem(dest);
           h.setText(id);
           
       }  
    }//GEN-LAST:event_resultMouseClicked

    private void devActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devActionPerformed
        menu_vendedor e2=new menu_vendedor();
        e2.setVisible(true);
        dispose();
    }//GEN-LAST:event_devActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        cliente e2=new cliente();
        e2.setVisible(true);
        dispose();
    }//GEN-LAST:event_registrarActionPerformed

    private void vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedorActionPerformed
    conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        String r = (String) vendedor.getSelectedItem();
        try {
		
        String query=("SELECT * FROM `empleado` WHERE `nombres` LIKE '"+r+"'");
        ps=cn.prepareStatement(query);
        rs=ps.executeQuery();
        
        while(rs.next())
              {
                 n.setText(rs.getString("ID_nit"));
              }
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }     
    }//GEN-LAST:event_vendedorActionPerformed

    private void regiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiActionPerformed
    conexionMYSQL mysql=new conexionMYSQL();
    Connection cn=mysql.Conectar();
    String Ssql="";
    String mensaje="";
    String cod_empleado,vendedor1,cliente1,cod_producto,nombre_producto,precio,bodega1,descuento1;
    cod_empleado=n.getText();
    vendedor1=(String) vendedor.getSelectedItem();
    cliente1=(String) cliente.getSelectedItem();
    cod_producto=cd.getText();
    nombre_producto=np.getText();
    precio=p.getText();
    bodega1=(String) bodega.getSelectedItem();
    int n_prendas = (int) n1.getValue();
    String prendas = String.valueOf(n_prendas);
    descuento1=(String) descuento.getSelectedItem();
    
    
    Ssql="INSERT INTO ventas(cod_empleado,vendedor,cliente,cod_prducto,nombre_producto,precio,bodega,n_prendas,descuento) VALUES(?,?,?,?,?,?,?,?,?)";
    mensaje="los datos se ingresado correctamente";
    
    
    try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,cod_empleado);
     pst.setString(2,vendedor1);
     pst.setString(3,cliente1);
     pst.setString(4,cod_producto);
     pst.setString(5,nombre_producto);
     pst.setString(6,precio);
     pst.setString(7,bodega1);
     pst.setString(8,prendas);
     pst.setString(9,descuento1);
     
     int n= pst.executeUpdate();
     if(n>0){
         JOptionPane.showMessageDialog(null, mensaje);
         mostrar();
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
    }
    }//GEN-LAST:event_regiActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
       conexionMYSQL mysql=new conexionMYSQL();
    Connection cn=mysql.Conectar();
    String sSQL = "";
    String cod,cod_empleado,vendedor1,cliente1,cod_producto,nombre_producto,precio,bodega1,descuento1;
    cod=h.getText();
    cod_empleado=n.getText();
    vendedor1=(String) vendedor.getSelectedItem();
    cliente1=(String) cliente.getSelectedItem();
    cod_producto=cd.getText();
    nombre_producto=np.getText();
    precio=p.getText();
    bodega1=(String) bodega.getSelectedItem();
    int n_prendas = (int) n1.getValue();
    String prendas = String.valueOf(n_prendas);
    descuento1=(String) descuento.getSelectedItem();

     sSQL = "UPDATE ventas SET cod_empleado=?,vendedor=?,cliente=?,cod_prducto=?,nombre_producto=?,precio=?,bodega=?,n_prendas=?,descuento=? WHERE ID_cod";
     String mensaje = "Los datos se han Modificado de Manera Satisfactoria...";

try
{
PreparedStatement pst = cn.prepareStatement(sSQL);
     pst.setString(1,cod_empleado);
     pst.setString(2,vendedor1);
     pst.setString(3,cliente1);
     pst.setString(4,cod_producto);
     pst.setString(5,nombre_producto);
     pst.setString(6,precio);
     pst.setString(7,bodega1);
     pst.setString(8,prendas);
     pst.setString(9,descuento1);
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
    }//GEN-LAST:event_actualizarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	try {
		String query="delete from ventas where ID_cod=?";
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
    }//GEN-LAST:event_borrarActionPerformed

    private void mostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostActionPerformed
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        try {
		String query="select * from ventas";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_cod","cod_empleado","vendedor","cliente","cod_prducto","nombre_producto","precio","bodega","n_prendas","descuento"
});
                            
              while(rs.next())
              {
                 modelo.addRow(new Object[]{rs.getString("ID_cod"),rs.getString("cod_empleado"),rs.getString("vendedor"),rs.getString("cliente"),rs.getString("cod_prducto"),rs.getString("nombre_producto"),rs.getString("precio"),rs.getString("bodega"),rs.getString("n_prendas"),rs.getString("descuento")}); 
              }
              
               result.setModel(modelo);
 
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_mostActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

   private void mostrar()
  {
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        try {
		String query="select * from ventas";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_cod","cod_empleado","vendedor","cliente","cod_prducto","nombre_producto","precio","bodega","n_prendas","descuento"
});
                            
              while(rs.next())
              {
                 modelo.addRow(new Object[]{rs.getString("ID_cod"),rs.getString("cod_empleado"),rs.getString("vendedor"),rs.getString("cliente"),rs.getString("cod_prducto"),rs.getString("nombre_producto"),rs.getString("precio"),rs.getString("bodega"),rs.getString("n_prendas"),rs.getString("descuento")}); 
              }
              
               result.setModel(modelo);
 
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null, ex.getMessage());
        } }
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
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JButton actualizar;
    private javax.swing.JComboBox bodega;
    private javax.swing.JButton borrar;
    private javax.swing.JTextField cd;
    private javax.swing.JComboBox cliente;
    private javax.swing.JComboBox descuento;
    private javax.swing.JButton dev;
    private javax.swing.JLabel h;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo1;
    private javax.swing.JButton most;
    private javax.swing.JTextField n;
    private javax.swing.JSpinner n1;
    private javax.swing.JTextField np;
    private javax.swing.JTextField p;
    private javax.swing.JButton regi;
    private javax.swing.JButton registrar;
    private javax.swing.JTable result;
    private javax.swing.JComboBox vendedor;
    // End of variables declaration//GEN-END:variables
}
