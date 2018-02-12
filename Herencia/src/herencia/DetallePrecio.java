
package herencia;

import java.awt.Font;
import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class DetallePrecio extends DetalleProducto{
    private double iva;
    private double subtotal;
    private double total;
    private double descuento;
    private String fecha;
    private String dia,mes,anio;
    private int datodia,datomes,datoanio;
    private int diaact,mesact,anioact;

    public DetallePrecio(int codigo, String descripcion, char perecedero, int cantidad, double precio) throws IOException{
        super(codigo, descripcion, perecedero, cantidad, precio);
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
        this.descuento = descuento;
        this.fecha = fecha;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        
        iva = precio * 0.16;
        subtotal = precio*cantidad;
        total = iva+subtotal;
        if(cantidad >= 5){
            
            descuento = total - (total*.07);
        }
        else{
            descuento = total;
        }
        
        if((perecedero=='S') ||(perecedero=='s'))
                caducidad();
        
       
    }

    public void imprimirDatos() throws IOException{
        
        char opcion;
        Scanner leeDato = new Scanner(System.in);
        System.out.println("Codigo es: "+getCodigo());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Caducidad: "+datodia+" "+datomes+" "+datoanio);
        System.out.println("cantidad es: "+getCantidad());
        System.out.println("Total de IVA es: "+iva);
        System.out.println("Subtotal de compra es: "+subtotal);
        System.out.println("Total de compra es: "+total);
        System.out.println("Total de compra con descuento es: "+descuento);
        System.out.println("Desea regresar al menu principal? (S|N): ");
        opcion = leeDato.next().charAt(0);
        if(opcion == 'S'||opcion=='s'){
          
            Menu menu = new Menu();
            menu.menu();
        }    
        else{
            
            System.out.println("Gracias por haber usado este programa!");
            System.exit(0);
        }
        
        
        
        }
    public void caducidad()throws IOException{
       Scanner leeDato = new Scanner(System.in);
       System.out.println("Escribe fecha de caducidad (dd/mm/aaaa): ");
       fecha = leeDato.next();
       int posicion;
       posicion=fecha.indexOf("/");
       dia=fecha.substring(0, posicion);12
       fecha=fecha.substring(posicion+1);
       posicion=fecha.indexOf("/");
       mes=fecha.substring(0, posicion);
       fecha=fecha.substring(posicion+1);
       anio=fecha;
       
       datodia=Integer.parseInt(dia);
       datomes=Integer.parseInt(mes);
       datoanio=Integer.parseInt(anio);
       
       Calendar calendario = Calendar.getInstance();
           int diaact = calendario.get(Calendar.DATE);
           int mesact = calendario.get(Calendar.MONTH);
           int anioact = calendario.get(Calendar.YEAR);
           
           System.out.println(diaact);
           System.out.println(mesact);
           System.out.println(anioact);
           
       if(datodia <1 || datodia>31 || datomes <1 || datomes>12 ||datoanio < 1900){
           System.out.println("Formato de fecha incorrecto, intentar nuevamente");
           caducidad();
    }
        
       
       if((datomes > mesact)&&(datoanio <= anioact)){

           System.out.println("El producto ya esta caducado");
       }
       
       imprimirDatos();
       
      
   
    }
}