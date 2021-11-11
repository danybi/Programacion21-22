import java.util.Scanner;

/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.*/
public class Ejercicio29T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo (relativamente grande): ");
        int numg = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca otro número (relativamente pequeño): ");
        int nump = Integer.parseInt(s.nextLine());
        System.out.print("Los números enteros positivos menores que " + numg);
        System.out.println(" que no son divisibles entre " + nump + " son los siguientes:");
        for (int i = 1; i < numg; i++) {
            if ((i % nump) != 0) {
                System.out.print(i + " ");
            }
        }
    }
}