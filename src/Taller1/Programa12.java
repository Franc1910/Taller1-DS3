package Taller1;

import Pantallas.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Programa12 {
    
    //Atributos
    private String marca;
    private String modelo;
    private double tamanoPantalla;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }
    
    //Métodos
    public void PedirDatos(String marca, String modelo, String TamanoPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanoPantalla = Double.parseDouble(TamanoPantalla);
    }
    
    public void enviarMensaje() {
        JTextArea textArea = new JTextArea(10, 20); // crear un JTextArea de 10 filas y 20 columnas
        textArea.setLineWrap(true); // hacer un salto de línea automáticamente
        textArea.setWrapStyleWord(false); // envolver el texto en límites de caracteres
        JScrollPane scrollPane = new JScrollPane(textArea); // agregar un JScrollPane alrededor del JTextArea
        int option = JOptionPane.showOptionDialog(
                null, // componente padre del diálogo
                scrollPane, // componente a mostrar en el diálogo
                "Ingrese el mensaje:", // título del diálogo
                JOptionPane.OK_CANCEL_OPTION, // opciones de botones
                JOptionPane.PLAIN_MESSAGE, // tipo de mensaje
                null, // icono personalizado
                null, // opciones personalizadas de botones
                null // opción predeterminada de botón
        );

        // Obtener el texto ingresado si se presionó el botón OK
        if (option == JOptionPane.OK_OPTION) {
            Utilidades.mostrarMensaje("El mensaje fue enviado", null);
        }
    }
    
    public int llamar() {
        String numero = "";
        int numeroEntero=0;
        
        try {              
            while(true) {            
                numero = JOptionPane.showInputDialog(null, "Ingrese un número de teléfono:");
                if (numero == null) {
                    return -1;
                }

                if (!numero.matches("^\\d+$")) {
                    Pantallas.Utilidades.mostrarMensaje("Debe ingresar solo números enteros.", "Error");
                    continue;
                }

                numeroEntero = Integer.parseInt(numero);
                if (numeroEntero < 10000000 || numeroEntero > 99999999) {
                    Pantallas.Utilidades.mostrarMensaje("Debe ingresar un número de teléfono valido", "Error");
                    continue;
                }
                break;
            }
            JOptionPane.showMessageDialog(null, "Llamando al número: " + numeroEntero);
            return numeroEntero;               

        } catch (NumberFormatException e) {
            Pantallas.Utilidades.mostrarMensaje("Debe ingresar un número de teléfono valido", "Error");
        }       
        return -1;
    }
}


