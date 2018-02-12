/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 121053
 */
public class Menu {
    
    static int codigo;
static String descripcion;
static char perecedero;
static int cantidad;
static double precio;
static String fecha;
    
    public void menu() throws IOException{
    Scanner leeDato = new Scanner(System.in);
       System.out.println("Escribe codigo (solo caracteres numericos): ");
       codigo = leeDato.nextInt();
       System.out.println("Escribe descripcion de producto (una palabra): ");
       descripcion = leeDato.next();
       System.out.println("Escribe cantidad: ");
       cantidad = leeDato.nextInt(); 
       System.out.println("Escribe precio unitario");
       precio = leeDato.nextDouble();
       System.out.println("El producto es perecedero?(S|N): ");
       perecedero = leeDato.next().charAt(0);
       
       if(perecedero == 'S'|| perecedero == 's'){
          DetallePrecio cad = new DetallePrecio(codigo,descripcion,perecedero,cantidad,precio);
          cad.caducidad();
           
       }
       
       DetallePrecio price = new DetallePrecio(codigo,descripcion,perecedero,cantidad,precio);
       price.imprimirDatos();
      
       
     }
    
}