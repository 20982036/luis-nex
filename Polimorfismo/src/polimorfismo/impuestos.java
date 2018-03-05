
package Poli;

public class impuestos {
    protected String Nombre;
    protected String Direccion;
    protected String Telefono;
    protected String RFC;
    protected String Ingreso;
    protected String Impuesto;
    protected String Gasto;
    
    
public impuesto getNombre(){
    return nombre;
}

public impuesto getDireccion(){
    return direccion;
}


public impuesto getTelefono(){
    return telefono;
}

public impuesto getRFC(){
    return rfc;
}

public impuesto getIngreso(){
    return ingreso;
}

public impuesto getImpuesto(){
    return impuesto;
}

public impuesto getGasto(){
    return gasto;
}

public String mostrarDatos(){
    return "Nombre: "+nombre+"\nDireccion: "+direccion+"\nTelefono: "+telefono+"\nRFC:"+rfc+"\nIngreso: "+ingreso+"\nImpuesto:"+impuesto+;
    }

}