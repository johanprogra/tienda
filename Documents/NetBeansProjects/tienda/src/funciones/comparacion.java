
package funciones;

import baseDatos.conexionMYSQL;
import com.toedter.calendar.JDateChooser;
import static funciones.autocompletar.apellidocli;
import static funciones.autocompletar.ciudad;
import static funciones.autocompletar.cod_producto1;
import static funciones.autocompletar.direccion;
import static funciones.autocompletar.documento;
import static funciones.autocompletar.existencias1;
import static funciones.autocompletar.nombre_producto;
import static funciones.autocompletar.nombrecli;
import static funciones.autocompletar.telefono1;
import static funciones.graficos1.graficost;
import static funciones.graficos1.total;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static tienda.menuvendedor.guardar1;
import static tienda.menuvendedor.guardar2;
import static tienda.menuvendedor.guardar3;
import static tienda.ventas.asg;
import static tienda.ventas.cod_pro;
import static tienda.ventas.descuentos;
import static tienda.ventas.iva1;
import static tienda.ventas.mensage;
import static tienda.ventas.n_prendas1;
import static tienda.ventas.netos;
import static tienda.ventas.sub1;


public class comparacion {
    public void comparar(JDateChooser desde,JDateChooser hasta){
        Date dia=new Date();
        
        SimpleDateFormat format1=new SimpleDateFormat("dd");
        SimpleDateFormat format2=new SimpleDateFormat("MM");
        SimpleDateFormat format3=new SimpleDateFormat("YY");
        String d1=format1.format(desde.getDate());
        int d11=Integer.parseInt(d1);
        String m2=format2.format(desde.getDate());
        int d12=Integer.parseInt(m2);
        String d3=format3.format(desde.getDate());
        int d13=Integer.parseInt(d3);
        
        String h1=format1.format(hasta.getDate());
        int h11=Integer.parseInt(h1);
        String h2=format2.format(hasta.getDate());
        int h12=Integer.parseInt(h2);
        String h3=format3.format(hasta.getDate());
        int h13=Integer.parseInt(h3);
        if(d11>h11 && d12==h12 && d13==h13){
            JOptionPane.showMessageDialog(null,"La fecha inicial no puede superar la fecha final");
            desde.setDate(dia);
        }else if(d12>h12 && d13==h13){
            JOptionPane.showMessageDialog(null,"La fecha inicial no puede superar la fecha final");
            desde.setDate(dia);
        }else if(d13>h13){
            JOptionPane.showMessageDialog(null,"La fecha inicial no puede superar la fecha final");
            desde.setDate(dia);
        } 
    }
   
    
    public void comparar_asg(JTextField cliente1,JTextField direccion1,JTextField doc_identidad1,JTextField telefono,
    JTextField Ciudad,JTextField n_empleado,JTextField vendedor,JTextField N_documento,JTextField cd,JTextField p,JTextField np,
    JSpinner n1,JComboBox descuento,JTextField iva,JTextField Subtotal,JTextField neto
    ){
        if(mensage.equals("nada")){
            
        }else if(mensage.equals("mostrar")){
        
        String nombresc = nombrecli;
        String apellidosc = apellidocli;
        String documentol=documento;
        String direccionl=direccion;
        String telefo=telefono1;
        String ciudad1=ciudad;
        
        cliente1.setText(nombresc+" "+apellidosc);
        direccion1.setText(direccionl);
        doc_identidad1.setText(documentol);
        telefono.setText(telefo);
        Ciudad.setText(ciudad1);
                
        n_empleado.setText(guardar1);
        vendedor.setText(guardar2);
        N_documento.setText(guardar3);
        
        cd.setText(cod_producto1);
        np.setText(nombre_producto);
       
        n_prendas1=String.valueOf(n1);
        descuentos=(String)descuento.getSelectedItem();
        iva1=iva.getText();
        sub1=Subtotal.getText();
        netos=neto.getText();
        
        if(asg.equals("total")){
            total to=new total();
            to.enviartotal(p, n1, descuento, iva, Subtotal, neto);
        }}
    }
public void validacion_campos_productos(JTable result,JTextField cod_producto,JTextField nombre,JTextField talla,JTextField precio,
            JTextField color,JSpinner cuenta,JTextArea observacion){
    String cod,n_producto,tallas,precios,colores,ob;
    
    cod=cod_producto.getText();
    n_producto=nombre.getText();
    tallas=talla.getText();
    precios=precio.getText();
    colores=color.getText();
    ob=observacion.getText();
    
    if(cod !=null || n_producto !=null || tallas !=null || precios !=null || colores !=null || ob !=null){
    metodos met=new metodos();
    met.ingresar_productos(cod_producto, nombre, talla, precio, color, cuenta, observacion);
    met.mostrar_productos(result);
     }else{
    JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
    }
}
public void validacion_numeros(java.awt.event.KeyEvent evt) {
    char validacion = evt.getKeyChar();
       if(validacion>='0' && validacion<'9' || validacion == KeyEvent.VK_BACK_SPACE){
           
       }else if(validacion>'a' || validacion<'z' && validacion>'A' || validacion<'Z' || validacion == KeyEvent.VK_SPACE){
           JOptionPane.showMessageDialog(null,"Este campo solo admite numeros sin espacios");
           evt.consume();
       }
}
public void validacion_letras(java.awt.event.KeyEvent evt) {
    char validacion = evt.getKeyChar();
       if(validacion>='0' && validacion<='9'){
           JOptionPane.showMessageDialog(null,"Este campo solo admite letras");
           evt.consume();
       }else if(validacion>'a' || validacion<'z' && validacion>'A' || validacion<'Z'){
           
       }
}
public void validacion_campos_letras_nuevo_usuario(java.awt.event.KeyEvent evt) {
    char validacion = evt.getKeyChar();
       if(validacion == KeyEvent.VK_SPACE){
           JOptionPane.showMessageDialog(null,"Este campo no admite espacios");
           evt.consume();
       }}

