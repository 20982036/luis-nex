import java.io.*;   //se importan librerias a utilizar


class  TablaX {
    
    
    public static  String cadena( ) {
try{ BufferedReader leeDato=new BufferedReader(new InputStreamReader(System.in));
return leeDato.readLine();
} catch(IOException e) {
return " ";
   }
}


public static int entero( ) {
try{ return Integer.parseInt(cad());   
} catch(NumberFormatException e) {
return -1;
  }
}


public static double real( ){
try{ return Double.parseDouble(cad());
} catch(NumberFormatException e) {
return -1.0;
   }
}


public static float flotante(){
try { return Float.parseFloat(cad());
} 


    catch (NumberFormatException e) {
return -1.0f;
   }
}
public static char caracter(){
try{ return cad().charAt(0);
} catch(IndexOutOfBoundsException e) {
return ' ';
}
}

    private static String cad() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}