package clase.Arreglo;

import java.util.Scanner;

public class Menu {
    
    public void menu(){
    int opcion;
    char opcion2;
    Scanner leeDato = new Scanner(System.in);
    System.out.println("Seleeciona una de las siguientes opciones: ");
    System.out.println("1.Captura de datos");
    System.out.println("2.Promedio");
    System.out.println("3.Imprimir reporte");
    System.out.println("Opcion: ");
    opcion = leeDato.nextInt();
    
    switch(opcion){
        case 1:
            Captura captura = new Captura();
            captura.importe();
            break;
        case 2:
            Promedio promedio = new Promedio();
            promedio.importe();
            break;
        case 3: 
            Reporte reporte = new Reporte();
            reporte.importe();
            break;
    }
    
    System.out.println("Desea volver al menu principal? (S|N)");
    opcion2 = leeDato.next().charAt(0);
    if((opcion2=='S')||(opcion2=='s')){
        Menu men = new Menu();
        men.menu();
    }
    
    System.out.println("Gracias por usar el programa!");
    System.exit(0);
  }
    
    
}