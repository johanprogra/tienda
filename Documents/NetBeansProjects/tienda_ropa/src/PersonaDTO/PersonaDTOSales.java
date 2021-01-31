
package PersonaDTO;

public class PersonaDTOSales {

    private int ID_Cod_ventas;
    private int Cod_empleados;
    private int Doc_empleado;
    private String ciudad;
    private String vendedor;
    private String cliente;
    private int N_doc_cliente;
    private String Direccion_cliente;
    private int Telefono_cliente;
    private int cod_producto;
    private int nombre_producto;
    private int precio;
    private String bodega;
    private int N_productos;
    private int descuento;
    private int pago;
    private int iva;
    private int subtotal;
    private int neto;
    private String fecha;    
    

    public PersonaDTOSales() {}
    
    public PersonaDTOSales(int ID_Cod_ventas) {this.ID_Cod_ventas=ID_Cod_ventas;}

    public int getID_Cod_ventas() {return ID_Cod_ventas;}

    public void setID_Cod_ventas(int ID_Cod_ventas) {this.ID_Cod_ventas = ID_Cod_ventas;}

    public int getCod_empleados() {return Cod_empleados;}

    public void setCod_empleados(int Cod_empleados) { this.Cod_empleados = Cod_empleados;}

    public int getDoc_empleado() {return Doc_empleado;}

    public void setDoc_empleado(int Doc_emplado) {this.Doc_empleado = Doc_emplado;}

    public String getCiudad() {return ciudad;}

    public void setCiudad(String ciudad) {this.ciudad = ciudad;}

    public String getVendedor() {return vendedor;}

    public void setVendedor(String vendedor) {this.vendedor = vendedor;}

    public String getCliente() {return cliente;}

    public void setCliente(String cliente) {this.cliente = cliente;}

    public int getN_doc_cliente() {return N_doc_cliente;}

    public void setN_doc_cliente(int N_doc_cliente) {this.N_doc_cliente = N_doc_cliente;}

    public String getDireccion_cliente() {return Direccion_cliente;}

    public void setDireccion_cliente(String Direccion_cliente) {this.Direccion_cliente = Direccion_cliente;}

    public int getTelefono_cliente() {return Telefono_cliente;}

    public void setTelefono_cliente(int Telefono_cliente) {this.Telefono_cliente = Telefono_cliente;}

    public int getCod_producto() {return cod_producto;}

    public void setCod_producto(int cod_producto) {this.cod_producto = cod_producto;}

    public int getNombre_producto() {return nombre_producto;}

    public void setNombre_producto(int nombre_producto) {this.nombre_producto = nombre_producto;}

    public int getPrecio() {return precio;}

    public void setPrecio(int precio) {this.precio = precio;}

    public String getBodega() {return bodega;}

    public void setBodega(String bodega) {this.bodega = bodega;}

    public int getN_productos() {return N_productos;}

    public void setN_productos(int N_productos) {this.N_productos = N_productos;}

    public int getDescuento() {return descuento;}

    public void setDescuento(int descuento) {this.descuento = descuento;}

    public int getPago() {return pago;}

    public void setPago(int pago) {this.pago = pago;}

    public int getIva() {return iva;}

    public void setIva(int iva) {this.iva = iva;}

    public int getSubtotal() {return subtotal;}

    public void setSubtotal(int subtotal) {this.subtotal = subtotal;}

    public int getNeto() {return neto;}

    public void setNeto(int neto) {this.neto = neto;}

    public String getFecha() {return fecha;}

    public void setFecha(String fecha) {this.fecha = fecha;}

}
