import java.util.Scanner;

/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
*/
public class Ejercicio27T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cont = 0;
        int suma = 0;
        int num = 1;
        boolean menor = true;
        do {
            System.out.print("Introduce un número mayor que 1: ");
            num = Integer.parseInt(s.nextLine());
            if (num <= 1) {
                System.out.println("Tiene que ser mayor a 1.");
            } else {
                menor = false;
            }
        } while (menor == true);
        for (int i = 1; i < num; i++) {
            if ((i % 3) == 0) {
                cont++;
                suma += i;
                System.out.print(i + " ");
            }
        }
        System.out.print(
                "\nHay una cantidad de " + cont + " multiplos de 3 entre 1 y " + num + " y tienen una suma de " + suma);
    }
}