    @SuppressWarnings("empty-statement")
    public void validacion_registro_cliente(JTable result,JTextField nombre,JTextField apellido,JComboBox tipo_doc,
            JTextField n_documeto,JComboBox genero,JTextField direccion,JTextField telefono,JTextArea observacion,
            JTextField celular,JTextField ciudad){
 String nom,ape,tipo,gener,direccio,ciuda,observacio,doc,tel,celu;;
nom=nombre.getText();
ape=apellido.getText();
tipo=(String)tipo_doc.getSelectedItem();
gener=(String)genero.getSelectedItem();
direccio=direccion.getText();
ciuda=ciudad.getText();
observacio=observacion.getText();
doc=n_documeto.getText();
tel=telefono.getText();
celu=celular.getText();
    if(nom.equals("") || ape.equals("") || tipo.equals(".........") || gener.equals(".............") || direccio.equals("")
             || ciuda.equals("") || observacio.equals("") || doc.equals("") || tel.equals("") || celu.equals("")
            ){
        JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
    }else{
    metodos met=new metodos();
    met.ingresar_cliente(result, nombre, apellido, tipo_doc, n_documeto, genero, direccion, telefono, observacion, celular, ciudad);
    }
}
public void completar_inventario(JTextField cd,JTextField p,JSpinner n1,JComboBox descuento,JTextField iva,JTextField Subtotal,JTextField neto){
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps;
	ResultSet rs;
        int prendas,total;
        String existencia ="",pre;
        
        pre=n1.getValue().toString();
        prendas=Integer.parseInt(pre);
        cod_pro=cd.getText();
        
    try {
		String query="SELECT `cod_produtos`,`existencias` FROM `productos` WHERE `cod_produtos`="+cod_pro+"";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 existencia = rs.getString("existencias");
              }
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
     int ex=Integer.parseInt(existencia);
     if(ex<1){
         JOptionPane.showMessageDialog(null,"No hay existencias del producto por favor revisa el inventario");
         existencias1="";
     }else if(ex>1){
         if(prendas>ex){
             JOptionPane.showMessageDialog(null,"el numero de prendas supera las existencias del producto por favor revisa el inventario");
             existencias1="";
         }else if(ex>=prendas){
             total=ex-prendas;
             existencias1=String.valueOf(total);
        total to=new total();
        to.total(p, n1, descuento, iva, Subtotal, neto);
         }
     }}
    public void verificacion_existencias_ingreso(){
    
}
    public void validacion_de_campos_empleados(JTable result,JComboBox tipo_documento,JTextField documento,JTextField nombres,JTextField apellidos,
            JTextField direcccion,JTextField telefono){
        
        String documento1,nombres1,apellidos1,direcccion1,telefono1,tipo_documento1;
        tipo_documento1=(String) tipo_documento.getSelectedItem();
        documento1=documento.getText();
        nombres1=nombres.getText();
        apellidos1=apellidos.getText();
        direcccion1=direcccion.getText();
        telefono1=telefono.getText();
        
        if(documento1.equals("") || nombres1.equals("") || apellidos1.equals("") || direcccion1.equals("") || telefono1.equals("") || tipo_documento1.equals("............")){
            JOptionPane.showMessageDialog(null,"Faltas campos por llenar");
        }else{
         metodos met=new metodos();
         met.ingresar_empleados(tipo_documento, documento, nombres, apellidos, direcccion, telefono);
         met.mostrar_empleados(result);
        }
        
    }
    
