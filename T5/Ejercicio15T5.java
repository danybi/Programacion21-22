import java.util.Scanner;

/*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación.*/
public class Ejercicio15T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean nega = true;
        System.out.println(
                "Introduce una base y un exponente y se calculara la potencia pedida y las anteriores a estas, solo pueden ser números positivos");
        System.out.print("Introduce la Base: ");
        int base = Integer.parseInt(s.nextLine());
        int expofin = 1;
        int expo = 1;
        while (nega == true) {
            System.out.print("Introduce el exponente: ");
            expofin = Integer.parseInt(s.nextLine());
            if (expo <= 0) {
                System.out.println("Tiene que ser positivo");
            } else {
                nega = false;
            }
        }
        int potencia = 1;
        for (int i = 1; i <= expofin; i++) {
            potencia = 1;
            expo = i;
            for (int j = 0; j < expo; j++) {
                potencia *= base;
            }
            System.out.println(base + "^" + i + "=" + potencia);
        }
    }
}