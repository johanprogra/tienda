package prebas2;
import java.util.ArrayList;

public class pila {
private ArrayList<Object>pila=new ArrayList<>();

private void push(Object elemento){
    pila.add(elemento);
}
private Object pop(){
    if(!pila.isEmpty()){
        return pila.get(pila.size()-1);
    }else{
        return null;
    }
}
   private void peek(){
       
   }
   private void empy(){
       
   }
   private int size(){
       return pila.size();
   }
    public static void main(String[] args) {
        
    }
    
}
