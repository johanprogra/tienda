
package functions;

import PersonaDTO.personaDTOProducts;

import javax.swing.JTextField;

public class funtionOperations {

    private int amount;
    
    private float discount;
    
    private int precio;
    
    private int price;
    
    private float descuento;
    
    private int signo;

    public funtionOperations() {}

    public funtionOperations(int amount,float discount) {this.amount = amount;this.discount = discount;}
    
    public void operations(JTextField IVA,JTextField Subtotal,JTextField neto){
        personaDTOProducts products=new personaDTOProducts();
        
        precio=products.getPrecio();
        
        if (discount<1) { price=0;descuento=1;signo=-1;} else{price=precio*amount;descuento=discount/100;signo=1;}
        
        float subtotali=(int) ((price-((precio*amount)*descuento))*signo);
        
        int subtotal=(int) subtotali;
        
        float ivai=(int) (subtotal*0.19);
        
        int iva=(int) ivai;
        
        int total=(int) (subtotal+iva);
        
        IVA.setText(String.valueOf(iva));
        Subtotal.setText(String.valueOf(subtotal));
        neto.setText(String.valueOf(total));
        
    }
}
