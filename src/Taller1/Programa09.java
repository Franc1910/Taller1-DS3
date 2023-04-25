package Taller1;

public class Programa09 {
    private String marca;
    private String modelo;
    private int velocidad;
    
    public Programa09() {
        this.velocidad = 0;
    }
    
    public void acelerar(int cantidad) {
        this.velocidad += cantidad;
    }
    
    public void frenar(int cantidad) {
        this.velocidad -= cantidad;
    }
    
    // Getters y setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void PedirDatos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
