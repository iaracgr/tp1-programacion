package tp1;

import java.util.Calendar;
import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su año de nacimiento:");
        int fechaNacimiento = s.nextInt();
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int edad = anioActual - fechaNacimiento;
        System.out.println("Su edad es:" + edad);
    }
}
