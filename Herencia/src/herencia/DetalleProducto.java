package herencia;

public class DetalleProducto {

private int codigo;
private String descripcion;
private char perecedero;
private int cantidad;
private double precio;


    public DetalleProducto(int codigo, String descripcion, char perecedero, int cantidad, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.perecedero = perecedero;
        this.cantidad = cantidad;
        this.precio = precio;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public char getPerecedero() {
        return perecedero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }


}