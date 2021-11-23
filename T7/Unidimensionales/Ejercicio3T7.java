import java.util.Scanner;

/*
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
*/
public class Ejercicio3T7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce 10 valores enteros: ");
        int i;
        int[] num = new int[10];
        for (i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(s.nextLine());
        }
        for (i = 9; i >= 0; i--) {
            System.out.println("num[" + i + "]:" + num[i]);
        }
    }
}
