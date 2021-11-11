import java.util.Scanner;

/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
*/
public class Ejercicio13T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa determina si 10 números introducidos son positivos o negativos: ");
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            int num = Integer.parseInt(s.nextLine());
            if (num < 0) {
                System.out.println("Negativo");
                neg++;
            } else {
                System.out.println("Positivo");
                pos++;
            }
        }
        System.out.print("Positivos: " + pos + "\nNegativos: " + neg);
    }
}