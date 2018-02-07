
package Auto;


public class Auto {

String placa;
String marca;
String submarca;
int modelo;
int precio;
int kilometraje;

    public Auto(String placa,String marca,String submarca, int modelo,int precio,int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.submarca = submarca;
        this.placa = placa;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }
   

    Public void Venta(){
        System.out.printIn("La marca del auto es"+marca+", submarca"+submarca+", modelo"+modelo+", con las placas"+placa+", tiene un kilometraje de"+kilometraje+"a un super precio de "+precio+); 
    }
    
}

package AutoN;

public class AutoN {

String _placa;
String _marca;
String _submarca;
int _modelo;
int _precio;
int _kilometraje;

    public AutoN(String placa,String marca,String submarca, int modelo,int precio,int kilometraje) {
        this._marca = marca;
        this._modelo = modelo;
        this._submarca = submarca;
        this._placa = placa;
        this._precio = precio;
        this._kilometraje = kilometraje;
    }
   

    Public void Venta(){
        System.out.printIn("La marca del auto es"+marca+", submarca"+submarca+", modelo"+modelo+", con las placas"+placa+", tiene un kilometraje de"+kilometraje+"a un super precio de "+precio+); 
    }
    
}