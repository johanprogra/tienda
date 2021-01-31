
package funciones;

import static funciones.autocompletar.ns1;
import static funciones.autocompletar.ns2;
import static funciones.autocompletar.ns3;
import static funciones.autocompletar.ns5;
import static funciones.autocompletar.ns6;
import static funciones.autocompletar.ns7;
import static funciones.autocompletar.ns8;
import static funciones.autocompletar.ns9;
import static funciones.autocompletar.ns13;
import static funciones.autocompletar.ns14;
import static funciones.autocompletar.ns15;
import static funciones.autocompletar.ns16;
import static funciones.autocompletar.ns17;
import static funciones.autocompletar.ns18;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class crear_excel1 {
    
    
public void crear_excel(){
       
           
}
 public void excele(){
        autocompletar auto=new autocompletar();
        auto.enviar_a_excel();

        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Hoja de datos");
        Map<String, Object[]> datos = new TreeMap<String, Object[]>();
        datos.put("08", new Object[]{"Numero de factura","777777"+ns1,"","",""});
        datos.put("09", new Object[]{"Fecha",ns2,"","",""});
        datos.put("10", new Object[]{"","","","",""});
        datos.put("11", new Object[]{"","","","",""});
        datos.put("12", new Object[]{"Doc identidad cliente",ns3,"","Nombre",ns18});
        datos.put("13", new Object[]{"Dirección",ns5,"","",""});
        datos.put("14", new Object[]{"Ciudad",ns6,"","",""});
        datos.put("15", new Object[]{"Telefono",ns7,"","Nombre del vendedor","Doc identidad vendedor"});
        datos.put("16", new Object[]{"","","",ns9,ns8,""});
        datos.put("17", new Object[]{"","","","",""});
        datos.put("18", new Object[]{"Forma de pago","","","Subtotal",""});
        datos.put("19", new Object[]{ns13,"","",ns14,""});
        datos.put("20", new Object[]{"","","","",""});
        datos.put("21", new Object[]{"","Descuento",ns15,"",""});
        datos.put("22", new Object[]{"","IVA",ns16,"",""});
        datos.put("23", new Object[]{"","Neto Pagado",ns17,"",""});
        
        Set keyset = datos.keySet();
        int colummna = 7;
        for (Object key : keyset) {
            Row row = sheet.createRow(colummna++);
            Object[] arregloObjetos = datos.get(key);
            int fila = 7;
            for (Object obj : arregloObjetos) {
                Cell cell = row.createCell(fila++);
                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer) obj);
                }
            }
        }
        try {
            
            FileOutputStream out = new FileOutputStream(new File("C:/Users/jl-im/Desktop/Factura-777777"+ns1+".xls"));
            workbook.write(out);
            out.close();
            JOptionPane.showMessageDialog(null,"Se a creado el archivo de excel");
        } catch (Exception e) {
            e.printStackTrace();
        }
 }

}
