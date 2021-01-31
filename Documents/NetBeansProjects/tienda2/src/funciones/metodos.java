
package funciones;

import static administrador.menuadmin.ID;
import static administrador.ventas_admin.actualidad_act;
import static administrador.ventas_admin.actualidad_bor;
import static administrador.ventas_admin.fecha;
import static administrador.ventas_admin.observacion;
import static administrador.ventas_admin.devolver_p;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.JOptionPane;
import baseDatos.conexionMYSQL;
import com.toedter.calendar.JDateChooser;
import static funciones.autocompletar.dia;
import static funciones.autocompletar.existencias1;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static tienda.factura.fact1;
import static tienda.login.texto;
import static tienda.ventas.fact;
import static tienda.ventas.cod_pro;


public class metodos {
        DefaultTableModel modelo= new DefaultTableModel();
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
    
   public void mostrar_venta_admin_table(JTable result)
  {
      if(fact1.equals("")){
          
      }else{
        try {
		String query="SELECT * FROM `ventas` WHERE `ID_cod`='"+fact1+"'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_cod","cod_empleado", "vendedor", "cliente", "n_documento_cliente", "direccion_cliente", "telefono_cliente","cod_producto","nombre_producto","precio","bodega","n_prendas","descuento","pago","iva","subtotal","neto","fecha"
              });
                            
              while(rs.next())
              {
                modelo.addRow(new Object[]{rs.getString("ID_cod"),rs.getString("cod_empleado"),rs.getString("vendedor"),rs.getString("cliente"),rs.getString("n_documento_cliente"),rs.getString("direccion_cliente"),rs.getString("telefono_cliente"),rs.getString("cod_producto"),rs.getString("nombre_producto"),rs.getString("precio"),rs.getString("bodega"),rs.getString("n_prendas"),
                rs.getString("descuento"),rs.getString("pago"),rs.getString("iva"),rs.getString("subtotal"),rs.getString("neto"),rs.getString("fecha")}); 
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }
        
  }}
   public void mostrar_producto_historial(JTable result)
  {
      if(fact1.equals("")){
          
      }else{
        try {
		String query="SELECT * FROM `productos` WHERE `cod_nit`='"+fact1+"'";
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
        }
        
  }}
   
    
   public void mostrar_ventas(JTable result){
		try {
		String query="SELECT * FROM ventas ORDER BY `ID_cod` DESC LIMIT 1";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_cod","cod_empleado", "vendedor", "cliente", "n_documento_cliente", "direccion_cliente", "telefono_cliente","cod_producto","nombre_producto","precio","bodega","n_prendas","descuento","pago","iva","subtotal","neto","fecha"
              });
                            
              while(rs.next())
              {
                 modelo.addRow(new Object[]{rs.getString("ID_cod"),rs.getString("cod_empleado"),rs.getString("vendedor"),rs.getString("cliente"),rs.getString("n_documento_cliente"),rs.getString("direccion_cliente"),rs.getString("telefono_cliente"),rs.getString("cod_producto"),rs.getString("nombre_producto"),rs.getString("precio"),rs.getString("bodega"),rs.getString("n_prendas"),
                rs.getString("descuento"),rs.getString("pago"),rs.getString("iva"),rs.getString("subtotal"),rs.getString("neto"),rs.getString("fecha")}); 
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }
   }
   public void mostrar_productos(JTable result){
		try {
		String query="SELECT * FROM `productos` ORDER BY `cod_nit` DESC LIMIT 1";
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
        }
   }
   public void mostrar_empleados(JTable result){
       try {
		String query="SELECT * FROM `empleado` ORDER BY `ID_nit` DESC LIMIT 1";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_nit", "tipo_documento", "documento", "nombres", "apellidos", "direccion", "telefono", "fecha_de_ingreso", "observacion"
              });
                            
              while(rs.next())
              {
                 modelo.addRow(new Object[]{rs.getString("ID_nit"),rs.getString("tipo_documento"),rs.getString("documento"),rs.getString("nombres"),rs.getString("apellidos"),rs.getString("direccion"),
                 rs.getString("telefono"),rs.getString("fecha_de_ingreso"),rs.getString("observacion")}); 
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }
   }
   public void mostrar_empleados_actualizar(JTable result){
      if(fact1.equals("")){
        
      }else{
          try {
		String query="SELECT * FROM `empleado` WHERE `ID_nit` = "+fact1+"";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"ID_nit", "tipo_documento", "documento", "nombres", "apellidos", "direccion", "telefono", "fecha_de_ingreso", "observacion"
              });
                            
              while(rs.next())
              {
                 modelo.addRow(new Object[]{rs.getString("ID_nit"),rs.getString("tipo_documento"),rs.getString("documento"),rs.getString("nombres"),rs.getString("apellidos"),rs.getString("direccion"),
                 rs.getString("telefono"),rs.getString("fecha_de_ingreso"),rs.getString("observacion")}); 
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }  
      } 
       
   }
   
   public void mostrar_consulta_grafica(JTable result){
         try {
		String query="SELECT `n_prendas`,`vendedor`,`precio` FROM `ventas` WHERE `vendedor` LIKE '%paula%'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"n_prenda","vendedor","precio"
              });
                            
              while(rs.next())
              {
                modelo.addRow(new Object[]{rs.getString("n_prendas"),rs.getString("vendedor"),rs.getString("precio")}); 
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }
   }
   
   public void ingresar(JTextField n_empleado,JTextField vendedor,JTextField N_documento,JTextField Ciudad,
    JTextField cliente,JTextField doc_identidad1,JTextField direccion1,JTextField telefono,JTextField cd,JTextField np
   ,JTextField p,JComboBox bodega,JSpinner n1,JComboBox descuento,JComboBox forma,JTextField iva,JTextField Subtotal,
    JTextField neto){
       
    
    
    String cod_empleado,vendedor1,n_doc,ciudad,cliente1,doc_identidad,direccion,telefo,cod_producto,nombre_producto,precio,bodega1,pren,descuento1,
            forma1,iva1,Subtotal1,neto1,Ssql,mensaje;
    
    cod_empleado=n_empleado.getText();
    vendedor1=(String) vendedor.getText();
    n_doc=(String) N_documento.getText();
    ciudad=(String) Ciudad.getText();
    cliente1=(String) cliente.getText();
    doc_identidad=(String) doc_identidad1.getText();
    direccion=(String) direccion1.getText();
    telefo=(String) telefono.getText();
    cod_producto=cd.getText();
    nombre_producto=np.getText();
    precio=p.getText();
    bodega1=(String) bodega.getSelectedItem();
    int n_prendas = (int) n1.getValue();
    pren = String.valueOf(n_prendas);
    descuento1=(String) descuento.getSelectedItem();
    forma1=(String) forma.getSelectedItem();
    iva1=(String) iva.getText();
    Subtotal1=(String) Subtotal.getText();
    neto1=(String) neto.getText();
    SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date dia=new Date();
    String fecha=format.format(dia);
    
    
    Ssql="INSERT INTO ventas(`cod_empleado`, `doc_empleado`, `ciudad`, `vendedor`, `cliente`, `n_documento_cliente`, `direccion_cliente`, `telefono_cliente`, `cod_producto`, `nombre_producto`, `precio`, `bodega`, `n_prendas`, `descuento`, `pago`, `iva`, `subtotal`, `neto`, `fecha`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    mensaje="los datos se ingresado correctamente";
    
    
    try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,cod_empleado);
     pst.setString(2,n_doc);
     pst.setString(3,ciudad);
     pst.setString(4,vendedor1);
     pst.setString(5,cliente1);
     pst.setString(6,doc_identidad);
     pst.setString(7,direccion);
     pst.setString(8,telefo);
     pst.setString(9,cod_producto);
     pst.setString(10,nombre_producto);
     pst.setString(11,precio);
     pst.setString(12,bodega1);
     pst.setString(13,pren);
     pst.setString(14,descuento1);
     pst.setString(15,forma1);
     pst.setString(16,iva1);
     pst.setString(17,Subtotal1);
     pst.setString(18,neto1);
     pst.setString(19,fecha);
     
     int no= pst.executeUpdate();
     if(no>0){
         JOptionPane.showMessageDialog(null, mensaje);
         fact="abrir";
         
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
        JOptionPane.showMessageDialog(null,"No ha ingresado informacion o faltan campos por completar");
    }
        
        
}
    public void ingresar_cliente(JTable result,JTextField nombre,JTextField apellido,JComboBox tipo_doc,
            JTextField n_documeto,JComboBox genero,JTextField direccion,JTextField telefono,JTextArea observacion,
            JTextField celular,JTextField ciudad
            ){
    
    String nombre1,apellido1,tipo_doc1,genero1,direccion1,observacion1,n_documeto1,telefono1,celular1,ciudad1,Ssql,mensaje;
    
    
    nombre1=nombre.getText();
    apellido1=apellido.getText();
    tipo_doc1=(String) tipo_doc.getSelectedItem();
    n_documeto1=n_documeto.getText();
    genero1=(String)genero.getSelectedItem();
    direccion1=direccion.getText();
    telefono1=telefono.getText();
    observacion1=observacion.getText();
    celular1=celular.getText();
    ciudad1=ciudad.getText();
    
    Ssql="INSERT INTO `cliente`(`tipo_documento`, `cedula`, `nombres`, `apellidos`, `direccion`, `ciudad`, `telefono`, `celular`, `genero`, `observacion`) VALUES(?,?,?,?,?,?,?,?,?,?)";
    mensaje="los datos se ingresado correctamente";
    
     try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,tipo_doc1);
     pst.setString(2,n_documeto1);
     pst.setString(3,nombre1);
     pst.setString(4,apellido1);
     pst.setString(5,direccion1);
     pst.setString(6,ciudad1);
     pst.setString(7,telefono1);
     pst.setString(8,celular1);
     pst.setString(9,genero1);
     pst.setString(10,observacion1);
     
     int no= pst.executeUpdate();
     if(no>0){
         JOptionPane.showMessageDialog(null, mensaje);
         
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
        JOptionPane.showMessageDialog(null,"No ha ingresado informacion o faltan campos por completar");
    }
}   
    public void ingresar_observacion(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dia=new Date();
        String fecha1=format.format(dia);
        String Ssql;
       Ssql="INSERT INTO `observacion_ventas`(`usuario`, `observacion_actualizacion`, `observacion_borrado`, `fecha`) VALUES(?,?,?,?)";
      
    try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,texto);
     pst.setString(2,actualidad_act);
     pst.setString(3,actualidad_bor+" se regresa: "+devolver_p+" articulos al inventario");
     pst.setString(4,fecha1);
     
     int no= pst.executeUpdate();
     if(no>0){
         
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
        JOptionPane.showMessageDialog(null,"No ha ingresado informacion o faltan campos por completar");
    }
   }
    public void ingresar_observacion_productos(){
         SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dia=new Date();
        String fecha1=format.format(dia);
        String Ssql;
       Ssql="INSERT INTO `observacion_productos`(`usuario`, `observacion_actualizacion`, `observacion_borrado`, `fecha`) VALUES(?,?,?,?)";
      
    try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,texto);
     pst.setString(2,actualidad_act);
     pst.setString(3,actualidad_bor);
     pst.setString(4,fecha1);
     
     int no= pst.executeUpdate();
     if(no>0){
         
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
        JOptionPane.showMessageDialog(null,"No ha ingresado informacion o faltan campos por completar");
    }
   }
    
    public void ingresar_observacion_empleados(){
         SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dia=new Date();
        String fecha1=format.format(dia);
        String Ssql;
       Ssql="INSERT INTO `observacion_empleado`(`usuario`, `observacion_actualizacion`, `observacion_borrado`, `fecha`) VALUES(?,?,?,?)";
      
    try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,texto);
     pst.setString(2,actualidad_act);
     pst.setString(3,actualidad_bor);
     pst.setString(4,fecha1);
     
     int no= pst.executeUpdate();
     if(no>0){
         
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
        JOptionPane.showMessageDialog(null,"No ha ingresado informacion o faltan campos por completar");
    }
   }
    
    public void ingresar_productos(JTextField cod_producto,JTextField nombre,JTextField talla,JTextField precio,
            JTextField color,JSpinner cuenta,JTextArea observacion){
    String cod,n_producto,tallas,precios,colores,cuentas,fecha,ob,mensaje,Ssql;
    
    cod=cod_producto.getText();
    n_producto=nombre.getText();
    precios=precio.getText();
    tallas=talla.getText();
    colores=color.getText();
    cuentas=cuenta.getValue().toString();
    SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date dia=new Date();
    fecha=format.format(dia);
    ob=observacion.getText();
    
     
     Ssql="INSERT INTO `productos`(`cod_produtos`, `nombre_producto`, `precio`, `talla`, `color`, `existencias`, `fecha de ingreso`, `observacion`,`observacion_actualizacion`) VALUES (?,?,?,?,?,?,?,?,?)";
     mensaje="los datos se ingresado correctamente";
    try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,cod);
     pst.setString(2,n_producto);
     pst.setString(3,precios);
     pst.setString(4,tallas);
     pst.setString(5,colores);
     pst.setString(6,cuentas);
     pst.setString(7,fecha);
     pst.setString(8,ob);
     pst.setString(9,"");
     
     int no= pst.executeUpdate();
     if(no>0){
         JOptionPane.showMessageDialog(null, mensaje);
         
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
        JOptionPane.showMessageDialog(null,"No ha ingresado informacion o faltan campos por completar");
    }}
    
    public void ingresar_empleados(JComboBox tipo_documento,JTextField documento,JTextField nombres,JTextField apellidos,
            JTextField direcccion,JTextField telefono){
        
        String documento1,nombres1,apellidos1,direcccion1,telefono1,tipo_documento1,fecha,mensaje,Ssql;
        
        tipo_documento1=(String) tipo_documento.getSelectedItem();
        documento1=documento.getText();
        nombres1=nombres.getText();
        apellidos1=apellidos.getText();
        direcccion1=direcccion.getText();
        telefono1=telefono.getText();
        SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dia=new Date();
        fecha=format.format(dia);
        
     Ssql="INSERT INTO `empleado`(`tipo_documento`, `documento`, `nombres`, `apellidos`, `direccion`, `telefono`, `fecha_de_ingreso`, `observacion`) VALUES (?,?,?,?,?,?,?,?)";
     mensaje="los datos se ingresado correctamente";
     
     try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,tipo_documento1);
     pst.setString(2,documento1);
     pst.setString(3,nombres1);
     pst.setString(4,apellidos1);
     pst.setString(5,direcccion1);
     pst.setString(6,telefono1);
     pst.setString(7,fecha);
     pst.setString(8,"");
     
     int no= pst.executeUpdate();
     if(no>0){
         JOptionPane.showMessageDialog(null, mensaje);
         
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
        JOptionPane.showMessageDialog(null,"No ha ingresado informacion o faltan campos por completar");
    }}
   
    public void ingresar_usuario_nuevo_empleado(JTextField usuario_nuevo,JTextField clave_nueva,JTextField verificar_contraseña){
        String usuario_nuevo1,clave_nueva1,verificar_contraseña1,mensaje,Ssql;
        
        usuario_nuevo1=usuario_nuevo.getText();
        clave_nueva1=clave_nueva.getText();
        verificar_contraseña1=verificar_contraseña.getText();
        
        if(clave_nueva1.equals(verificar_contraseña1)){
         Ssql="INSERT INTO `registro_vendedor`(`usuario`, `contraseña`) VALUES (?,?)";
         mensaje="Se ha creado usuario y contraseña correctamente";
         try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,usuario_nuevo1);
     pst.setString(2,clave_nueva1);
     
     int no= pst.executeUpdate();
     if(no>0){
         JOptionPane.showMessageDialog(null, mensaje);
         
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"No ha ingresado informacion o faltan campos por completar");
    }}}
    
    public void actualizar_existencias(){
     String Ssql;
     
    Ssql="UPDATE `productos` SET `existencias`=?  WHERE `cod_produtos`="+cod_pro+"";
    try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,existencias1);
     
     int no= pst.executeUpdate();
     if(no>0){
         
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
    }}
    
     public void actualizar(JTable result,JTextField n_empleado,JTextField vendedor,JTextField N_documento,JTextField Ciudad,
    JTextField cliente,JTextField doc_identidad1,JTextField direccion1,JTextField telefono,JTextField cd,JTextField np
   ,JTextField p,JComboBox bodega,JSpinner n1,JComboBox descuento,JComboBox forma,JTextField iva,JTextField Subtotal,
    JTextField neto){
       
    String Ssql;
    String mensaje;
    String cod_empleado,vendedor1,n_doc,ciudad,cliente1,doc_identidad,direccion,telefo,cod_producto,nombre_producto,precio,bodega1,descuento1,
            forma1,iva1,Subtotal1,neto1;
    
    
    ID=String.valueOf(result.getValueAt(0, 0));
    cod_empleado=n_empleado.getText();
    vendedor1=(String) vendedor.getText();
    n_doc=(String) N_documento.getText();
    ciudad=(String) Ciudad.getText();
    cliente1=(String) cliente.getText();
    doc_identidad=(String) doc_identidad1.getText();
    direccion=(String) direccion1.getText();
    telefo=(String) telefono.getText();
    cod_producto=cd.getText();
    nombre_producto=np.getText();
    precio=p.getText();
    bodega1=(String) bodega.getSelectedItem();
    int n_prendas = (int) n1.getValue();
    String prendas = String.valueOf(n_prendas);
    descuento1=(String) descuento.getSelectedItem();
    forma1=(String) forma.getSelectedItem();
    iva1=(String) iva.getText();
    Subtotal1=(String) Subtotal.getText();
    neto1=(String) neto.getText();
    Date sistFecha=new Date();
    SimpleDateFormat format=new SimpleDateFormat("EEEE  dd MMMMM YYYY hh:mm:ss a");
    fecha=format.format(sistFecha);
    actualidad_act=observacion+" el usuario "+texto+" actualiza el dia "+fecha+" la factura 777777"+ID;
    
    
    Ssql="UPDATE `ventas` SET `cod_empleado`= ?, `doc_empleado`= ?,"
    + " `ciudad`= ?, `vendedor`= ?, `cliente`= ?, `n_documento_cliente`= ?, `direccion_cliente`= ?,"
    + " `telefono_cliente`= ?, `cod_producto`= ?, `nombre_producto`= ?, `precio`= ?, `bodega`= ?,"
    + " `n_prendas`= ?, `descuento`= ?, `pago`= ?, `iva`= ?, `subtotal`= ?, `neto`= ?,`obsevacion_de_actualizacion`= ? WHERE `ID_cod`='"+ID+"'";
    mensaje="los datos se actualizaron correctamente";
    
    
    try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,cod_empleado);
     pst.setString(2,n_doc);
     pst.setString(3,ciudad);
     pst.setString(4,vendedor1);
     pst.setString(5,cliente1);
     pst.setString(6,doc_identidad);
     pst.setString(7,direccion);
     pst.setString(8,telefo);
     pst.setString(9,cod_producto);
     pst.setString(10,nombre_producto);
     pst.setString(11,precio);
     pst.setString(12,bodega1);
     pst.setString(13,prendas);
     pst.setString(14,descuento1);
     pst.setString(15,forma1);
     pst.setString(16,iva1);
     pst.setString(17,Subtotal1);
     pst.setString(18,neto1);
     pst.setString(19,actualidad_act);
     
     int no= pst.executeUpdate();
     if(no>0)
     {
         JOptionPane.showMessageDialog(null, mensaje);
        
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
    }}
     
     
     public void actualizar_producto(JTable result,JTextField cod_producto,JTextField nombre,JTextField talla,JTextField precio,
            JTextField color,JSpinner cuenta,JTextArea observacio){
         String cod="",n_producto="",tallas="",precios="",colores="",cuentas="",fecha="",ob="",mensaje="",Ssql="";
         
    ID=String.valueOf(result.getValueAt(0, 0));
    cod=cod_producto.getText();
    n_producto=nombre.getText();
    precios=precio.getText();
    tallas=talla.getText();
    colores=color.getText();
    cuentas=cuenta.getValue().toString();
    SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date dia=new Date();
    fecha=format.format(dia);
    ob=observacio.getText();
    actualidad_act=observacion+" el usuario "+texto+" actualiza el dia "+fecha+" el codigo del producto"+cod;
         
         Ssql="UPDATE `productos` SET `cod_produtos`=?,`nombre_producto`=?,`"
         + "precio`=?,`talla`=?,`color`=?,`existencias`=?,`observacion`=?,`observacion_actualizacion`=?"
         + "  WHERE `cod_nit`='"+ID+"'";
         
         mensaje="los datos se actualizaron correctamente";
     try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,cod);
     pst.setString(2,n_producto);
     pst.setString(3,precios);
     pst.setString(4,tallas);
     pst.setString(5,colores);
     pst.setString(6,cuentas);
     pst.setString(7,ob);
     pst.setString(8,actualidad_act);
     
     int no= pst.executeUpdate();
     if(no>0)
     {
         JOptionPane.showMessageDialog(null, mensaje);
        
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
    }}
     
     public void actualizar_regresar_existencia(JTable result){
         String ID,existencias="",mensaje="",total="",query2="";
         int suma=0;
         ID=String.valueOf(result.getValueAt(0,7));
         devolver_p=String.valueOf(result.getValueAt(0, 11));
         
         try {
		String query1="SELECT `existencias` FROM `productos` WHERE `cod_produtos`= "+ID+"";
		ps=cn.prepareStatement(query1);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 existencias = rs.getString("existencias");
              }
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
         
         suma=Integer.parseInt(existencias)+Integer.parseInt(devolver_p);
         total=String.valueOf(suma);
         
     query2="UPDATE `productos` SET `existencias`=? WHERE `cod_produtos` ="+ID+"";
     mensaje="los datos se actualizaron correctamente";
         
     try{
     PreparedStatement pst= cn.prepareStatement(query2);
     pst.setString(1,total);
     
     int no= pst.executeUpdate();
     if(no>=0)
     {
         JOptionPane.showMessageDialog(null, mensaje);
        
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
    }
     }
     
     
     public void actualizar_empleado(JTable result,JComboBox tipo_documento,JTextField documento,JTextField nombres,JTextField apellidos,
            JTextField direcccion,JTextField telefono){
         
        String documento1,nombres1,apellidos1,direcccion1,telefono1,tipo_documento1,fecha,mensaje="",Ssql="";
        
        ID=String.valueOf(result.getValueAt(0, 0)); 
        tipo_documento1=(String) tipo_documento.getSelectedItem();
        documento1=documento.getText();
        nombres1=nombres.getText();
        apellidos1=apellidos.getText();
        direcccion1=direcccion.getText();
        telefono1=telefono.getText();
        SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dia=new Date();
        fecha=format.format(dia);
        actualidad_act=observacion+" el usuario "+texto+"\n actualiza el dia "+fecha+" el codigo de empleado :"+ID+". "+nombres1+" "+apellidos1+"";
        
        Ssql="UPDATE `empleado` SET `tipo_documento`=?,`documento`=?,`nombres`=?,`apellidos`=?,`direccion`=?,`telefono`=?,`fecha_de_ingreso`=?,`observacion`=? WHERE `ID_nit` = "+ID+"";
        mensaje="los datos se actualizaron correctamente";
     
     try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,tipo_documento1);
     pst.setString(2,documento1);
     pst.setString(3,nombres1);
     pst.setString(4,apellidos1);
     pst.setString(5,direcccion1);
     pst.setString(6,telefono1);
     pst.setString(7,fecha);
     pst.setString(8,actualidad_act);
     
     int no= pst.executeUpdate();
     if(no>0)
     {
         JOptionPane.showMessageDialog(null, mensaje);
        
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
    }}
    
    public void actualizar_contraseña_usuario_login(JTextField usuario_actual,JTextField clave_actual,JTextField usuario_nuevo,JTextField contraseña_nueva,JTextField verificar_contraseña){
        
        String ID="",usuario_actual1,clave_actual1,usuario_nuevo1,contraseña_nueva1,verificar_contraseña1,query="",mensaje="",Ssql="";
        
        usuario_actual1=usuario_actual.getText();
        clave_actual1=clave_actual.getText();
        usuario_nuevo1=usuario_nuevo.getText();
        contraseña_nueva1=contraseña_nueva.getText();
        verificar_contraseña1=verificar_contraseña.getText();
        try { 
        query="SELECT `ID_registro`, `usuario`, `contraseña` FROM registro_admin WHERE `usuario` = '"+usuario_actual1+"' AND `contraseña` = '"+clave_actual1+"'";
         ps=cn.prepareStatement(query);
	 rs=ps.executeQuery();
              while(rs.next())
              {
                 ID = rs.getString("ID_registro");
              }
	}  
        catch (SQLException e) 
        {
         
        }
        
        if(verificar_contraseña1.equals(contraseña_nueva1)){
        
        Ssql="UPDATE `registro_admin` SET `usuario`=?,`contraseña`=? WHERE `ID_registro` = "+ID+"";
        mensaje="el usuario y la contraseña se actualizarón correctamente";
        
        try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,usuario_nuevo1);
     pst.setString(2,contraseña_nueva1);
     
     int no= pst.executeUpdate();
     if(no>0)
     {
         JOptionPane.showMessageDialog(null, mensaje);
        
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"el usuario o contraseña no existen, verifique esos datos esten correctamente escritos");
    }
        
            
        }else{
            JOptionPane.showMessageDialog(null,"Las contaseñas no son iguales");
        }
    } 
    
    public void actualizar_contraseña_login(JTextField usuario_actual,JTextField clave_actual, JTextField contraseña_nueva,JTextField verificar_contraseña){
        
        String ID="",usuario_actual1,clave_actual1,contraseña_nueva1,verificar_contraseña1,query="",mensaje="",Ssql="";
        
        usuario_actual1=usuario_actual.getText();
        clave_actual1=clave_actual.getText();
        contraseña_nueva1=contraseña_nueva.getText();
        verificar_contraseña1=verificar_contraseña.getText();
        try { 
        query="SELECT `ID_registro`, `usuario`, `contraseña` FROM registro_admin WHERE `usuario` = '"+usuario_actual1+"' AND `contraseña` = '"+clave_actual1+"'";
         ps=cn.prepareStatement(query);
	 rs=ps.executeQuery();
              while(rs.next())
              {
                 ID = rs.getString("ID_registro");
              }
	}  
        catch (SQLException e) 
        {
         
        }
        
        if(verificar_contraseña1.equals(contraseña_nueva1)){
        
        Ssql="UPDATE `registro_admin` SET `contraseña`=? WHERE `ID_registro` = "+ID+"";
        mensaje="la contraseña se actualizo correctamente";
        
        try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,contraseña_nueva1);
     
     int no= pst.executeUpdate();
     if(no>0)
     {
         JOptionPane.showMessageDialog(null, mensaje);
        
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"el usuario o contraseña no existen, verifique esos datos esten correctamente escritos");
    }}else{
            JOptionPane.showMessageDialog(null,"Las contaseñas no son iguales");
        }
    } 
    
    public void actualizar_usuario_empleado(JTextField usuario_actual,JTextField clave_actual,JTextField usuario_nuevo,JTextField contraseña_nueva,JTextField verificar_contraseña){
        
        String ID="",usuario_actual1,clave_actual1,contraseña_nueva1,usuario_nuevo1,verificar_contraseña1,query="",mensaje="",Ssql="";
        
        usuario_actual1=usuario_actual.getText();
        clave_actual1=clave_actual.getText();
        usuario_nuevo1=usuario_nuevo.getText();
        contraseña_nueva1=contraseña_nueva.getText();
        verificar_contraseña1=verificar_contraseña.getText();
        
        try { 
        query="SELECT `ID_registro`, `usuario`, `contraseña` FROM registro_vendedor WHERE `usuario` = '"+usuario_actual1+"' AND `contraseña` = '"+clave_actual1+"'";
         ps=cn.prepareStatement(query);
	 rs=ps.executeQuery();
              while(rs.next())
              {
                 ID = rs.getString("ID_registro");
              }
	}  
        catch (SQLException e) 
        {
         
        }
        
        if(verificar_contraseña1.equals(contraseña_nueva1)){
        
        Ssql="UPDATE `registro_vendedor` SET `usuario`=?,`contraseña`=? WHERE `ID_registro` = "+ID+"";
        mensaje="el usuario y contraseña se actualizo correctamente";
        
        try{
     PreparedStatement pst= cn.prepareStatement(Ssql);
     pst.setString(1,usuario_nuevo1);
     pst.setString(2,contraseña_nueva1);
     
     int no= pst.executeUpdate();
     if(no>0)
     {
         JOptionPane.showMessageDialog(null, mensaje);
        
     }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"el usuario o contraseña no existen, verifique esos datos esten correctamente escritos");
    }
        
            
        }else{
            JOptionPane.showMessageDialog(null,"Las contaseñas no son iguales");
        }
        
    }
     
    public void borrar(JTable result){
    Date sistFecha=new Date();
    SimpleDateFormat format=new SimpleDateFormat("EEEE  dd MMMMM YYYY hh:mm:ss a");
    fecha=format.format(sistFecha);
        String ID=String.valueOf(result.getValueAt(0, 0));
        actualidad_bor=observacion+" el usuario "+texto+" borra la factura 777777"+ID+" el dia "+fecha;
        
	try {
		String query="delete from ventas where ID_cod=?";
		ps=cn.prepareStatement(query);
		ps.setString(1, ID);
		ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                
	} 
        catch (SQLException ex) 
         {
           JOptionPane.showMessageDialog(null, ex.getMessage());
          } 
     }
    public void borrar_producto(JTable result){
    Date sistFecha=new Date();
    SimpleDateFormat format=new SimpleDateFormat("EEEE  dd MMMMM YYYY hh:mm:ss a");
    fecha=format.format(sistFecha);
        String ID=String.valueOf(result.getValueAt(0, 0));
        String cod=String.valueOf(result.getValueAt(0, 1));
        
        actualidad_bor=observacion+" el usuario "+texto+" borra el producto "+cod+" el dia "+fecha;
        
	try {
		String query="DELETE FROM `productos` WHERE `cod_nit`=?";
		ps=cn.prepareStatement(query);
		ps.setString(1, ID);
		ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                
	} 
        catch (SQLException ex) 
         {
           JOptionPane.showMessageDialog(null, ex.getMessage());
          } 
     }
    
    public void borrar_empleado(JTable result){
    Date sistFecha=new Date();
    SimpleDateFormat format=new SimpleDateFormat("EEEE  dd MMMMM YYYY hh:mm:ss a");
    fecha=format.format(sistFecha);
        String ID=String.valueOf(result.getValueAt(0, 0));
        String nombres=String.valueOf(result.getValueAt(0, 3));
        String apellidos=String.valueOf(result.getValueAt(0, 4));
        
        actualidad_bor=observacion+" el usuario "+texto+" borra el empleado "+ID+". "+nombres+" "+apellidos+" el dia "+fecha;
        
	try {
		String query="DELETE FROM `empleado` WHERE `ID_nit`=?";
		ps=cn.prepareStatement(query);
		ps.setString(1, ID);
		ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                
	} 
        catch (SQLException ex) 
         {
           JOptionPane.showMessageDialog(null, ex.getMessage());
          } 
     }
     
     
     public void datosvendedor(JComboBox vendedor,JComboBox cliente){
     
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
     
    public void seleccionar(JTable result,JTextField n_empleado,JTextField vendedor,JTextField N_documento,JTextField Ciudad,
    JTextField cliente,JTextField doc_identidad1,JTextField direccion1,JTextField telefono,JTextField cd,JTextField np
   ,JTextField p,JComboBox bodega,JSpinner n1,JComboBox descuento,JComboBox forma,JTextField iva,JTextField Subtotal,
    JTextField neto)
           
     {
      try {
       int fila= result.getSelectedRow();
       if (fila<0)
       {
             JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
       }
       else
       {
           String cod_empleado=result.getValueAt(fila,1).toString();
           String doc_empleado=result.getValueAt(fila,2).toString();
           String ciudad1=result.getValueAt(fila,3).toString();
           String vendedor1=result.getValueAt(fila,4).toString();
           String cliente1=result.getValueAt(fila,5).toString();
           String n_documento_cliente=result.getValueAt(fila,6).toString();
           String direccion_cliente=result.getValueAt(fila,7).toString();
           String telefono1=result.getValueAt(fila,8).toString();
           String cod_producto =result.getValueAt(fila,9).toString();
           String nombre_producto=result.getValueAt(fila,10).toString();
           String precio1=result.getValueAt(fila,11).toString();
           String bodega1=result.getValueAt(fila,12).toString();
           String n_prendas=result.getValueAt(fila,13).toString();
           String descuento1=result.getValueAt(fila,14).toString();
           String pago=result.getValueAt(fila,15).toString();
           String iva1=result.getValueAt(fila,16).toString();
           String subtotal=result.getValueAt(fila,17).toString();
           String neto1=result.getValueAt(fila,18).toString();
       }
      
    } catch (HeadlessException e) {
      JOptionPane.showMessageDialog(null, "No hay información que mostrar");
    }   
     }
    public void limpiar_venta(JTable result,JTextField vendedor,JTextField n,JTextField N_documento,JTextField Ciudad,JTextField cliente1,JTextField direccion1,JTextField cd,JTextField doc_identidad1,
             JTextField telefono,JTextField np,JTextField p,JComboBox bodega,JSpinner n1,JComboBox descuento,JComboBox forma,
             JTextField iva,JTextField Subtotal,JTextField neto){
        
        vendedor.setText("");
        n.setText("");
        N_documento.setText("");
        Ciudad.setText("");
        cliente1.setText("");
        direccion1.setText("");
        doc_identidad1.setText("");
        telefono.setText("");
        cd.setText("");
        np.setText("");
        p.setText("$ 0");
        bodega.setSelectedItem("...........");
        n1.setValue(1);
        descuento.setSelectedItem("0");
        forma.setSelectedItem("...........");        
        iva.setText("$ 0");       
        Subtotal.setText("$ 0");
        neto.setText("$ 0");
        
        try{
            for (int i = 0; i <20; i++) {
            
			result.setValueAt("", 0, i);	
			}
        }catch(Exception ex){
            
        }}

 public void limpiar_productos(JTable result,JTextField cod_producto,JTextField nombre,JTextField talla,JTextField precio,
            JTextField color,JSpinner cuenta,JTextArea observacion){

     cod_producto.setText("");
     nombre.setText("");
     talla.setText("");
     precio.setText("");
     color.setText("");
     cuenta.setValue(1);
     observacion.setText("");
     try{
            for (int i = 0; i <9; i++) {
            
			result.setValueAt("", 0, i);	
			}
        }catch(Exception ex){
            
        }
}
public void limpiar_empleados(JTable result,JComboBox tipo_documento,JTextField documento,JTextField nombres,JTextField apellidos,
            JTextField direcccion,JTextField telefono){
    tipo_documento.setSelectedItem("............");
    documento.setText("");
    nombres.setText("");
    apellidos.setText("");
    direcccion.setText("");
    telefono.setText("");
    try{
            for (int i = 0; i <9; i++) {
            
			result.setValueAt("", 0, i);	
			}
        }catch(Exception ex){
            
        }
}
public void limpiar_cliente(JTable result,JTextField nombre,JTextField apellido,JComboBox tipo_doc,
            JTextField n_documeto,JComboBox genero,JTextField direccion,JTextField telefono,JTextArea observacion,
            JTextField celular,JTextField ciudad){
    
    nombre.setText("");
    apellido.setText("");
    tipo_doc.setSelectedItem(".........");
    n_documeto.setText("");
    genero.setSelectedItem(".............");
    direccion.setText("");
    telefono.setText("");
    observacion.setText("");
    celular.setText("");
    ciudad.setText("");
     try{
            for (int i = 0; i <10; i++) {
            
			result.setValueAt("", 0, i);	
			}
        }catch(Exception ex){
            
        }
}
public void limpiar_cambio_usuario(JTextField usuario_actual,JTextField clave_actual,JTextField usuario_nuevo,JTextField contraseña_nueva,JTextField verificar_contraseña){
    
    usuario_actual.setText("");
    clave_actual.setText("");
    usuario_nuevo.setText("");
    contraseña_nueva.setText("");
    verificar_contraseña.setText("");
}
public void limpiar_cambio_contraseña(JTextField usuario_actual,JTextField clave_actual,JTextField contraseña_nueva,JTextField verificar_contraseña){
    
    usuario_actual.setText("");
    clave_actual.setText("");
    contraseña_nueva.setText("");
    verificar_contraseña.setText("");
}

public void limpiar_usuario_nuevo_empleado(JTextField usuario_nuevo,JTextField contraseña_nueva,JTextField verificar_contraseña){
    usuario_nuevo.setText("");
    contraseña_nueva.setText("");
    verificar_contraseña.setText("");
    
}

public void busqueda_exacta(JDateChooser hasta){
        SimpleDateFormat format1=new SimpleDateFormat("dd");
        SimpleDateFormat format2=new SimpleDateFormat("MM");
        SimpleDateFormat format3=new SimpleDateFormat("YYYY");
        String diasn=format1.format(hasta.getDate());
        String mes1=format2.format(hasta.getDate());
        String año1=format3.format(hasta.getDate());
        int diasm=Integer.parseInt(diasn);
        int mes=Integer.parseInt(mes1);
        int año=Integer.parseInt(año1);
        String añon1="",mese1="",diaas1="";
        int di=0,totald=0,totalm=0,dias1=0,añon=0;
        dias1=diasm+1;
        
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                di=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                di=30;
                break;
            case 2:
                if((año%4==0 && año%100!=0) || año%400==0){
                    di = 29;
                }
                else{
                    di = 28;
                }
                break;
            default:
                break;
        }
            switch (di) {
                case 31:
                    if(dias1>31 && mes==12){
                        diaas1="1";
                        totalm=1;
                        mese1=String.valueOf(totalm);
                        añon=año+1;
                        añon1=String.valueOf(añon);
                    }
                    else if(dias1>=30){
                        diaas1="1";
                        totalm=mes+1;
                        mese1=String.valueOf(totalm);
                        añon=año;
                        añon1=String.valueOf(añon);
                        
                    }else if(dias1<=30){
                        mese1=mes1;
                        totald=diasm+1;
                        diaas1=String.valueOf(totald);
                        añon=año;
                        añon1=String.valueOf(añon);
                    }       break;
                case 30:
                    if(dias1>=29){
                        diaas1="1";
                        totalm=mes+1;
                        mese1=String.valueOf(totalm);
                        añon=año;
                        añon1=String.valueOf(añon);
                    }else if(dias1<=29){
                        mese1=mes1;
                        totald=diasm+1;
                        diaas1=String.valueOf(totald);
                        añon=año;
                        añon1=String.valueOf(añon);
                    }       break;
                case 29:
                case 28:
                    if(dias1>=29 || dias1>=28){
                        diaas1="1";
                        totalm=mes+1;
                        mese1=String.valueOf(totalm);
                        añon=año;
                        añon1=String.valueOf(añon);
                    }else if(di<=29 || di<=28){
                        mese1=mes1;
                        totald=diasm+1;
                        diaas1=String.valueOf(totald);
                        añon=año;
                        añon1=String.valueOf(añon);
                    }       break;
                default:
                    break;
            }
            dia=añon1+"-"+mese1+"-"+diaas1;
            
}   

}

     




