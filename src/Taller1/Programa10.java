package Taller1;

public class Programa10 {
    private String especie;
    private int edad;
    private String color;

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }
    
    public void PedirDatos(String especie, String edad, String color) {
        this.especie = especie;
        this.edad = Integer.parseInt(edad);
        this.color = color;
    }
}