    public void validacion_de_campos_usuario_contraseña(JTextField usuario_actual,JTextField clave_actual,JTextField usuario_nuevo,JTextField contraseña_nueva,JTextField verificar_contraseña){
        String usuario_actual1,clave_actual1,usuario_nuevo1,contraseña_nueva1,verificar_contraseña1;
        
        usuario_actual1=usuario_actual.getText();
        clave_actual1=clave_actual.getText();
        usuario_nuevo1=usuario_nuevo.getText();
        contraseña_nueva1=contraseña_nueva.getText();
        verificar_contraseña1=verificar_contraseña.getText();
        
        if(usuario_actual1.equals("") || clave_actual1.equals("") || usuario_nuevo1.equals("") || contraseña_nueva1.equals("") || verificar_contraseña1.equals("")){
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
        }else{
        metodos met=new metodos();
        met.actualizar_contraseña_usuario_login(usuario_actual,clave_actual,usuario_nuevo,contraseña_nueva,verificar_contraseña);
        }}
    
    public void validacion_de_campos_contraseña(JTextField usuario_actual,JTextField clave_actual,JTextField contraseña_nueva,JTextField verificar_contraseña){
        String usuario_actual1,clave_actual1,contraseña_nueva1,verificar_contraseña1;
        
        usuario_actual1=usuario_actual.getText();
        clave_actual1=clave_actual.getText();
        contraseña_nueva1=contraseña_nueva.getText();
        verificar_contraseña1=verificar_contraseña.getText();
        
        if(usuario_actual1.equals("") || clave_actual1.equals("")  || contraseña_nueva1.equals("") || verificar_contraseña1.equals("")){
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
        }else{
        metodos met=new metodos();
        met.actualizar_contraseña_login(usuario_actual,clave_actual,contraseña_nueva,verificar_contraseña);
        }}
    
    public void validacion_de_campos_empleados(JTextField usuario_actual,JTextField clave_actual,JTextField usuario_nuevo,JTextField contraseña_nueva,JTextField verificar_contraseña){
        String usuario_actual1,clave_actual1,usuario_nuevo1,contraseña_nueva1,verificar_contraseña1;
        
        usuario_actual1=usuario_actual.getText();
        clave_actual1=clave_actual.getText();
        usuario_nuevo1=usuario_nuevo.getText();
        contraseña_nueva1=contraseña_nueva.getText();
        verificar_contraseña1=verificar_contraseña.getText();
        
        if(usuario_actual1.equals("") || clave_actual1.equals("")  || usuario_nuevo1.equals("")  || contraseña_nueva1.equals("") || verificar_contraseña1.equals("")){
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
        }else{
        metodos met=new metodos();
        met.actualizar_usuario_empleado(usuario_actual,clave_actual,usuario_nuevo,contraseña_nueva,verificar_contraseña);
        }}
    
