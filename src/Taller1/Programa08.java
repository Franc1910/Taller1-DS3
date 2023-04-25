package Taller1;

public class Programa08 {
    private String titulo;
    private String autor;
    private int numPaginas;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
    
    public void PedirDatos(String titulo, String autor, String numpag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = Integer.parseInt(numpag);
    }
}
