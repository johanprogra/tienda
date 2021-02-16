
package Funciones;
import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static aplicacion.estudiantes.est1;
import static aplicacion.estudiantes.est10;
import static aplicacion.estudiantes.est2;
import static aplicacion.estudiantes.est3;
import static aplicacion.estudiantes.est4;
import static aplicacion.estudiantes.est5;
import static aplicacion.estudiantes.est6;
import static aplicacion.estudiantes.est7;
import static aplicacion.estudiantes.est8;
import static aplicacion.estudiantes.est9;
import aplicacion.no_asistieron;
import java.sql.PreparedStatement;


public class funcionestudiantes {
    public static String et1="";
    public static String et2="";
    public static String et3="";
    public static String et4="";
    public static String et5="";
    public static String et6="";
    public static String et7="";
    public static String et8="";
    public static String et9="";
    public static String et10="";
    
    public void comparar(String t1){
        if(t1.equals("N01")){
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null; 
        
        for (int i = 1; i <= 10; i++){
        
        try {
		String query="SELECT `ID_nit`, `N01` FROM `estudiantes` WHERE `ID_nit`='"+i+"'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 String ns1 = rs.getString("N01");
                 String ns2 = rs.getString("ID_nit");
                 if(ns2.equals("1")){
                     et1=ns1;
                 }
                 else if(ns2.equals("2")){
                     et2=ns1;
                 }
                 else if(ns2.equals("3")){
                     et3=ns1;
                 }
                 else if(ns2.equals("4")){
                     et4=ns1;
                 }
                 else if(ns2.equals("5")){
                     et5=ns1;
                 }
                 else if(ns2.equals("6")){
                     et6=ns1;
                 }
                 else if(ns2.equals("7")){
                     et7=ns1;
                 }
                 else if(ns2.equals("8")){
                     et8=ns1;
                 }
                 else if(ns2.equals("9")){
                     et9=ns1;
                 }
                 else if(ns2.equals("10")){
                     et10=ns1;
                 }
                 
                 
              }
              
 
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }     
        
        }}
        
        else if(t1.equals("N02")){
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null; 
        
        for (int i = 1; i <= 10; i++){
        
        try {
		String query="SELECT `ID_nit`, `N02` FROM `estudiantes` WHERE `ID_nit`='"+i+"'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 String ns1 = rs.getString("N02");
                 String ns2 = rs.getString("ID_nit");
                 if(ns2.equals("1")){
                     et1=ns1;
                 }
                 else if(ns2.equals("2")){
                     et2=ns1;
                 }
                 else if(ns2.equals("3")){
                     et3=ns1;
                 }
                 else if(ns2.equals("4")){
                     et4=ns1;
                 }
                 else if(ns2.equals("5")){
                     et5=ns1;
                 }
                 else if(ns2.equals("6")){
                     et6=ns1;
                 }
                 else if(ns2.equals("7")){
                     et7=ns1;
                 }
                 else if(ns2.equals("8")){
                     et8=ns1;
                 }
                 else if(ns2.equals("9")){
                     et9=ns1;
                 }
                 else if(ns2.equals("10")){
                     et10=ns1;
                 }
                 
                 
              }
              
 
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }     
        
        }}
        else if(t1.equals("N03")){
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null; 
        
        for (int i = 1; i <= 10; i++){
        
        try {
		String query="SELECT `ID_nit`, `N03` FROM `estudiantes` WHERE `ID_nit`='"+i+"'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 String ns1 = rs.getString("N03");
                 String ns2 = rs.getString("ID_nit");
                 if(ns2.equals("1")){
                     et1=ns1;
                 }
                 else if(ns2.equals("2")){
                     et2=ns1;
                 }
                 else if(ns2.equals("3")){
                     et3=ns1;
                 }
                 else if(ns2.equals("4")){
                     et4=ns1;
                 }
                 else if(ns2.equals("5")){
                     et5=ns1;
                 }
                 else if(ns2.equals("6")){
                     et6=ns1;
                 }
                 else if(ns2.equals("7")){
                     et7=ns1;
                 }
                 else if(ns2.equals("8")){
                     et8=ns1;
                 }
                 else if(ns2.equals("9")){
                     et9=ns1;
                 }
                 else if(ns2.equals("10")){
                     et10=ns1;
                 }
                 
                 
              }
              
 
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }     
        
        }}
        
    }
            
    
     public void enviar(boolean e11,boolean e12,boolean e13,boolean e14,boolean e15,boolean e16,boolean e17,boolean e18,boolean e19,boolean e20,String cp,String cp2,String cp3,String cp4,String cp5,String cp6,String cp7,String cp8,String cp9,String cp10){
         if(e11){
        }
        else{
            String a1 = cp;
            est1 = a1;
        }
        if(e12){
        }
        else{
            String a2 = cp2;
            est2 = a2;
        }
        if(e13){
        }
        else{
            String a3 = cp3;
            est3 = a3;
        }
        if(e14){
        }
        else{
            String a4 = cp4;
            est4 = a4;
        }
        if(e15){
        }
        else{
            String a5 = cp5;
            est5 = a5;
        }
        if(e16){
        }
        else{
            String a6 = cp6;
            est6 = a6;
        }
        if(e17){
        }
        else{
            String a7 = cp7;
            est7 = a7;
        }
        if(e18){
        }
        else{
            String a8 = cp8;
            est8 = a8;
        }
        if(e19){
        }
        else{
            String a9 = cp9;
            est9 = a9;
        }
        if(e20){
        }
        else{
            String a10 = cp10;
            est10 = a10;
        }
        no_asistieron e2=new no_asistieron();
        e2.setVisible(true);
         
     }
     
}
