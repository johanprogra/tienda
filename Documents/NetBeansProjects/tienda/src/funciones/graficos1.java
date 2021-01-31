
package funciones;

import baseDatos.conexionMYSQL;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class graficos1 {
    public static String g1="",fechai="",fechaf="",buscar1="",vend1="",vend2="",vend3="",vend4="",vend5="",graficost="";
        public static int idi=0,idif=0,total=0,mes,mest=0,enero,febrero,marzo,abril,marzo1,abril1
            ,mayo,junio,julio,agosto,septiembre,octubre,noviembre,diciembre,ven1,ven2,ven3,ven4,ven5;
        public static int [] numeros=new int[idif];
        
        DefaultTableModel modelo= new DefaultTableModel();
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        
       public void meses()throws SQLException{
        String query;
        query=("SELECT `ID_cod` FROM `ventas` WHERE `fecha` between '"+fechai+"' AND '"+fechaf+"'");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.first()){
            idi= Integer.parseInt(rs.getString("ID_cod"));
            int cont1=idi-1;
            idi=cont1;
         }
        if(rs.last()){
            idif=Integer.parseInt(rs.getString("ID_cod"));
         }
        }
    public void neto(JDateChooser hasta) throws SQLException{
        int cont1,tol,t;
        String query;
        
        for(int i=0;i<idif;i++){
            if(idif>idi){
        cont1=idi+1;
        idi=cont1;
        
        query=("SELECT `neto` FROM `ventas` WHERE `fecha` between '"+fechai+"' AND '"+fechaf+"'");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.next()){
            g1= rs.getString("neto");
            String c[] = g1.split(" ",2);
            String ac = c[1];
            String valor2 = ac.replace(".","").replace(",", ".");
            tol=Integer.parseInt(valor2);
            t=tol+total;
            total=t;
         }}}
        
    }
public void neto_vendedor(JDateChooser hasta,JTextField buscar) throws SQLException{
        int cont1,tol,t;
        String query,vendededor;
        vendededor=buscar.getText();
        for(int i=0;i<idif;i++){
            if(idif>idi){
        cont1=idi+1;
        idi=cont1;
        
        query=("SELECT `neto` FROM `ventas` WHERE `fecha` between '"+fechai+"' AND '"+fechaf+"' AND vendedor LIKE '%"+vendededor+"%'");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.next()){
            g1= rs.getString("neto");
            String c[] = g1.split(" ",2);
            String ac = c[1];
            String valor2 = ac.replace(".","").replace(",", ".");
            tol=Integer.parseInt(valor2);
            t=tol+total;
            total=t;
         }}}
        
    }
public void neto_vendedores() throws SQLException{
        int cont1,tol,t;
        String query;
        
        for(int i=0;i<idif;i++){
            if(idif>idi){
        cont1=idi+1;
        idi=cont1;
        
        query=("SELECT `neto` FROM `ventas` WHERE `fecha` between '"+fechai+"' AND '"+fechaf+"' AND vendedor LIKE '%"+buscar1+"%'");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.next()){
            g1= rs.getString("neto");
            String c[] = g1.split(" ",2);
            String ac = c[1];
            String valor2 = ac.replace(".","").replace(",", ".");
            tol=Integer.parseInt(valor2);
            t=tol+total;
            total=t;
         }}}
        
    }
