package tabla;


 class Tabla { 
     private int numTabla; 
     private int limite; 
     public void multTabla( ) { 
         
         for (int i=1; i<= limite; i++) 
             System.out.println(numTabla + "x" + i + "=" + (numTabla*i)); } 
     public Tabla(int num, int limite) { 
         numTabla = num; 
         this.limite = limite; 
     
     } 
 }

