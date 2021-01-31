
package tienda;
import static administrador.ventas_admin.act1;
import static administrador.ventas_admin.busq;
import static administrador.ventas_admin.precio;
import funciones.hora;

import funciones.autocompletar;
import static funciones.autocompletar.existencias1;
import funciones.comparacion;
import funciones.metodos;
import static tienda.menuvendedor.guardar1;
import static tienda.menuvendedor.guardar2;
import static tienda.menuvendedor.guardar3;
import funciones.total;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.Icon;
import static tienda.factura.fact1;




public class ventas extends javax.swing.JFrame {
    DefaultTableModel modelo= new DefaultTableModel();
    public static String cambio="",descuentos="",pre="",n_prendas1="",iva1="",sub1="",netos="",asg="",fact="",cod_pro="",ver_extencias="",mensage="";
    
    public ventas() {
        
        initComponents();
        
        ImageIcon imagen1=new ImageIcon(getClass().getResource("/imagenes/logoini.jpg"));
        ImageIcon imagen2=new ImageIcon(getClass().getResource("/imagenes/reg.png"));
        ImageIcon imagen3=new ImageIcon(getClass().getResource("/imagenes/most.png"));
        ImageIcon imagen4=new ImageIcon(getClass().getResource("/imagenes/reg.png"));
        ImageIcon imagen5=new ImageIcon(getClass().getResource("/imagenes/dev.png"));
        ImageIcon imagen6=new ImageIcon(getClass().getResource("/imagenes/buscaravanzada.png"));
        ImageIcon imagen7=new ImageIcon(getClass().getResource("/imagenes/limpiar.png"));
        ImageIcon imagen8=new ImageIcon(getClass().getResource("/imagenes/vent.png"));

        Icon fon1=new ImageIcon(imagen1.getImage().getScaledInstance(logo1.getWidth(),logo1.getHeight(),Image.SCALE_DEFAULT));
        Icon fon2=new ImageIcon(imagen2.getImage().getScaledInstance(registrar.getWidth(),registrar.getHeight(),Image.SCALE_DEFAULT));
        Icon fon3=new ImageIcon(imagen3.getImage().getScaledInstance(most.getWidth(),most.getHeight(),Image.SCALE_DEFAULT));
        Icon fon4=new ImageIcon(imagen4.getImage().getScaledInstance(regi.getWidth(),regi.getHeight(),Image.SCALE_DEFAULT));
        Icon fon5=new ImageIcon(imagen5.getImage().getScaledInstance(dev.getWidth(),dev.getHeight(),Image.SCALE_DEFAULT));
        Icon fon6=new ImageIcon(imagen6.getImage().getScaledInstance(buscaralgo1.getWidth(),buscaralgo1.getHeight(),Image.SCALE_DEFAULT));
        Icon fon7=new ImageIcon(imagen7.getImage().getScaledInstance(limpiar.getWidth(),limpiar.getHeight(),Image.SCALE_DEFAULT));
        Icon fon8=new ImageIcon(imagen8.getImage().getScaledInstance(venta.getWidth(),venta.getHeight(),Image.SCALE_DEFAULT));
        
        logo1.setIcon(fon1);
        registrar.setIcon(fon2);
        most.setIcon(fon3);
        regi.setIcon(fon4);
        dev.setIcon(fon5);
        buscaralgo1.setIcon(fon6);
        buscaralgo2.setIcon(fon6);
        limpiar.setIcon(fon7);
        venta.setIcon(fon8);
        
        this.repaint();
        this.setSize(new Dimension(1150,730)); 
        setLocationRelativeTo(null);

        vendedor.enable(false);
        cliente1.enable(false);
        direccion1.enable(false);
        doc_identidad1.enable(false);
        telefono.enable(false);
        Subtotal.enable(false);
        iva.enable(false);
        neto.enable(false);
        np.enable(false);
        N_documento.enable(false);
        Ciudad.enable(false);
        p.enable(false);
        
        SpinnerNumberModel nm=new SpinnerNumberModel();
        nm.setValue(1);
        nm.setMinimum(1);
        n1.setModel(nm);
        
        comparacion comp=new comparacion();
        comp.comparar_asg(cliente1, direccion1, doc_identidad1, telefono, Ciudad, n_empleado, vendedor, N_documento, cd, p, np, n1, descuento, iva, Subtotal, neto);
        
       Timer tiempo1=new Timer(100, new ventas.horas());
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

        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bodega = new javax.swing.JComboBox();
        descuento = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        most = new javax.swing.JButton();
        n1 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        regi = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        dev = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTable();
        forma = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Subtotal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        iva = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        neto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscaralgo2 = new javax.swing.JButton();
        telefono = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cliente1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        doc_identidad1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        direccion1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        n_empleado = new javax.swing.JTextField();
        buscaralgo1 = new javax.swing.JButton();
        vendedor = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        N_documento = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Ciudad = new javax.swing.JTextField();
        horario = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        venta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("REGISTRO DE VENTAS");

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo del producto");

        cd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdActionPerformed(evt);
            }
        });
        cd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cdKeyTyped(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre producto");

        np.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        np.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        np.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bodega");

        bodega.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...........", "Bodega 1", "Bodega 2", "Bodega 3" }));

        descuento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "25", "50" }));
        descuento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                descuentoItemStateChanged(evt);
            }
        });
        descuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descuentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                descuentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                descuentoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descuentoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                descuentoMouseReleased(evt);
            }
        });
        descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuentoActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero de prendas");

        most.setBackground(new java.awt.Color(51, 153, 255));
        most.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostActionPerformed(evt);
            }
        });

        n1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        n1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                n1StateChanged(evt);
            }
        });
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                n1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                n1MouseReleased(evt);
            }
        });
        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n1KeyReleased(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("descuento");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("%");

        p.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p.setText("0");
        p.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(p))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(most, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(most, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBackground(new java.awt.Color(51, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("REGISTRAR");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(20, 0, 73, 17);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LIMPIAR");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(150, 0, 69, 17);

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
        limpiar.setBounds(130, 20, 83, 51);

        dev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devActionPerformed(evt);
            }
        });
        jPanel7.add(dev);
        dev.setBounds(240, 20, 83, 51);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("REGRESAR");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(250, 0, 69, 17);

        result.setBackground(new java.awt.Color(153, 153, 153));
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
        result.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                resultKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(result);

        forma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...........", "efectivo", "tarjeta credito", "tarjeta debito", "payU", "pse", "bono", "otro", " " }));
        forma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formaActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Forma de pago");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("IVA");

        Subtotal.setText("0");
        Subtotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Subtotal");

        iva.setText("0");
        iva.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Neto");

        neto.setText("0");
        neto.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(26, 26, 26)
                        .addComponent(neto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(neto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 64, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefono");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 70, -1));

        buscaralgo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscaralgo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaralgo2ActionPerformed(evt);
            }
        });
        jPanel1.add(buscaralgo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 64, 50));

        telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        telefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 150, 20));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cliente");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 68, -1));

        cliente1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cliente1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cliente1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(cliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 150, 20));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Numero de documento");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, -1));

        doc_identidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        doc_identidad1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        doc_identidad1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        doc_identidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doc_identidad1ActionPerformed(evt);
            }
        });
        jPanel1.add(doc_identidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, 20));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Dirección");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 70, -1));

        direccion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        direccion1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        direccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion1ActionPerformed(evt);
            }
        });
        jPanel1.add(direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 150, 20));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("numero de documento");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(20, 50, 150, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ciudad");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(370, 50, 60, 17);

        n_empleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n_empleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        n_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_empleadoActionPerformed(evt);
            }
        });
        n_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n_empleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n_empleadoKeyTyped(evt);
            }
        });
        jPanel3.add(n_empleado);
        n_empleado.setBounds(530, 10, 68, 20);

        buscaralgo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscaralgo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaralgo1ActionPerformed(evt);
            }
        });
        jPanel3.add(buscaralgo1);
        buscaralgo1.setBounds(680, 10, 64, 50);

        vendedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vendedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel3.add(vendedor);
        vendedor.setBounds(200, 10, 150, 20);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Vendedor");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(20, 10, 68, 17);

        N_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        N_documento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel3.add(N_documento);
        N_documento.setBounds(200, 50, 150, 20);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cod_vendedor");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(370, 10, 100, 17);

        Ciudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ciudad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel3.add(Ciudad);
        Ciudad.setBounds(450, 50, 150, 20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        horario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(venta, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(venta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(horario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(horario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void direccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion1ActionPerformed

    private void doc_identidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc_identidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doc_identidad1ActionPerformed

    private void cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliente1ActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void buscaralgo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaralgo2ActionPerformed
        busq="vendedor"; 
        buscarcliente e2=new buscarcliente();
        e2.setVisible(true);
        dispose();
    }//GEN-LAST:event_buscaralgo2ActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        busq="vendedor";        
        cliente e2=new cliente();
        e2.setVisible(true);
        dispose();
    }//GEN-LAST:event_registrarActionPerformed

    private void buscaralgo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaralgo1ActionPerformed
        busq="vendedor";
        mensage="mostrar";
        buscarempleado e2=new buscarempleado();
        e2.setVisible(true);
        dispose();
    }//GEN-LAST:event_buscaralgo1ActionPerformed

    private void n_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_empleadoKeyTyped
       comparacion comp=new comparacion();
       comp.validacion_numeros(evt);
    }//GEN-LAST:event_n_empleadoKeyTyped

    private void n_empleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_empleadoKeyReleased
        asg="";
        autocompletar auto=new autocompletar();
        auto.datosvendedor(n_empleado, vendedor, N_documento);
        guardar1=n_empleado.getText();
        guardar2=vendedor.getText();
        guardar3=N_documento.getText();
    }//GEN-LAST:event_n_empleadoKeyReleased

    private void n_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_empleadoActionPerformed

    }//GEN-LAST:event_n_empleadoActionPerformed

    private void formaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formaActionPerformed

    private void resultKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultKeyReleased

    }//GEN-LAST:event_resultKeyReleased

    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked

    }//GEN-LAST:event_resultMouseClicked

    private void devActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devActionPerformed
        act1="";
        fact="";
        menuvendedor e2=new menuvendedor();
        e2.setVisible(true);
        dispose();
    }//GEN-LAST:event_devActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        precio="nada";
        ver_extencias="";
        fact1="";
        mensage="nada";
        metodos mto=new metodos();
        mto.limpiar_venta(result, vendedor,N_documento,Ciudad, n_empleado, cliente1, direccion1, cd, doc_identidad1, telefono, np, p, bodega, n1, descuento, forma, iva, Subtotal, neto);
        
    }//GEN-LAST:event_limpiarActionPerformed

    private void regiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiActionPerformed
        String bo=(String)bodega.getSelectedItem();
        String fo=(String)forma.getSelectedItem();
        if(bo.equals("...........") || fo.equals("...........")){
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
        }else{
            comparacion comp=new comparacion();
            comp.completar_inventario(cd, p, n1, descuento, iva, Subtotal, neto);
            if(existencias1.equals("")){
            }else{
            metodos meto=new metodos();
            meto.ingresar(n_empleado, vendedor,N_documento,Ciudad, cliente1, doc_identidad1, direccion1, telefono, cd, np, p, bodega, n1, descuento, forma, iva, Subtotal, neto);
            meto.actualizar_existencias();
            meto.mostrar_ventas(result);
            autocompletar auto=new autocompletar();
            auto.enviar_cod(result);
            if(fact.equals("abrir")){
            factura fact1=new factura();
            fact1.setVisible(true);
            }
            
            }

        }

    }//GEN-LAST:event_regiActionPerformed

    private void n1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyReleased

    }//GEN-LAST:event_n1KeyReleased

    private void n1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseReleased

    }//GEN-LAST:event_n1MouseReleased

    private void n1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MousePressed

    }//GEN-LAST:event_n1MousePressed

    private void n1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseClicked

    }//GEN-LAST:event_n1MouseClicked

    private void n1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_n1StateChanged
        if(ver_extencias.equals("ver")){
            comparacion comp=new comparacion();
            comp.completar_inventario(cd, p, n1, descuento, iva, Subtotal, neto);
        }
        
    }//GEN-LAST:event_n1StateChanged

    private void mostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostActionPerformed
        busq="vendedor";
        cambio="uno";
        productos pro=new productos();
        pro.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_mostActionPerformed

    private void descuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descuentoActionPerformed

    private void descuentoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descuentoMouseReleased

    }//GEN-LAST:event_descuentoMouseReleased

    private void descuentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descuentoMousePressed

    }//GEN-LAST:event_descuentoMousePressed

    private void descuentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descuentoMouseExited

    }//GEN-LAST:event_descuentoMouseExited

    private void descuentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descuentoMouseEntered

    }//GEN-LAST:event_descuentoMouseEntered

    private void descuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descuentoMouseClicked

    }//GEN-LAST:event_descuentoMouseClicked

    private void descuentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_descuentoItemStateChanged
        total to=new total();
        to.total(p, n1, descuento, iva, Subtotal, neto);
    }//GEN-LAST:event_descuentoItemStateChanged

    private void cdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdKeyTyped
       comparacion comp=new comparacion();
       comp.validacion_numeros(evt);
    }//GEN-LAST:event_cdKeyTyped

    private void cdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdKeyReleased
        
        try{
            int veri;
            veri=Integer.parseInt(cd.getText());
            if(veri>0){
                autocompletar auto=new autocompletar();
                auto.busquedacodigo(cd, np, p);
            }else{
             JOptionPane.showMessageDialog(null,"Este campo esta vacio por favor digitar el precio del producto");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Este campo no admite letras por favor digitar el codigo en numeros");
        }

    }//GEN-LAST:event_cdKeyReleased

    private void cdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdKeyPressed

    }//GEN-LAST:event_cdKeyPressed

    private void cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdActionPerformed

    }//GEN-LAST:event_cdActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ciudad;
    private javax.swing.JTextField N_documento;
    public javax.swing.JTextField Subtotal;
    public javax.swing.JComboBox bodega;
    public javax.swing.JButton buscaralgo1;
    public javax.swing.JButton buscaralgo2;
    public javax.swing.JTextField cd;
    private javax.swing.JTextField cliente1;
    public javax.swing.JComboBox descuento;
    public javax.swing.JButton dev;
    private javax.swing.JTextField direccion1;
    private javax.swing.JTextField doc_identidad1;
    private javax.swing.JComboBox<String> forma;
    private javax.swing.JLabel horario;
    public javax.swing.JTextField iva;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton limpiar;
    private javax.swing.JLabel logo1;
    public javax.swing.JButton most;
    public javax.swing.JSpinner n1;
    private javax.swing.JTextField n_empleado;
    public javax.swing.JTextField neto;
    public javax.swing.JTextField np;
    private javax.swing.JTextField p;
    public javax.swing.JButton regi;
    public javax.swing.JButton registrar;
    public javax.swing.JTable result;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField vendedor;
    private javax.swing.JLabel venta;
    // End of variables declaration//GEN-END:variables


}
