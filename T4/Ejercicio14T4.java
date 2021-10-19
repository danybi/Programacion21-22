import java.util.Scanner;

/*Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5. */
public class Ejercicio14T4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número y te dire si en par o es divisible entre 5: ");
        int num = Integer.parseInt(s.nextLine());
        if ((num % 2) == 0) {
            System.out.println("Este número es par");
        } else {
            System.out.println("Este número no es par");
        }
        if ((num % 5) == 0) {
            System.out.println("Es divisible entre 5");
        } else {
            System.out.println("No es divisible entre 5");
        }
    }
}