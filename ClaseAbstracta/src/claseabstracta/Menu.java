
package Menu;
import java.awt.Font;
import java.io.*;
import java.util.Scanner;

public abstract class Menu {
    public static void main(String [] args){
        Auto auto = new auto();  
        Moto moto = new moto(); 
        Camion camion = new camion(); 
        
    }
}

public abstract detalles extends detalles{
    private double iva;
    private double subtotal;
    private double total;
    private double casco;
    private double tonelada;
    private String descripcion;
}

public abstract void imprimirDatos() throws IOException{
    char opcion;
     Scanner leeDato = new Scanner(System.in);
     System.out.println("Total de IVA: "+iva);
     System.out.println("Subtotal de compra: "+subtotal);
     System.out.println("Total de compra: "+total);
     System.out.println("Casco: "+casco);
     System.out.println("Tonelada: "+tonelada);
     System.out.println("Total de auto: "+auto);
     System.out.println("Total de moto: "+moto);
     System.out.println("Total de camion: "+camion);
 System.out.println("¿Desea regresar al menu principal? (S|N): ");
        opcion = leeDato.next().charAt(0);
        if(opcion == 'S'||opcion=='s'){
          
            Menu menu = new Menu();
            menu.menu();
        }    
        else{
            
            System.out.println("Vuelva pronto!");
            System.exit(0);
        }