public void mescontando_vendedores(JDateChooser desde,JDateChooser hasta) throws SQLException{
    graficos1 gra=new graficos1();
    SimpleDateFormat format2=new SimpleDateFormat("MM");
    mest=Integer.parseInt(format2.format(desde.getDate()));
    if(graficost.equals("gra")){
    }else if(graficost.equals("")){
    for(int i=6;i>0;i--){
        
        switch(i){
            case 1:
                buscar1=JOptionPane.showInputDialog(null,"Digita el quinto vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven5=total;
                vend5=buscar1;
                break;
            case 2:
                buscar1=JOptionPane.showInputDialog(null,"Digita el cuarto vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven4=total;
                vend4=buscar1;
                break;
            case 3:
                buscar1=JOptionPane.showInputDialog(null,"Digita el tercero vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven3=total;
                vend3=buscar1;
                break;
            case 4:
                buscar1=JOptionPane.showInputDialog(null,"Digita el segundo vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven2=total;
                vend2=buscar1;
                break;
            case 5:
                buscar1=JOptionPane.showInputDialog(null,"Digita el primer vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven1=total;
                vend1=buscar1;
                break;    
    }
        graficost="gra";
    }}
   
}
public void mescontado_vendedor(JDateChooser desde,JDateChooser hasta,JTextField buscar) throws SQLException{
        
        graficos1 gra=new graficos1();
        
        SimpleDateFormat format2=new SimpleDateFormat("MM");
        String mes1=format2.format(desde.getDate());
        String mes2=format2.format(hasta.getDate());
        int mesi=Integer.parseInt(mes1);
        mes=Integer.parseInt(mes2);
        
        for(int i=mes+1;i>=mesi;i--){
            mest=i;
        switch(mest){
               case 1:
               mest=1;    
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar);
               enero=total;
               break;
               case 2:
                   mest=2; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar); 
               febrero=total;
               break;
               case 3:
                   mest=3; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar);
               marzo=total;
               break;
               case 4:
                   mest=4; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar); 
               abril=total;
               break;
               case 5:
                   mest=5; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar); 
               mayo=total;
               break;
               case 6:
                   mest=6; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar);
               junio=total;
               break;
               case 7:
                   mest=7; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar); 
               julio=total;
               break;
               case 8:
                   mest=8; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar); 
               agosto=total;
               break;
               case 9:
                   mest=9; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar);
               septiembre=total;
               break;
               case 10:
                   mest=10; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar); 
               octubre=total;
               break;
               case 11:
                   mest=11; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar); 
               noviembre=total;
               break;
               case 12:
                   mest=12; 
               gra.meses();
               gra.dias(hasta);
               gra.neto_vendedor(hasta, buscar);
               diciembre=total;
               break;
        } }}

public void mescontado(JDateChooser desde,JDateChooser hasta) throws SQLException{
        
        graficos1 gra=new graficos1();
        
        SimpleDateFormat format2=new SimpleDateFormat("MM");
        String mes1=format2.format(desde.getDate());
        String mes2=format2.format(hasta.getDate());
        int mesi=Integer.parseInt(mes1);
        mes=Integer.parseInt(mes2);
        
        for(int i=mes+1;i>=mesi;i--){
            mest=i;
        switch(mest){
               case 1:
               mest=1;    
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta);
               enero=total;
               break;
               case 2:
                   mest=2; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta); 
               febrero=total;
               break;
               case 3:
                   mest=3; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta);
               marzo=total;
               break;
               case 4:
                   mest=4; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta); 
               abril=total;
               break;
               case 5:
                   mest=5; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta); 
               mayo=total;
               break;
               case 6:
                   mest=6; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta);
               junio=total;
               break;
               case 7:
                   mest=7; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta); 
               julio=total;
               break;
               case 8:
                   mest=8; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta); 
               agosto=total;
               break;
               case 9:
                   mest=9; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta);
               septiembre=total;
               break;
               case 10:
                   mest=10; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta); 
               octubre=total;
               break;
               case 11:
                   mest=11; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta); 
               noviembre=total;
               break;
               case 12:
                   mest=12; 
               gra.meses();
               gra.dias(hasta);
               gra.neto(hasta); 
               diciembre=total;
               break;
        } }}

public void neto_raking() throws SQLException{
    int cont1,tol,t;
        String query;
        
        for(int i=0;i<idif;i++){
            if(idif>idi){
        cont1=idi+1;
        idi=cont1;
        
        query=("SELECT `neto` FROM `ventas` WHERE `fecha` between '"+fechai+"' AND '"+fechaf+"'");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.next()){
            g1= rs.getString("neto");
            String c[] = g1.split(" ",2);
            String ac = c[1];
            String valor2 = ac.replace(".","").replace(",", ".");
            tol=Integer.parseInt(valor2);
            t=tol+total;
            total=t;
            
          int rest=((idif*2)-5)-idif;
          Arrays.sort(numeros);
          for (int j = rest; j < numeros.length; i++) {
          numeros[j]=total;
          }
            
         }}}
          
}

