
package Poli;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int opcion;
    char opcion2;
    Scanner leeDato = new Scanner(System.in);
    System.out.println("Seleeciona una de las siguientes opciones: ");
    System.out.println("1.Importe de moto");
    System.out.println("2.Importe de auto");
    System.out.println("3.Importe de camion");
    System.out.println("Opcion: ");
    opcion = leeDato.nextInt();
    
    switch(opcion){
        case 1:
            PFisica fisica = new PFisica();
            fisica.personafisica();
            break;
        case 2:
            PMoral moral = new PMoral();
            moral.personamoral();
            break;
        
    }
    }
    
}
