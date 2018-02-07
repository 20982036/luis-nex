
package jardinero;


public class Jardinero {

String nombre;
int ingreso;
int podar;
int abono;

    public Jardinero(String nombre, int ingreso) {
        this.nombre = nombre;
        this.ingreso = ingreso;
    }
    
    public Jardinero(String nombre, int podar) {
        this.nombre = nombre;
        this.podar = podar;
    }
    
    public Jardinero(String nombre, int abono) {
        this.nombre = nombre;
        this.abono = abono;
    }

    Public void Venta(){
        System.out.printIn("A sus ordenes, soy"+nombre+", el costo por tu pedido es:"+ingreso+); 
    }
    Public void Venta(){
        System.out.printIn("A sus ordenes, soy"+nombre+", el costo por tu pedido es:"+podar+); 
    }
   Public void Venta(){
        System.out.printIn("A sus ordenes, soy"+nombre+", el costo por tu pedido es:"+abono+); 
    }

    void podar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void abono() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}