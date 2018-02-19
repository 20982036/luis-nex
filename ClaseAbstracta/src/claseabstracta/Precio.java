
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


//*la opcion "tipo" será el tipo de transporte que pase por la autopista*


public DetallePrecio(int tipo, String sincasco, String tonelada, double precio) throws IOException{
        autopista(codigo, descripcion, perecedero, cantidad, precio);
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
        this.aumento = aumento;
        
        iva = precio * 0.16;
        subtotal = precio*cantidad;
        total = iva+subtotal;
       
    }



public abstract void imprimirDatos() extends throws IOException{
        
        char opcion;
        Scanner leeDato = new Scanner(System.in);
        System.out.println("Total de importe: "+total);
        System.out.println("Total de IVA: "+iva);
        System.out.println("Subtotal sobre el importe: "+subtotal);
        System.out.println("Total del importe con cargos extra: "+descuento);
        System.out.println("¿Desea regresar al menu principal? (S|N): ");
        opcion = leeDato.next().charAt(0);
        if(opcion == 'S'||opcion=='s'){
          
            Menu menu = new Menu();
            menu.menu();
        }    
        else{
            
            System.out.println("Gracias por su visita");
            System.exit(0);
        }