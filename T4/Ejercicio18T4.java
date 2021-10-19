
/*Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.*/
import java.util.Scanner;

public class Ejercicio18T4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = Integer.parseInt(s.nextLine());
        if (n < 10) {
            System.out.println("La primera cifra es: " + n);
        }
        if ((n >= 10) && (n < 100)) {
            System.out.println("La primera cifra es: " + (n / 10));
        }
        if ((n >= 100) && (n < 1000)) {
            System.out.println("La primera cifra es: " + (n / 100));
        }
        if ((n >= 1000) && (n < 10000)) {
            System.out.println("La primera cifra es: " + (n / 1000));
        }
    }
}