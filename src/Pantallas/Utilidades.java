package Pantallas;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;


public class Utilidades {
    /**
    * Establece un texto de tooltip para un componente.
    * @param componente el componente al que se le asignará el tooltip
    * @param texto el texto que se mostrará en el tooltip
    */
    public static void establecerTooltip(JComponent componente, String texto) {
        componente.setToolTipText(texto);
    }
    
     /**
     * Muestra un diálogo de confirmación con el mensaje especificado.
     * @param mensaje el mensaje que se mostrará en el diálogo de confirmación
     * @return true si el usuario hizo clic en "Sí", false si hizo clic en "No"
     */
    public static boolean mostrarDialogoConfirmacion(String mensaje) {
        int respuesta = JOptionPane.showConfirmDialog(null, mensaje, "Confirmación", JOptionPane.YES_NO_OPTION);
        return respuesta == JOptionPane.YES_OPTION;
    }
    
     /**
     * Muestra un cuadro de diálogo de mensaje con un mensaje y un título especificados.
     * 
     * @param mensaje el mensaje que se mostrará en el cuadro de diálogo
     * @param titulo el título del cuadro de diálogo
     */
    public static void mostrarMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
     /**
     * Cambia de una ventana a otra y enfoca un JTextField específico.
     * @param ventanaActual La ventana actual que se cerrará.
     * @param ventanaSiguiente La ventana siguiente que se abrirá.
     * @param campoDeTexto El campo de texto dentro de la ventana siguiente que se enfocará.
     */
    public static void cambiarVentana(JFrame ventanaActual, JFrame ventanaSiguiente, JTextField campoDeTexto) {
        ventanaActual.dispose();  // Cierra la ventana actual
        ventanaSiguiente.setVisible(true);  // Muestra la ventana siguiente
        if (campoDeTexto != null)
            campoDeTexto.requestFocus(); // Enfoca el campo de texto deseado si no es nulo       
    }
    
    /**
     * Comprueba si el carácter ingresado es un dígito numérico.
     * Si no lo es, entonces se consume el evento para que no se muestre en el campo de texto.
     * @param evt Evento de teclado que se está procesando
     */
    public static void ValidarNumero(KeyEvent evt) {
        char validar = evt.getKeyChar();

        if(!Character.isDigit(validar))
            evt.consume();
    }
    
    public static void validarNumDecimal(KeyEvent evt, JTextField textField, int maxDecimal) {
        char validar = evt.getKeyChar();
        String texto = textField.getText();

        // Verifica que el carácter ingresado sea un número o un punto decimal, y que solo se ingrese un punto decimal
        if (!Character.isDigit(validar) && (validar != '.' || texto.contains(".")))
            evt.consume(); // Evita que el carácter sea ingresado en el campo de texto

        // Verifica que no se ingresen dos puntos decimales seguidos
        if (validar == '.' && texto.indexOf(".") == textField.getCaretPosition() - 1)
            evt.consume(); // Evita que el segundo punto decimal sea ingresado en el campo de texto

        // Verifica la cantidad de dígitos después del punto decimal
        if (texto.contains(".")) {
            int indicePunto = texto.indexOf(".");
            int numDespuesPunto = texto.length() - indicePunto - 1;
            if (numDespuesPunto >= maxDecimal)
                evt.consume(); // Evita que se ingresen más de numDespuesPunto dígitos después del punto decimal
        }
    }

    /**
     * Comprueba si la longitud del texto en el campo de texto es mayor o igual a la longitud especificada.
     * Si lo es, entonces se consume el evento para que no se muestre en el campo de texto.
     * @param evt Evento de teclado que se está procesando
     * @param campo Campo de texto en el que se está validando la longitud del texto
     * @param longitud Longitud máxima permitida para el texto en el campo de texto
     */
    public static void ValidarLongitud(KeyEvent evt, JTextField campo, int longitud) {
        if(campo.getText().length() >= longitud)
            evt.consume();
    }
    
