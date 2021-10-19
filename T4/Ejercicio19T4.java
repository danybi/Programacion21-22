import java.util.Scanner;

/*Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.*/
public class Ejercicio19T4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int digitos = 0;
        int num = Integer.parseInt(s.nextLine());
        if (num < 10) {
            digitos = 1;
        }
        if ((num >= 10) && (num < 100)) {
            digitos = 2;
        }
        if ((num >= 100) && (num < 1000)) {
            digitos = 3;
        }
        if ((num >= 1000) && (num < 10000)) {
            digitos = 4;
        }
        if ((num >= 10000) && (num < 100000)) {
            digitos = 5;
        }
        System.out.println("El número tiene " + digitos + " digitos totales");
    }
}