package Taller1;

public class Programa18 {
    private String nombre;
    private String raza;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }
    
    public void PedirDatos(String nombre, String raza, String edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = Integer.parseInt(edad);
    }
}
