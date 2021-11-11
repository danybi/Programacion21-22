import java.util.Scanner;

/*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo)*/
public class Ejercicio17T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        do {
            System.out.print("Introduce un número entero positivo: ");
            num = Integer.parseInt(s.nextLine());
            if (num < 0) {
                System.out.println("Tiene que ser positivo");
            }
        } while (num < 0);
        for (int i = num; i < num + 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los 100 siguientes números a " + num + " es " + suma);
    }
}