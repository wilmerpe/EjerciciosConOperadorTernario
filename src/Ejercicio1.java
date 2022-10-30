import javax.swing.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int entero;
        //Con el comando Integer.parse convertimos el JoptionPane que es de cáracter string o cadena a un número entero.
        entero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número: "));

        JOptionPane.showMessageDialog(null, (entero%10==0) ? "El número ingresado es mútiplo de 10" : "El número ingresado no es múltiplo de 10");

    }
}