    public void validacion_campos_nuevo_usuario(JTextField usuario_nuevo,JTextField contraseña_nueva,JTextField verificar_contraseña){
        String usuario_nuevo1,contraseña_nueva1,verificar_contraseña1;
        
        usuario_nuevo1=usuario_nuevo.getText();
        contraseña_nueva1=contraseña_nueva.getText();
        verificar_contraseña1=verificar_contraseña.getText();
        
        if(usuario_nuevo1.equals("") || contraseña_nueva1.equals("") || verificar_contraseña1.equals("")){
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar");
        }else{
            metodos met=new metodos();
            met.ingresar_usuario_nuevo_empleado(usuario_nuevo, contraseña_nueva, verificar_contraseña);
        }
    }
    
    public void verificacion_graficos(JDateChooser desde,JDateChooser hasta,JTextField buscar,JComboBox busqueda,JRadioButton tresd,JRadioButton dosd,JRadioButton barra,JRadioButton circular,JPanel nuevo){
       
        SimpleDateFormat format2=new SimpleDateFormat("MM");
        int mesi=Integer.parseInt(format2.format(desde.getDate()));
        int mesf=Integer.parseInt(format2.format(hasta.getDate()));
        
        if(busqueda.getSelectedItem().equals("................")){
            graficost="";
            JOptionPane.showMessageDialog(null,"Por favor selecciona una categoria");
         }else if(busqueda.getSelectedItem().equals("infome ventas por mes")){
        if(mesi==mesf){
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta ya que el mes incial es el mismo del mes final");
        }else if(mesi>mesf){
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta ya que el mes incial es superior al mes final");
            Date fecha=new Date();
            desde.setDate(fecha);
        }else if(mesf>mesi){
        graficos1 gra=new graficos1();
        try {
            gra.mescontado(desde, hasta);
            gra.tipos_de_graficos(tresd, dosd, barra, circular, nuevo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se encontro ningun resultado vuelve intentarlo");
        }}
            
        }else if(busqueda.getSelectedItem().equals("informe ventas por vendedor")){
        
        graficost="";
        String buscar1=buscar.getText(); 
        if(buscar1.equals("")){
            JOptionPane.showMessageDialog(null,"por favor escribe el nombre vendedor");
        }else if(mesi==mesf){
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta ya que el mes incial es el mismo del mes final");
        }else if(mesi>mesf){
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta ya que el mes incial es superior al mes final");
            Date fecha=new Date();
            desde.setDate(fecha);
        }else if(mesf>mesi){
        graficos1 gra=new graficos1();
        try {
            gra.mescontado_vendedor(desde, hasta, buscar);
            gra.tipos_de_graficos(tresd, dosd, barra, circular, nuevo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se encontro ningun resultado vuelve intentarlo");
        }}
            
        }else if(busqueda.getSelectedItem().equals("informe ventas por vendedores")){
        
        if(mesi>mesf){
            JOptionPane.showMessageDialog(null,"No se puede realizar la consulta ya que el mes incial es superior al mes final");
            Date fecha=new Date();
            desde.setDate(fecha);
        }else if(mesf>mesi){
        graficos1 gra=new graficos1();
        try {
             gra.mescontando_vendedores(desde, hasta);
             gra.tipo_grafico_vendedores(tresd, dosd, barra, circular, nuevo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se encontro ningun resultado vuelve intentarlo");
        }
            
            
        }else if(busqueda.getSelectedItem().equals("raking de ventas")){
        graficost="";    
        
        
        }
    }}
    public void borrar_estadisticas(JDateChooser desde,JDateChooser hasta,JTextField buscar,JComboBox busqueda,JRadioButton tresd,JRadioButton dosd,JRadioButton barra,JRadioButton circular,JPanel nuevo){
        comparacion comp=new comparacion();
        if(tresd.isSelected()){
            total=0;
            comp.verificacion_graficos(desde, hasta, buscar, busqueda, tresd, dosd, barra, circular, nuevo);
        }else if(dosd.isSelected()){
            total=0;
            comp.verificacion_graficos(desde, hasta, buscar, busqueda, tresd, dosd, barra, circular, nuevo);
        }else if(barra.isSelected()){
            total=0;
            comp.verificacion_graficos(desde, hasta, buscar, busqueda, tresd, dosd, barra, circular, nuevo);
        }else if(circular.isSelected()){
            total=0;
            comp.verificacion_graficos(desde, hasta, buscar, busqueda, tresd, dosd, barra, circular, nuevo);
        }
        
    }
}
