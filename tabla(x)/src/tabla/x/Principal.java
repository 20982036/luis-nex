class Tabla {
    
    
private int numTabla;
private int limite;
public void leeNums( ) {
System.out.print ("Que tabla quieres multiplicar: ");
numTabla = DatosEntrada.entero( );
System.out.print ("Cuantas veces?: ");
limite = DatosEntrada.entero( );
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