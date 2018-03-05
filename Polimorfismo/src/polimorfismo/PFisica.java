
package Poli;

public class PFisica extends Fisica{
    private int personafisica;
    
    public PFisica(String nombre, String direccion, String telefono, String rfc, int ingresos){
        super (nombre, direccion,telefono, rfc, ingresos);
        this.personafisica = personafisica;
}

    public int getPersonafisica(){
        return personafisica;
}

    public String mostrarDatos(){
        return "Nombre: "+nombre+"\nDireccion: "+direccion+"\nTelefono: "+telefono+"\nRFC:"+rfc+"\nIngreso: "+ingreso+"\nImpuesto:"+impuesto+
               "\npersonafisica"+personafisica+;
    }
}