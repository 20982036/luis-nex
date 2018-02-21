
package Precio;
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


public abstract class Precio (String auto,String moto,String camion,String iva, String casco, String tonelada, String descripcion, double precio)throws IOException{
autopista(auto, moto, camion, descripcion, precio, iva, casco, tonelada);
this.descrpcion = descripcion;
this.precio= precio;
this iva = iva;
this.casco = casco;
this.tonelada = tonelada;
this. total = total;
this.subtotal = subtotal;


iva = precio *0.16;
subtotal = precio*cantidad;
total = iva+subtotal;

if(casco >= 's') if(casco >= 'S'){
    suma = total - (total*.07);
}

if(tonelada >= 's') if(tonelada >= 'S'){
    suma = total - (total*.07);
}