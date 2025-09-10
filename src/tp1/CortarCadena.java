package tp1;

import java.util.Scanner;

public class CortarCadena {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un texto:");
        String texto = s.nextLine();
        int longitud = texto.length();
        int mitadLongitud = longitud/2;
        String parte1 = texto.substring(0, mitadLongitud);
        String parte2 = texto.substring(mitadLongitud, longitud);
        System.out.println("Primera mitad del texto: " + parte1);
        System.out.println("Segunda mitad del texto: " + parte2);
    }
}
