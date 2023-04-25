package Taller1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Programa07 {
    private LocalDate fecha;
    
    public Programa07(int dia, int mes, int anio) {
        fecha = LocalDate.of(anio, mes, dia);
    }

    public String obtenerFechaCorta() {
        return fecha.format(DateTimeFormatter.ofPattern("MM/dd/yy"));
    }

    public String obtenerFechaLarga() {
        return fecha.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'del' yyyy"));
    }

    public String obtenerFechaMediana() {
        return fecha.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    }
       
    /**
     * Constructor que crea un objeto Programa07 con la fecha dada en formato dia, mes y año.
     * @param dia El día de la fecha.
     * @param mes El mes de la fecha.
     * @param anio El año de la fecha.
     * @return 
     */
    public static boolean pedirDatos(String dia, String mes, String anio) {
        int diaInt, mesInt, anioInt;

        // Convertir las cadenas a enteros
        try {
            diaInt = Integer.parseInt(dia);
            mesInt = Integer.parseInt(mes);
            anioInt = Integer.parseInt(anio);
        } catch (NumberFormatException e) {
            Pantallas.Utilidades.mostrarMensaje("Error: ingrese valores numéricos para el día, mes y año.", "Error");
            return false;
        }

        // Verificar si el día es válido para el mes correspondiente
        try {
            Month mesObj = Month.of(mesInt);
            int diasMes = mesObj.length(Year.isLeap(anioInt));
            if (diaInt < 1 || diaInt > diasMes) {
                Pantallas.Utilidades.mostrarMensaje("Error: ingrese un día válido para el mes correspondiente.", "Error");
                return false;
            }
        } catch (DateTimeException e) {
            Pantallas.Utilidades.mostrarMensaje("Error: ingrese un mes válido.", "Error");
            return false;
        }

        // Verificar si el año está en el rango válido
        if (anioInt < 1000 || anioInt > 3000) {
            Pantallas.Utilidades.mostrarMensaje("Error: ingrese un año válido entre 1000 y 3000.", "Error");
            return false;
        }
        return true;
    }
}