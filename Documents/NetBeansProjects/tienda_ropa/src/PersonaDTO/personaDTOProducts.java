
package PersonaDTO;

public class personaDTOProducts {
    
    private static int cod_Id;
    private static int cod_producto;
    private static String nombre_producto;
    private static int precio;
    private static String talla;
    private static String color;
    private static int existencias;
    private static String fecha_de_ingreso;

    public personaDTOProducts() {}

    public int getCod_Id() {return cod_Id;}

    public void setCod_Id(int cod_Id) {this.cod_Id = cod_Id;}
    
    public int getCod_producto() {return cod_producto;}

    public void setCod_producto(int cod_producto) {this.cod_producto = cod_producto;}

    public String getNombre_producto() {return nombre_producto;}

    public void setNombre_producto(String nombre_producto) {this.nombre_producto = nombre_producto;}

    public int getPrecio() {return precio;}

    public void setPrecio(int precio) {this.precio = precio;}

    public String getTalla() {return talla;}

    public void setTalla(String talla) {this.talla = talla;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public int getExistencias() {return existencias;}

    public void setExistencias(int existencias) {this.existencias = existencias;}

    public String getFecha_de_ingreso() {return fecha_de_ingreso;}

    public void setFecha_de_ingreso(String fecha_de_ingreso) {this.fecha_de_ingreso = fecha_de_ingreso;}
    
}
