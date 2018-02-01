/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaje;

/**
 *
 * @author moya
 */
public class Mensaje {

    private String frase;

public void imprime ( ) {
    
String frase = “Este es mi mensaje”;
System.out.println("mensaje.Mensaje.imprime()" + frase);
System.out.println(“La frase del mensaje es: ” + frase );
}

/*
}public class FuncionPrincipal {
public static void main (String arg[]){
Mensaje miMensaje = new Mensaje ( );
miMensaje.imprime ( );
}*/

}