    /**
    Verifica si todos los campos de texto pasados como parámetro tienen algún contenido.
    @param campos los campos de texto a verificar
    @return true si todos los campos tienen algún contenido, false en caso contrario
    */
    public static boolean camposCompletos(JTextField... campos) {
        //trim() elimina los espacios en blanco al inicio y al final de una cadena de caracteres.
        //isEmpty() devuelve true si la cadena de caracteres está vacía después de aplicar
        
        for (JTextField campo : campos)
            if (campo.getText().trim().isEmpty())
                return false;
        
        return true;
    }
    
    public static boolean AreasCompletos(JTextArea... campos) {
        
        for (JTextArea campo : campos)
            if (campo.getText().trim().isEmpty())
                return false;
        
        return true;
    }
    
    /**
    Limpia los campos de texto pasados como parámetro, estableciendo su contenido a una cadena vacía.
    @param camposTexto los campos de texto a limpiar
    */
    public static void limpiarCampos(JTextField... camposTexto) {
        for (JTextField campo : camposTexto)
            campo.setText("");
    } 
    
    /**
    Limpia los campos de resultados pasados como parámetro, estableciendo su contenido a una cadena vacía.
    @param camposResultados los campos de resultados a limpiar
    */
    public static void limpiarResultados(JTextField... camposResultados) {
        for (JTextField resultado : camposResultados)
            resultado .setText("");       
    }
    
    /**
    Limpia los campos de resultados y texto de los jTextArea pasados como parámetro, estableciendo su contenido a una cadena vacía.
    @param camposArea los campos de Area a limpiar
    */
    public static void limpiarAreas(JTextArea... camposArea) {
        for (JTextArea resultado : camposArea)
            resultado.setText("");
    }

    
    /**
    * Devuelve una cadena de texto que representa el número proporcionado con el número de decimales especificado.
    * @param numero El número al que se le desea aplicar formato decimal.
    * @param decimales El número de decimales que se desea mostrar en el número formateado.
    * @return La cadena de texto que representa el número con el formato decimal especificado.
    */
    public static String DecimalFormato(double numero, int decimales) {
        StringBuilder patronBuilder = new StringBuilder("#.");
        for (int i = 0; i < decimales; i++)
            patronBuilder.append("#");
        
        String patron = patronBuilder.toString();
        DecimalFormat formato = new DecimalFormat(patron);
        return formato.format(numero);
    }
    
    public static String DecimalDinero(double numero) {

        DecimalFormat formato = new DecimalFormat("#,##0.00");
        return "$" + formato.format(numero);
    }
 
    /**
    Este método limita el número de caracteres que se pueden ingresar en un JTextArea especificado,
    estableciendo un límite máximo. Si se intenta ingresar más caracteres de lo permitido, el JTextArea
    no permitirá la inserción y el exceso de caracteres será ignorado.
    @param textArea JTextArea al que se le desea limitar el número de caracteres.
    @param maxChars Número máximo de caracteres permitidos.
    */
    public static void limitarCaracteres(JTextArea textArea, int maxChars) {
        textArea.setDocument(new LimitedDocument(maxChars));
    }
}


    /**
    Clase LimitedDocument que extiende de DefaultStyledDocument para limitar el número de caracteres
    que se pueden escribir en un JTextArea.
    @author [nombre del autor]
    @version [versión del programa]
    */
class LimitedDocument extends DefaultStyledDocument {
    private int maxCharacters;
    
    /**
    Constructor de la clase LimitedDocument.
    @param maxChars entero que indica el número máximo de caracteres que se permiten.
    */
    public LimitedDocument(int maxChars) {
        super();
        maxCharacters = maxChars;
    }
    /**
    Método insertString que limita el número de caracteres que se pueden escribir.
    @param offs entero que indica la posición en la que se insertará el texto.
    @param str cadena de caracteres a insertar.
    @param a AttributeSet que especifica los atributos de los caracteres.
    */
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (getLength() + str.length() <= maxCharacters) {
            super.insertString(offs, str, a);
        }
    }
}
