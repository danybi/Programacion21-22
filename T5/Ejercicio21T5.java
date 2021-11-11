import java.util.Scanner;

/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/
public class Ejercicio21T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(
                "Este programa muestra la cantidad de números introducidos por teclado, la media de los impares y el mayor de los pares (para salir del programa introduce un número negativo)\n");
        boolean fuera = false;
        int cantidad = 0;
        int sumaimp = 0;
        int cantimp = 0;
        int mayorpar = 0;
        int num = 0;
        while (fuera == false) {
            num = Integer.parseInt(s.nextLine());
            if (num >= 0) {
                cantidad++;
                if ((num % 2) == 0) {
                    if (num > mayorpar) {
                        mayorpar = num;
                    }
                } else {
                    sumaimp += num;
                    cantimp++;
                }
            } else {
                fuera = true;
            }
        }
        if (cantidad == 0) {
            System.out.print("Ningun valor positivo utilizable. ");
        } else {
            System.out.println("La cantidad de números insertados es " + cantidad + " La media de los impares es "
                    + (sumaimp / cantimp) + " y el mayor número par es " + mayorpar);
        }
    }
}