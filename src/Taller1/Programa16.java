package Taller1;

public class Programa16 {
    private String nombre;
    private String direccion;
    private int numHabitaciones;

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    public void PedirDatos(String nombre, String direccion, String numHabitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numHabitaciones = Integer.parseInt(numHabitaciones);
    }
}
