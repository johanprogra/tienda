
package modelo;


public class venta {
    int Cod_cod;
    int Cod_empleado;
    String vendedor;
    String cliente;
    String cod_producto;
    String nombre_producto;
    int precio;
    String bodega ;
    int n_prendas;
    int descuento;
    public venta(){
}
    public venta(int Cod_cod,int Cod_empleado,String vendedor,String cliente,String cod_producto,
    String nombre_producto,int precio,String bodega,int n_prendas,int descuento){
        this.Cod_cod=Cod_cod;
        this.Cod_empleado=Cod_empleado;
        this.vendedor=vendedor;
        this.cliente=cliente;
        this.cod_producto=cod_producto;
        this.nombre_producto=nombre_producto;
        this.precio=precio;
        this.bodega=bodega;
        this.n_prendas=n_prendas;
        this.descuento=descuento;
    }

    public int getCod_cod() {
        return Cod_cod;
    }

    public void setCod_cod(int Cod_cod) {
        this.Cod_cod = Cod_cod;
    }

    public int getCod_empleado() {
        return Cod_empleado;
    }

    public void setCod_empleado(int Cod_empleado) {
        this.Cod_empleado = Cod_empleado;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public int getN_prendas() {
        return n_prendas;
    }

    public void setN_prendas(int n_prendas) {
        this.n_prendas = n_prendas;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

   

    
}

