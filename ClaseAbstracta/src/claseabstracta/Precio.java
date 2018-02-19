
package claseabstracta;
import java.awt.Font;
import java.io.*;
import java.util.Scanner;



 @Override
    public void cuota(){      
        System.out.printIn("La cuota a pagar sera de $74 + 16% IVA");
        
    }
}



 @Override
public abstract class auto extends autopista{
   
    public void cuota(){
        System.out.printIn("La cuota a pagar sera de $107.50 + 16% IVA");
    }
}



 @Override
public abstract class Camion extends autopista{
    
    public void cuota(){
        System.out.printIn("La cuota a pagar sera de $125 + 15.50 por tonelada + 16 de IVA");
    }
}