package Taller1;

public class Programa13 {
    private String nombre;
    private String descripcion;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void PedirDatos(String nombre, String descripcion, String precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = Double.parseDouble(precio);
    }
}
