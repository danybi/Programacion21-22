import java.util.Scanner;

/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array*/
public class Ejercicio6T7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[15];
        int i = 0;
        System.out.print("Introduzca 15 números: ");
        for (i = 0; i < 15; i++) {
            num[i] = Integer.parseInt(s.nextLine());
        }
        System.out.print("Array original: ");
        for (i = 0; i < 15; i++) {
            System.out.printf("|%3d ", num[i]);
        }
        System.out.println("|");
        int aux = num[14];
        for (i = 14; i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0] = aux;
        System.out.print("Array rotado: ");
        for (i = 0; i < 15; i++) {
            System.out.printf("|%3d ", num[i]);
        }
        System.out.println("|");
    }
}