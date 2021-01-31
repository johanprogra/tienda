
package funciones;

import static administrador.actualizacion_empleados.fin;
import static administrador.actualizacion_empleados.id1;
import static administrador.actualizacion_empleados.id2;
import static administrador.actualizacion_empleados.ini;
import baseDatos.conexionMYSQL;
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static tienda.ventas.asg;
import static tienda.factura.fact1;
import static administrador.cambio_clave_vendedor.emple;
import static administrador.menu_registro_actualizaciones.nombre_actu;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class autocompletar {
        DefaultTableModel modelo= new DefaultTableModel();
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        
        public static String idl="",nombrecli="",apellidocli="",direccion="",documento="",telefono1="",ciudad="",doumento_emple="",nombreemple="",apellidoemple=""
        ,cod_producto1="",nombre_producto="",precio1="",ns1="",ns2="",ns3="",ns4="",ns5="",ns6="",ns7="",ns8="",ns9="",ns10="",
                ns11="",ns12="",ns13="",ns14="",ns15="",ns16="",ns17="",ns18="",ns19="",existencias1="",dia=""
                ;
        
    public void autocompletarcliente(JTextField buscar,JTable result){

        
        String r = buscar.getText();
           try {
		String query="SELECT `tipo_documento`,`cedula`,`nombres`,`apellidos`,`direccion`,`ciudad`,`celular` FROM cliente WHERE `tipo_documento` LIKE '%"+r+"%' OR `cedula` LIKE '%"+r+"%' OR `nombres` LIKE '%"+r+"%' OR `apellidos` LIKE '%"+r+"%' OR `direccion` LIKE '%"+r+"%' OR `ciudad` LIKE '%"+r+"%' OR `celular` LIKE '%"+r+"%'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"tipo_documento","cedula","nombres","apellidos","direccion","ciudad","celular"        
              });
                            
              while(rs.next())
              {
                 
                 modelo.addRow(new Object[]{rs.getString("tipo_documento"),rs.getString("cedula"),rs.getString("nombres"),rs.getString("apellidos"),rs.getString("direccion"),rs.getString("ciudad"),rs.getString("celular")}); 
                
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
       }
    
    public void autocompletarempleado(JTextField buscar,JTable result){

        
        String r = buscar.getText();
           try {
		String query="SELECT `ID_nit`,`tipo_documento`,`documento`,`nombres`,`apellidos`,`direccion`,`telefono` FROM empleado WHERE `ID_nit` LIKE '%"+r+"%' OR tipo_documento LIKE '%"+r+"%' OR documento LIKE '%"+r+"%' OR `nombres` LIKE '%"+r+"%' OR `apellidos` LIKE '%"+r+"%' OR `direccion` LIKE '%"+r+"%' OR `telefono` LIKE '%"+r+"%'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_nit","tipo_documento","documento","nombres","apellidos","direccion","telefono"         
              });
                            
              while(rs.next())
              {
                 
                 modelo.addRow(new Object[]{rs.getString("ID_nit"),rs.getString("tipo_documento"),rs.getString("documento"),rs.getString("nombres"),rs.getString("apellidos"),rs.getString("direccion"),rs.getString("telefono")}); 
                
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
       }
    public void autocompletarproductos(JTextField buscar,JTable result){
         
        String r = buscar.getText();
           try {
		String query="SELECT `cod_nit`, `cod_produtos`, `nombre_producto`, `precio`, `talla`, `color`, `existencias`, `fecha de ingreso` FROM `productos` WHERE `cod_nit` LIKE '%"+r+"%' OR cod_produtos LIKE '%"+r+"%' OR nombre_producto LIKE '%"+r+"%' OR `precio` LIKE '%"+r+"%' OR `talla` LIKE '%"+r+"%' OR `color` LIKE '%"+r+"%' OR `existencias` LIKE '%"+r+"%' OR `fecha de ingreso` LIKE '%"+r+"%'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"cod_nit","cod_produtos","nombre_producto","precio","talla","color","existencias","fecha de ingreso"         
              });
                            
              while(rs.next())
              {
                 
                 modelo.addRow(new Object[]{rs.getString("cod_nit"),rs.getString("cod_produtos"),rs.getString("nombre_producto"),rs.getString("precio"),rs.getString("talla"),rs.getString("color"),rs.getString("existencias"),rs.getString("fecha de ingreso")}); 
                
              }
              
             result.setModel(modelo);
             asg="total";  
	}  
           
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
    }
    public void autocompletar_cambios_empleados(ActionEvent e,JButton siguiente,JDateChooser desde,JDateChooser hasta,JRadioButton act,JRadioButton bor,JLabel usuario,JLabel observacion1) throws SQLException {   
      String de,fu,cambio="",obser="",query="",usu="";
      SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
      de=format1.format(desde.getDate());
      metodos met=new metodos();
      met.busqueda_exacta(hasta);
      fu=dia;
      
      if(act.isSelected()){
          cambio="observacion_actualizacion";
      }else if(bor.isSelected()){
          cambio="observacion_borrado";
      }
        query=("SELECT `id_ob`,`usuario`,`"+cambio+"` FROM `"+nombre_actu+"` WHERE `fecha` between '"+de+"' AND '"+fu+"'");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.next()){
            usu= rs.getString("usuario");
            obser = rs.getString(cambio);
         }
        if(rs.first()){
            id1=rs.getString("id_ob");
            ini=rs.getString("id_ob");
         }
        if(rs.last()){
            id2=rs.getString("id_ob");
            fin=rs.getString("id_ob");
         }
        if(obser.equals("")){
           autocompletar auto=new autocompletar();
           auto.button_seguir(e, siguiente, desde, hasta, act, bor, usuario, observacion1);
        }else{
         usuario.setText(usu);
         observacion1.setText(obser);
        }
         
        
        
    }
    public void button_seguir(ActionEvent e,JButton siguiente,JDateChooser desde,JDateChooser hasta,JRadioButton act,JRadioButton bor,JLabel usuario,JLabel observacion1) throws SQLException {                                          
      String de,fu,cambio="",obser,query,usu;
      SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
      de=format1.format(desde.getDate());
      metodos met=new metodos();
      met.busqueda_exacta(hasta);
      fu=dia;
      
      if(act.isSelected()){
          cambio="observacion_actualizacion";
      }else if(bor.isSelected()){
          cambio="observacion_borrado";
      }
      
        if (e.getSource()==siguiente) {
        int fin1,cont;
        cont=Integer.parseInt(id1);
        fin1=Integer.parseInt(fin);
        if(cont>=fin1){
        cont--;
        id1=String.valueOf(cont);
        JOptionPane.showMessageDialog(null,"No hay mas informacion que mostrar");
        
        }else{
        cont++;
        id1=String.valueOf(cont);
        query=("SELECT `id_ob`,`usuario`,`"+cambio+"` FROM `"+nombre_actu+"` WHERE `fecha` between '"+de+"' AND '"+fu+"' AND `id_ob`="+id1+"");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.next()){
            usu= rs.getString("usuario");
            obser = rs.getString(cambio);
            
         if(obser.equals("")){
           autocompletar auto=new autocompletar();
           auto.button_seguir(e, siguiente, desde, hasta, act, bor, usuario, observacion1);
        }else{
         usuario.setText(usu);
         observacion1.setText(obser);
        }
        }}}
         }
    public void button_atras(ActionEvent e,JButton atras,JDateChooser desde,JDateChooser hasta,JRadioButton act,JRadioButton bor,JLabel usuario,JLabel observacion1) throws SQLException {                                          
      String de,fu,cambio="",obser,query,usu;
      SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
      de=format1.format(desde.getDate());
      metodos met=new metodos();
      met.busqueda_exacta(hasta);
      fu=dia;
      
     if(act.isSelected()){
          cambio="observacion_actualizacion";
      }else if(bor.isSelected()){
          cambio="observacion_borrado";
      }
        if (e.getSource()==atras) {
        int ini1,cont;
        cont=Integer.parseInt(id1);
        ini1=Integer.parseInt(ini);
        
        if(cont<=ini1){
        JOptionPane.showMessageDialog(null,"No hay mas informacion que mostrar");
        cont++;
        id1=String.valueOf(cont);
        }else{
        cont--;
        id1=String.valueOf(cont);
        query=("SELECT `id_ob`,`usuario`,`"+cambio+"` FROM `"+nombre_actu+"` WHERE `fecha` between '"+de+"' AND '"+fu+"' AND `id_ob`="+id1+"");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.next()){
            usu= rs.getString("usuario");
            obser = rs.getString(cambio);
            
        
        if(obser.equals("")){
           autocompletar auto=new autocompletar();
           auto.button_atras(e, atras, desde, hasta, act, bor, usuario, observacion1);
        }else{
         usuario.setText(usu);
         observacion1.setText(obser);
        }
        }}}
         }
    
    
    public void enviarcliente(JTable result){
           try{
           int fila=result.getSelectedRow();
           if(fila<0){
           JOptionPane.showMessageDialog(null,"No ha seleccionado ningun fila");
           }else{
           documento=(result.getValueAt(fila,1).toString());  
           nombrecli=(result.getValueAt(fila,2).toString());
           apellidocli=result.getValueAt(fila,3).toString();
           direccion=result.getValueAt(fila,4).toString();
           ciudad=result.getValueAt(fila,5).toString();
           telefono1=result.getValueAt(fila,6).toString();
           
           }
           }catch (HeadlessException e){
               JOptionPane.showMessageDialog(null,"Por favor realizar la busqueda");
           }  
    }
        public void enviarempleado(JTable result){
           try{
           int fila=result.getSelectedRow();
           if(fila<0){
           JOptionPane.showMessageDialog(null,"No ha seleccionado ningun fila");
           }else{
           idl=(result.getValueAt(fila,0).toString());
           doumento_emple=(result.getValueAt(fila,2).toString());
           nombreemple=(result.getValueAt(fila,3).toString());
           apellidoemple=result.getValueAt(fila,4).toString();
           
           }
           }catch (HeadlessException e){
               JOptionPane.showMessageDialog(null,"Por favor realiza la busqueda");
           }  
    }
        public void enviar_cod_empleado_busqueda_admin(JTable result){
            
            fact1=String.valueOf(result.getValueAt(result.getSelectedRow(),0));
        }
        public void enviarproductos(JTable result){
           try{
           int fila=result.getSelectedRow();
           if(fila<0){
           JOptionPane.showMessageDialog(null,"No ha seleccionado ningun fila");
           }else{
           cod_producto1=(result.getValueAt(fila,1).toString()); 
           nombre_producto=(result.getValueAt(fila,2).toString());
           precio1=result.getValueAt(fila,3).toString();
           
           }
           }catch (HeadlessException e){
               JOptionPane.showMessageDialog(null,"Por favor realiza la busqueda");
           }  
        }
   
        
        public void busquedacodigo(JTextField cd,JTextField np,JTextField p){
             try{
              String r = cd.getText();
              String query="SELECT * FROM `productos` WHERE `cod_produtos` LIKE '"+r+"'";
	      ps=cn.prepareStatement(query);
	      rs=ps.executeQuery();
              while(rs.next())
              {
                 
                 String pro = rs.getString("nombre_producto");
                 String pre = rs.getString("precio");
                 np.setText(pro);
                 p.setText(pre);
              }
        }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
        }
        
    
    public void datosvendedor(JTextField n_empleado,JTextField vendedor,JTextField N_documento){
        try{
              String r = n_empleado.getText();
              String query="SELECT `ID_nit`,`documento`,`nombres`,`apellidos` FROM empleado WHERE `ID_nit` LIKE '"+r+"' OR `documento` LIKE '"+r+"' OR `nombres` LIKE '"+r+"' OR `apellidos` LIKE '%"+r+"%'";
	      ps=cn.prepareStatement(query);
	      rs=ps.executeQuery();
              while(rs.next())
              {
                 String nombreem = rs.getString("nombres");
                 String apellidoem = rs.getString("apellidos");
                 String documentos= rs.getString("documento");
                 vendedor.setText(nombreem+" "+apellidoem);
                 N_documento.setText(documentos);
                 
              }
        }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
    }
    public void completar_usuario_empleado(JTextField usuario_actual,JTextField clave_actual){
        if(emple.equals("")){
            
        }else{
        String usu="",con="";
        try{
              String query="SELECT * FROM `registro_vendedor` WHERE ID_registro='"+emple+"'";
	      ps=cn.prepareStatement(query);
	      rs=ps.executeQuery();
              while(rs.next())
              {
                 usu = rs.getString("usuario");
                 con = rs.getString("contraseña");
               }
        }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
        usuario_actual.setText(usu);
        clave_actual.setText(con);
    }}
    
    public void enviar_usuario_empleado(JTable result){
        emple=String.valueOf(result.getValueAt(result.getSelectedRow(),0));
    }
    
   public void enviar_cod(JTable result){
   for (int i = 0; i < result.getRowCount(); i++) {
   fact1=String.valueOf(result.getValueAt(i, 0));
 }}
   
   public void seleccionar_enviar_factura(JTable result){
       fact1=String.valueOf(result.getValueAt(result.getSelectedRow(),0));
    } 
   
   public void enviar_venta(JTable result,JTextField n_empleado,JTextField vendedor,JTextField N_documento,JTextField Ciudad,
    JTextField cliente,JTextField doc_identidad1,JTextField direccion1,JTextField telefono,JTextField cd,JTextField np
   ,JTextField p,JComboBox bodega,JSpinner n1,JComboBox descuento,JComboBox forma){
     
         if(fact1.equals("")){
             
         }else{
             String ns1="",ns2="",ns3="",ns4="",ns5="",ns6="",ns7="",ns8="",ns9="",ns10=""
                 ,ns11="",ns12="",ns13="",ns14="",ns15="",ns16="",ns17="",ns18="";
         try { 
		String query="SELECT * FROM `ventas` WHERE `ID_cod`='"+fact1+"'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 ns1 = rs.getString("cod_empleado");
                 ns2 = rs.getString("doc_empleado");
                 ns3 = rs.getString("ciudad");
                 ns4 = rs.getString("vendedor");
                 ns5 = rs.getString("cliente");
                 ns6 = rs.getString("n_documento_cliente");
                 ns7 = rs.getString("direccion_cliente");
                 ns8 = rs.getString("telefono_cliente");
                 ns9 = rs.getString("cod_producto");
                 ns10 = rs.getString("nombre_producto");
                 ns11 = rs.getString("precio");
                 ns12 = rs.getString("bodega");
                 ns13 = rs.getString("n_prendas");
                 ns14 = rs.getString("descuento");
                 ns15 = rs.getString("pago");
                 ns16 = rs.getString("iva");
                 ns17 = rs.getString("subtotal");
                 ns18 = rs.getString("neto");
              }
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
             
        n_empleado.setText(ns1);
        vendedor.setText(ns4);
        N_documento.setText(ns2);
        Ciudad.setText(ns3);
        cliente.setText(ns5);
        doc_identidad1.setText(ns6);
        direccion1.setText(ns7);
        telefono.setText(ns8);
        cd.setText(ns9);
        np.setText(ns10);
        p.setText(ns11);
        bodega.setSelectedItem(ns12);
        int n_p=Integer.parseInt(ns13);
        n1.setValue(n_p);
        descuento.setSelectedItem(ns14);
        forma.setSelectedItem(ns15);
         }}
   
    public void enviar_factura(JLabel n_factura1,JLabel n_fecha1,JLabel c_cliente2,JLabel n_nombre,
    JLabel n_direccion1, JLabel n_telefono1, JLabel n_vendedor2, JLabel n_identidad, JLabel c_producto1,
    JLabel n_producto1,JLabel und1,JLabel v_p,JLabel forma,JLabel ssubtotal1,JLabel descuento,JLabel neto1,
    JLabel n_ciudad1,JLabel forma1,JLabel ssubtotal2,JLabel iva
            ){
       
        try {
		String query="SELECT * FROM `ventas` WHERE `ID_cod`= "+fact1+"";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 ns1 = rs.getString("ID_cod"); 
                 ns2 = rs.getString("fecha");
                 ns3 = rs.getString("n_documento_cliente");
                 ns5 = rs.getString("direccion_cliente");
                 ns6 = rs.getString("ciudad");
                 ns7 = rs.getString("telefono_cliente");
                 ns8 = rs.getString("doc_empleado");
                 ns9 = rs.getString("vendedor");
                 ns10 = rs.getString("cod_producto");
                 ns11 = rs.getString("nombre_producto");
                 ns12 = rs.getString("n_prendas");
                 ns13 = rs.getString("pago");
                 ns14 = rs.getString("subtotal");
                 ns15 = rs.getString("descuento");
                 ns16 = rs.getString("iva");
                 ns17 = rs.getString("neto");
                 ns18 = rs.getString("cliente");
                 ns19 = rs.getString("cod_empleado");
              }
             DecimalFormat df = new DecimalFormat("$ #,###.###");
             int vp,ssub,undd;
             String c[] = ns14.split(" ", 2);
             String ac = c[1];
             String valor1 = ac.replace(".","").replace(",", ".");
             ssub=Integer.parseInt(valor1);
             
             undd=Integer.parseInt(ns12);
             vp=ssub/undd;
             
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format1=new SimpleDateFormat("EEEE  dd MMMMM YYYY");
        String nuevo;
        Date dia1=null;
        try{
        dia1=format.parse(ns2);    
        }catch(ParseException ParseException){
            
        }
        nuevo=format1.format(dia1);
             
             n_factura1.setText("77777"+ns1);
             n_fecha1.setText(nuevo);
             c_cliente2.setText(ns3);
             n_direccion1.setText(ns5);
             n_ciudad1.setText(ns6);
             n_telefono1.setText(ns7);
             n_vendedor2.setText(ns9);
             n_identidad.setText(ns8);
             c_producto1.setText(ns10);
             n_producto1.setText(ns11);
             und1.setText(ns12);
             v_p.setText(df.format(vp));
             forma1.setText(ns13);
             ssubtotal2.setText(ns14);
             descuento.setText(ns15+" %");
             iva.setText(ns16);
             neto1.setText(ns17);
             n_nombre.setText(ns18);
             
              
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
        
    }
    public void enviar_a_excel(){
        
        try {
		String query="SELECT * FROM `ventas` WHERE `ID_cod`= "+fact1+"";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 ns1 = rs.getString("ID_cod"); 
                 ns2 = rs.getString("fecha");
                 ns3 = rs.getString("n_documento_cliente");
                 ns5 = rs.getString("direccion_cliente");
                 ns6 = rs.getString("ciudad");
                 ns7 = rs.getString("telefono_cliente");
                 ns8 = rs.getString("doc_empleado");
                 ns9 = rs.getString("vendedor");
                 ns10 = rs.getString("cod_producto");
                 ns11 = rs.getString("nombre_producto");
                 ns12 = rs.getString("n_prendas");
                 ns13 = rs.getString("pago");
                 ns14 = rs.getString("subtotal");
                 ns15 = rs.getString("descuento");
                 ns16 = rs.getString("iva");
                 ns17 = rs.getString("neto");
                 ns18 = rs.getString("cliente");
                 ns19 = rs.getString("cod_empleado");
              }
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
        
    }
    public void enviar_historial_productos(JTextField cod_producto,JTextField nombre,JTextField talla,JTextField precio,
            JTextField color,JSpinner cuenta,JTextArea observacion){
        if(fact1.equals("")){
          
      }else{
         
        String cod="",n_producto="",tallas="",precios="",colores="",cuentas="",fecha="",ob="";
                
        try {
		String query="SELECT * FROM `productos` WHERE `cod_nit`= "+fact1+"";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 cod = rs.getString("cod_produtos");
                 n_producto = rs.getString("nombre_producto");
                 tallas = rs.getString("precio");
                 precios = rs.getString("talla");
                 colores = rs.getString("color");
                 cuentas = rs.getString("existencias");
                 fecha = rs.getString("fecha de ingreso");
                 ob = rs.getString("observacion");
              }
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
     cod_producto.setText(cod);
     nombre.setText(n_producto);
     talla.setText(tallas);
     precio.setText(precios);
     color.setText(colores);
     int cu=Integer.parseInt(cuentas);
     cuenta.setValue(cu);
     observacion.setText(fecha);
     observacion.setText(ob);
    }}
     
    
    public void buscar_ventas(JTable result,JTextField buscar){
    String r = buscar.getText();
           try {
		String query="SELECT `ID_cod`, `cod_empleado`, `doc_empleado`, `ciudad`, `vendedor`, `cliente`, `n_documento_cliente`,`cod_producto`, `nombre_producto`,`bodega`,`pago`,`fecha` FROM `ventas` WHERE `ID_cod` LIKE '%"+r+"%' OR `cod_empleado` LIKE '%"+r+"%' OR `doc_empleado` LIKE '%"+r+"%' OR `ciudad` LIKE '%"+r+"%' OR `vendedor` LIKE '%"+r+"%' OR `cliente` LIKE '%"+r+"%' OR `n_documento_cliente` LIKE '%"+r+"%' OR `cod_producto` LIKE '%"+r+"%' OR `nombre_producto` LIKE '%"+r+"%' OR `bodega` LIKE '%"+r+"%' OR `pago` LIKE '%"+r+"%' OR `fecha` LIKE '%"+r+"%'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_cod","cod_empleado","doc_empleado","ciudad","vendedor","cliente","n_documento_cliente","cod_producto", "nombre_producto","bodega","pago","fecha"      
              });
                            
              while(rs.next())
              {
                 
                 modelo.addRow(new Object[]{rs.getString("ID_cod"),rs.getString("cod_empleado"),rs.getString("doc_empleado"),rs.getString("ciudad"),rs.getString("vendedor"),rs.getString("cliente"),rs.getString("n_documento_cliente"),rs.getString("cod_producto"),rs.getString("nombre_producto"),rs.getString("bodega"),rs.getString("pago"),rs.getString("fecha")}); 
                
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
}
    public void buscar_venta2(JTable result,JTextField buscar,JComboBox categoria,JDateChooser desde,JDateChooser hasta){
      String r1,r2,r3,r4,fu;
      r1=buscar.getText();
      r2=(String) categoria.getSelectedItem();
      SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
      r3=format1.format(desde.getDate());
      metodos met=new metodos();
      met.busqueda_exacta(hasta);
      fu=dia;
           try {
		String query="SELECT * FROM `ventas` WHERE `fecha` between '"+r3+"' AND '"+fu+"' AND `"+r2+"` LIKE '%"+r1+"%'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_cod","cod_empleado","doc_empleado","ciudad","vendedor","cliente","n_documento_cliente","cod_producto", "nombre_producto","bodega","pago","fecha"      
              });
                            
              while(rs.next())
              {
                 
                 modelo.addRow(new Object[]{rs.getString("ID_cod"),rs.getString("cod_empleado"),rs.getString("doc_empleado"),rs.getString("ciudad"),rs.getString("vendedor"),rs.getString("cliente"),rs.getString("n_documento_cliente"),rs.getString("cod_producto"),rs.getString("nombre_producto"),rs.getString("bodega"),rs.getString("pago"),rs.getString("fecha")}); 
                
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }}
    public void buscar_historial_producto(JTable result,JTextField buscar,JComboBox categoria,JDateChooser desde,JDateChooser hasta){
      String r1,fu,r2,r3,r4;
      r1=buscar.getText();
      r2=(String) categoria.getSelectedItem();
      SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
      r3=format1.format(desde.getDate());
      metodos met=new metodos();
      met.busqueda_exacta(hasta);
      fu=dia;
           try {
		String query="SELECT * FROM `productos` WHERE `fecha de ingreso` between '"+r3+"' AND '"+fu+"' AND `"+r2+"` LIKE '%"+r1+"%'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"cod_nit","cod_produtos", "nombre_producto", "precio", "talla", "color", "existencias","fecha de ingreso","observacion"
              });
                            
              while(rs.next())
              {
                 modelo.addRow(new Object[]{rs.getString("cod_nit"),rs.getString("cod_produtos"),rs.getString("nombre_producto"),rs.getString("precio"),rs.getString("talla"),rs.getString("color"),
                 rs.getString("existencias"),rs.getString("fecha de ingreso"),rs.getString("observacion")}); 
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
        
    }
    public void buscar_usuario_empleado(JTable result,JTextField buscar){
      String r1;
      r1=buscar.getText();
           try {
		String query="SELECT * FROM `registro_vendedor` WHERE `usuario` LIKE '%"+r1+"%' OR `contraseña` LIKE '%"+r1+"%'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_registro","usuario", "contraseña"
              });
                            
              while(rs.next())
              {
                 modelo.addRow(new Object[]{rs.getString("ID_registro"),rs.getString("usuario"),rs.getString("contraseña")}); 
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
        
    }
    public void enviar_empleado_admin(JTable result,JComboBox tipo_documento,JTextField documento,JTextField nombres,JTextField apellidos,
            JTextField direcccion,JTextField telefono){
        
        if(fact1.equals("")){
             
         }else{
             String ns1="",ns2="",ns3="",ns4="",ns5="",ns6="",ns7="";
         try { 
		String query="SELECT * FROM `empleado` WHERE `ID_nit`='"+fact1+"'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 ns1 = rs.getString("tipo_documento");
                 ns2 = rs.getString("documento");
                 ns3 = rs.getString("nombres");
                 ns4 = rs.getString("apellidos");
                 ns5 = rs.getString("direccion");
                 ns6 = rs.getString("telefono");
              }
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(autocompletar.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
             
        tipo_documento.setSelectedItem(ns1);
        documento.setText(ns2);
        nombres.setText(ns3);
        apellidos.setText(ns4);
        direcccion.setText(ns5);
        telefono.setText(ns6);
         }
        
    }

}



