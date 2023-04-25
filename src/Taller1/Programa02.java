package Taller1;

public class Programa02 {    
    private int numero; // variable que almacena el número de día de la semana

    // Método que devuelve el valor actual de la variable "numero"
    public int getNumero() {
        return numero;
    }

    // Método que establece el valor de la variable "numero"
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    // Método que establece el valor de la variable "numero" utilizando el método setNumero
    public void PedirDatos(int numero) {
        this.setNumero(numero);
    }
    
    // Método que devuelve el nombre del día de la semana correspondiente al número proporcionado
    public static String obtenerDia(int numero) {
        // matriz de strings que contiene los nombres de los días de la semana
        String[] dias = {"", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"}; 
        return dias[numero]; // devuelve el nombre del día de la semana correspondiente utilizando la matriz de strings
    }
}
