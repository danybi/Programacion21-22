import java.util.Scanner;

/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad*/
public class Ejercicio16T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número entero y te dire si es primo: ");
        int Num = Integer.parseInt(s.nextLine());
        boolean primo = true;
        for (int i = 2; i < Num; i++) {
            if ((Num % i) == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}