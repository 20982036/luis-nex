package arreglos2;

import java.util.Scanner;

public class Menu_2 {
    
    public void menu_2(){
    int opcion;
    char opcion5;
    Scanner leeDato = new Scanner(System.in);
    System.out.println("Seleeciona una de las siguientes opciones: ");
    System.out.println("1.Consultar producto");
    System.out.println("2.Producto precio mayor");
    System.out.println("3.Producto precio menor");
    System.out.println("4.Imprimir reporte");
    System.out.println("5.Salir");
    System.out.println("Opcion: ");
    opcion = leeDato.nextInt();
    
    switch(opcion){
        case 1:
            CProducto cproducto = new CProducto();
            cproducto.cproducto();
            break;
        case 2:
            IPantallaPM ipantallapm = new IPantallaPM();
            ipantallapm.ipantallapm();
            break;
        case 3: 
            IPantallaPN ipantallapn = new IPantallaPN();
            ipantallapn.ipantallapn();
            break;
        case 4: 
            PantallaI pantallai = new PantallaI();
            pantallai.pantallai();
            break;
        case 5:
            break;
    }
    
    System.out.println("Desea volver al menu principal? (S|N)");
    opcion5 = leeDato.next().charAt(0);
    if((opcion5=='S')||(opcion5=='s')){
        Menu_2 men = new Menu_2();
        men.menu_2();
    }
    
    System.out.println("Gracias por usar el programa!");
    System.exit(0);
  }
    
    
}