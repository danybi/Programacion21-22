import java.util.Scanner;
/*Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.*/

public class Ejercicio18T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce 2 enteros distintos \na: ");
        int a = Integer.parseInt(s.nextLine());
        boolean igual = true;
        int b = 0;
        do {
            System.out.print("b: ");
            b = Integer.parseInt(s.nextLine());
            if (a != b) {
                igual = false;
            } else {
                System.out.println("Tienen que ser diferentes, Introduce el segundo de nuevo");
            }
        } while (igual == true);
        int aux = 0;
        if (a > b) {
            aux = b;
            b = a;
            a = aux;
        }
        for (int i = a; i < b - 1; i++) {
            a += 1;
            System.out.print(a + " ");
        }
    }
}