package prebas2;




public class arreglos3 {
    public void arreglos1(){
        int numeros[]=  new int [20];
        numeros[15]=100;
        
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    public void arreglos1(int numeros[]){
        numeros[5]=1;
    }
    public void lista(){
        
        
    }

    public static void main(String[] args) {
        
         int numeros[][]=new int[5][5];
         int datos[][]={
             {1,2,3,4,5},
             {5,4,3,2,1}
         };
         for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
                 System.out.println(datos[i][j]);
             }
         }
    }
    
}
