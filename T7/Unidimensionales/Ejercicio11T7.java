import java.util.Scanner;
/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.*/

public class Ejercicio11T7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = new int[10];
        int[] primo = new int[10];
        int[] noprimo = new int[10];
        int i;
        int j;
        int prim = 0;
        int noprim = 0;
        boolean esprimo = false;
        System.out.print("Introduce 10 números: ");
        for (i = 0; i < 10; i++) {
            n[i] = Integer.parseInt(s.nextLine());
            esprimo = true;
            for (j = 2; j < n[i] - 1; j++) {
                if (n[i] % j == 0) {
                    esprimo = false;
                }
            }
            if (esprimo) {
                primo[prim++] = n[i];
            } else {
                noprimo[noprim++] = n[i];
            }
        }
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (i = 0; i < 10; i++) {
            System.out.printf("│%4d ", n[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        for (i = 0; i < prim; i++) {
            n[i] = primo[i];
        }
        // Los números que no son primos se colocan al final.
        for (i = prim; i < prim + noprim; i++) {
            n[i] = noprimo[i - prim];
        }
        System.out.println("\n\nArray cambiado:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (i = 0; i < 10; i++) {
            System.out.printf("│%4d ", n[i]);
        }
        System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
}
