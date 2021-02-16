
package pruebas;

import java.util.*;  
public class lista{  
    
public static void main(String args[]){  
 //Crea una lista
 List<String> list=new ArrayList<>();  
 //Adiciona elementos 
 list.add("Mango");  
 list.add("Apple");  
 list.add("Banana");  
 list.add("Grapes");  
 //Iterating the List element using for-each loop  
 for(String fruit:list)  
  System.out.println(fruit);  
  
}  
}  