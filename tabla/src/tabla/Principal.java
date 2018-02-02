package tabla;

import java.util.Scanner;

class Principal { 
    public static void main(String ar [] ) { 
        
        Scanner leeDato = new Scanner(System.in); 
        System.out.print ("Que tabla quieres multiplicar: "); 
        int valorTabla = leeDato.nextInt( ); 
        System.out.print ("Cuantas veces?: "); 
        int limite = leeDato.nextInt( ); 
        Tabla miTabla = new Tabla(valorTabla, limite); 
        miTabla.multTabla( ); 
        
    } 
}