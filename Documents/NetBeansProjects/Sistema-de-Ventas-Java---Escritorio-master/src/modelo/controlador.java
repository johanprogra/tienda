
package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;


public class controlador implements ActionListener{

    ventasDao Dao=new ventasDao();
        venta vent=new venta();
        ventasDao_1 ven=new ventasDao_1();
        DefaultTableModel modelo= new DefaultTableModel();
        public controlador(ventas v){
         this.ven=v;
         this.ven.most.addActionListener(this);
        }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ven.most){
            listar(ven.result);
        }
    }
        public void listar(JTable tabla){
        modelo=(DefaultTableModel)tabla.getModel();
        List<venta>lista=Dao.listar();
        Object[]object=new Object[10];
        for(int i=0;i<lista.size();i++){
        object[0]=lista.get(i).getCod_cod();
        object[1]=lista.get(i).getCod_empleado();
        object[2]=lista.get(i).getVendedor();
        object[3]=lista.get(i).getCliente();
        object[4]=lista.get(i).getCod_producto();
        object[5]=lista.get(i).getNombre_producto();
        object[6]=lista.get(i).getPrecio();
        object[7]=lista.get(i).getBodega();
        object[8]=lista.get(i).getN_prendas();
        object[9]=lista.get(i).getDescuento();
        modelo.addRow(object);
    }
        ven.result.setModel(modelo);
    }
    
}