public void mes_contando_ranking(JDateChooser desde,JDateChooser hasta) throws SQLException{
      
    graficos1 gra=new graficos1();
    SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
    fechai=format1.format(desde.getDate());
    fechaf=format1.format(hasta.getDate());
  
    for(int i=6;i>0;i--){
        
        switch(i){
            case 1:
                buscar1=JOptionPane.showInputDialog(null,"Digita el quinto vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven5=total;
                vend5=buscar1;
                break;
            case 2:
                buscar1=JOptionPane.showInputDialog(null,"Digita el cuarto vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven4=total;
                vend4=buscar1;
                break;
            case 3:
                buscar1=JOptionPane.showInputDialog(null,"Digita el tercero vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven3=total;
                vend3=buscar1;
                break;
            case 4:
                buscar1=JOptionPane.showInputDialog(null,"Digita el segundo vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven2=total;
                vend2=buscar1;
                break;
            case 5:
                buscar1=JOptionPane.showInputDialog(null,"Digita el primer vendedor");
                gra.dias(hasta);
                gra.meses();
                gra.neto_vendedores();
                ven1=total;
                vend1=buscar1;
                break;    
    }}
}

public void dias(JDateChooser hasta){
            int año,dias=1;
        
        SimpleDateFormat format1=new SimpleDateFormat("YYYY");
        String año1=format1.format(hasta.getDate());
        año=Integer.parseInt(año1);
        if(mest==12){
         fechai=String.valueOf(año)+"-"+String.valueOf(mest)+"-"+String.valueOf(dias);
         fechaf=String.valueOf(año+1)+"-"+String.valueOf(1)+"-"+String.valueOf(dias);
        }else{
         fechai=String.valueOf(año)+"-"+String.valueOf(mest)+"-"+String.valueOf(dias);
         fechaf=String.valueOf(año)+"-"+String.valueOf(mest+1)+"-"+String.valueOf(dias);
        }
        }

        
    
    public void tipos_de_graficos(JRadioButton tresd,JRadioButton dosd,JRadioButton barra,JRadioButton circular,JPanel nuevo){
        DefaultCategoryDataset Datos = new DefaultCategoryDataset();
        DefaultPieDataset grafis1=new DefaultPieDataset();
        
        if(tresd.isSelected()){
           
Datos.addValue(enero, "Enero","1");
Datos.addValue(febrero, "Febrero","2" );
Datos.addValue(marzo, "marzo","3" );
Datos.addValue(abril, "abril", "4");
Datos.addValue(mayo, "mayo","5" );
Datos.addValue(junio, "junio","6" );
Datos.addValue(julio, "julio", "7");
Datos.addValue(agosto, "agosto","8" );
Datos.addValue(septiembre, "septiembre","9" );
Datos.addValue(octubre, "octubre", "10");
Datos.addValue(noviembre, "noviembre","11" );
Datos.addValue(diciembre, "diciembre","12" );

        
            JFreeChart ch = ChartFactory.createBarChart3D("    ventas por mes","ventas", "mes", Datos,PlotOrientation.VERTICAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            nuevo.add(cp);            
            cp.setBounds(620,200,500,400);
           
       }else if(dosd.isSelected()){
             
Datos.addValue(enero, "Enero","1");
Datos.addValue(febrero, "Febrero","2" );
Datos.addValue(marzo, "marzo","3" );
Datos.addValue(abril, "abril", "4");
Datos.addValue(mayo, "mayo","5" );
Datos.addValue(junio, "junio","6" );
Datos.addValue(julio, "julio", "7");
Datos.addValue(agosto, "agosto","8" );
Datos.addValue(septiembre, "septiembre","9" );
Datos.addValue(octubre, "octubre", "10");
Datos.addValue(noviembre, "noviembre","11" );
Datos.addValue(diciembre, "diciembre","12" );

            JFreeChart ch = ChartFactory.createBarChart("     ventas por mes","ventas", "mes", Datos,PlotOrientation.VERTICAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            nuevo.add(cp);            
            cp.setBounds(620,200,500,400);
            
        }        
        
         else if(barra.isSelected()){
            
             grafis1.setValue("enero", enero);
             grafis1.setValue("febrero", febrero);
             grafis1.setValue("marzo", marzo);
             grafis1.setValue("abril", abril);
             grafis1.setValue("mayo", mayo);
             grafis1.setValue("junio", junio);
             grafis1.setValue("julio", julio);
             grafis1.setValue("agosto", agosto);
             grafis1.setValue("septiembre", septiembre);
             grafis1.setValue("octubre", octubre);
             grafis1.setValue("noviembre", noviembre);
             grafis1.setValue("diciembre", diciembre);
             
            
             
            JFreeChart ch = ChartFactory.createPieChart3D("    ventas por mes", grafis1,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            nuevo.add(cp);            
            cp.setBounds(620,200,500,400);
            
        }        
         else if(circular.isSelected()){
             grafis1.setValue("enero", enero);
             grafis1.setValue("febrero", febrero);
             grafis1.setValue("marzo", marzo);
             grafis1.setValue("abril", abril);
             grafis1.setValue("mayo", mayo);
             grafis1.setValue("junio", junio);
             grafis1.setValue("julio", julio);
             grafis1.setValue("agosto", agosto);
             grafis1.setValue("septiembre", septiembre);
             grafis1.setValue("octubre", octubre);
             grafis1.setValue("noviembre", noviembre);
             grafis1.setValue("diciembre", diciembre);
             
            JFreeChart ch = ChartFactory.createPieChart("   ventas por mes", grafis1,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            nuevo.add(cp);            
            cp.setBounds(620,200,500,400);
            
        } }
    public void tipo_grafico_vendedores(JRadioButton tresd,JRadioButton dosd,JRadioButton barra,JRadioButton circular,JPanel nuevo){
        DefaultCategoryDataset Datos = new DefaultCategoryDataset();
        DefaultPieDataset grafis1=new DefaultPieDataset();
        if(tresd.isSelected()){
        Datos.addValue(ven1,vend1,"1");
        Datos.addValue(ven2,vend2,"2");
        Datos.addValue(ven3,vend3,"3");
        Datos.addValue(ven4,vend4,"4");
        Datos.addValue(ven5,vend5,"5");
        
        JFreeChart ch = ChartFactory.createBarChart3D("    ventas por vendedores","", "ventas", Datos,PlotOrientation.VERTICAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            nuevo.add(cp);            
            cp.setBounds(620,200,500,400);
        }else if(dosd.isSelected()){
        
        Datos.addValue(ven1,vend1,"1");
        Datos.addValue(ven2,vend2,"2");
        Datos.addValue(ven3,vend3,"3");
        Datos.addValue(ven4,vend4,"4");
        Datos.addValue(ven5,vend5,"5");
        
        JFreeChart ch = ChartFactory.createBarChart("    ventas por vendedores","ventas", "ventas", Datos,PlotOrientation.VERTICAL, true, true, false);
        ChartPanel cp = new ChartPanel(ch);
        nuevo.add(cp);            
        cp.setBounds(620,200,500,400);
            
        }else if(barra.isSelected()){
            
             grafis1.setValue(vend1, ven1);
             grafis1.setValue(vend2, ven1);
             grafis1.setValue(vend3, ven1);
             grafis1.setValue(vend4, ven1);
             grafis1.setValue(vend5, ven1);
             
            JFreeChart ch = ChartFactory.createPieChart3D("    ventas por mes", grafis1,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            nuevo.add(cp);            
            cp.setBounds(620,200,500,400);
            
        }else if(circular.isSelected()){
            
             grafis1.setValue(vend1, ven1);
             grafis1.setValue(vend2, ven1);
             grafis1.setValue(vend3, ven1);
             grafis1.setValue(vend4, ven1);
             grafis1.setValue(vend5, ven1);
             
            JFreeChart ch = ChartFactory.createPieChart("    ventas por mes", grafis1,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            nuevo.add(cp);            
            cp.setBounds(620,200,500,400);
        }
    }
    
}
