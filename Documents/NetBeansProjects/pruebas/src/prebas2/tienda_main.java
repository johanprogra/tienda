
package prebas2;


public class tienda_main {

    
    public static void main(String[] args) {
        tienda_verduras verduras=new tienda_verduras();
        verduras.setCantidad(10);
        verduras.setName("tomate");
        verduras.setPrecio(50000);
        System.out.println(verduras.getCantidad());
    }
    
}
