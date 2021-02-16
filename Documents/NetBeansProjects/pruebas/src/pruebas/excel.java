
package pruebas;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;






public class excel {
    
    
public void crear_excel(){
       
           
}
 public static void main(String[] args) {
        //Crear libro de trabajo en blanco
        Workbook workbook = new HSSFWorkbook();
        //Crea hoja nueva
        Sheet sheet = workbook.createSheet("Hoja de datos");
        //Por cada línea se crea un arreglo de objetos (Object[])
        Map<String, Object[]> datos = new TreeMap<String, Object[]>();
        datos.put("08", new Object[]{"Numero de factura","","","",""});
        datos.put("09", new Object[]{"Fecha","","","",""});
        datos.put("10", new Object[]{"","","","",""});
        datos.put("11", new Object[]{"","","","",""});
        datos.put("12", new Object[]{"Doc identidad cliente","","","Nombre",""});
        datos.put("13", new Object[]{"Dirección","","","",""});
        datos.put("14", new Object[]{"Ciudad","","","",""});
        datos.put("15", new Object[]{"Telefono","","","Nombre del vendedor","Doc identidad vendedor"});
        datos.put("16", new Object[]{"","","","",""});
        datos.put("17", new Object[]{"","","","",""});
        datos.put("18", new Object[]{"Forma de pago","","","Subtotal",""});
        datos.put("19", new Object[]{"","","","",""});
        datos.put("20", new Object[]{"","","","",""});
        datos.put("21", new Object[]{"","Descuento","","",""});
        datos.put("22", new Object[]{"","IVA","","",""});
        datos.put("23", new Object[]{"","Neto Pagado","","",""});
        //Iterar sobre datos para escribir en la hoja
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
            //Se genera el documento
            FileOutputStream out = new FileOutputStream(new File("C:/Users/jl-im/Desktop/ejemplo.xls"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}

}
