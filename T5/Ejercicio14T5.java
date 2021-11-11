import java.util.Scanner;

/*Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.*/
public class Ejercicio14T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Calculo de una potencia\nIntroduce la base: ");
        int base = Integer.parseInt(s.nextLine());
        System.out.print("Introduce el exponente: ");
        int expo = Integer.parseInt(s.nextLine());
        double potencia = 1;
        if (expo == 0) {
            potencia = 1;
        }
        if (expo > 0) {
            for (int i = 0; i < expo; i++) {
                potencia *= base;
            }
        }
        if (expo < 0) {
            for (int i = 0; i < -expo; i++) {
                potencia *= base;
            }
            potencia = 1 / potencia;
        }
        System.out.println("Su potencia es: " + potencia);
    }
}