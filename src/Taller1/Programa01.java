package Taller1;

public class Programa01 {
    
    private String Nombre;
    private int Edad;
    private String DNI;
    
    // Constructor vacío
    public Programa01() {

    }
    
    // Constructor
    public Programa01(String nombre, int edad, String dni) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.DNI = dni;
    }
    
    // Setters y getters para cada atributo
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
    public String getNombre() {
        return this.Nombre;
    }
    
    public void setEdad(int edad) {
        this.Edad = edad;
    }
    
    public int getEdad() {
        return this.Edad;
    }
    
    public void setDNI(String dni) {
        this.DNI = dni;
    }
    
    public String getDNI() {
        return this.DNI;
    }
    
    // Método esMayorDeEdad()
    public boolean esMayorDeEdad() {
        return this.Edad >= 18;
    }
    
    // Método PedirDatos()
    public void PedirDatos(String nombre, String edad, String dni) {
        this.Nombre = nombre;
        this.Edad = Integer.parseInt(edad);
        this.DNI = dni;
    }
}