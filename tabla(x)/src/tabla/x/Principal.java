package tabla.x;

class Principal {
    
  
private int numTabla;
private int limite;


public void  leeNums( ) {
System.out.print ("Que tabla quieres multiplicar: ");
numTabla = TablaX.entero( );
System.out.print ("Cuantas veces?: ");
limite = TablaX.entero( );
}


public void multTabla( ) {
    if ( numTabla == -1 || limite == -1 )
System.out.println("Error: el valor escrito es incorrecto");
    else {
for (int i=1; i<=limite; i++)
System.out.println(numTabla + "x" + i + "=" + (numTabla*i));
      }
   }
 }
