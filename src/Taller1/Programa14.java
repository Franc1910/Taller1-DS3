package Taller1;

public class Programa14 {
    private String titulo;
    private String director;
    private int duracion;

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public void PedirDatos(String titulo, String director, String duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = Integer.parseInt(duracion);
    }
}
