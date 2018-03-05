
package Poli;

public class PMoral extends Moral{
    private int personamoral;
    
    public PMoral(String nombre, String direccion, String telefono, String rfc, int ingresos, int gasto){
        super (nombre, direccion,telefono, rfc, ingresos);
        this.personamoral = personamoral;
}

    public int getPersonamoral(){
        return personamoral;
}

    public String mostrarDatos(){
        return "Nombre: "+nombre+"\nDireccion: "+direccion+"\nTelefono: "+telefono+"\nRFC:"+rfc+"\nIngreso: "+ingreso+"\nImpuesto:"+impuesto+"\nGasto"+gasto+;
               "\npersonamoral"+personamoral+;
    }
}