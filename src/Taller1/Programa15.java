package Taller1;

public class Programa15 {
    private String nombre;
    private String direccion;
    private String tipoComida;

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipoComida() {
        return tipoComida;
    }
    
    public void PedirDatos(String nombre, String direccion, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoComida = tipoComida;
    }
}
