package Arreglos2;

import java.util.Scanner;


public class Arreglos2 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       float[] numeros = new float[50];
       
       System.out.println("Guardando los datos en el arreglo");
       for(int i=0;i<50;i++){
           System.out.println((i+1)+"Digite un numero: ");
           numeros[i] = entrada.nextFloat();
       }
       System.out.println("\nimprimir datos en pantalla");
       for(float i:numeros){
           System.out.println(i);
       }
    }
    
}