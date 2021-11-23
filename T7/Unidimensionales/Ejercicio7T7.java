import java.util.Scanner;

/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.*/
public class Ejercicio7T7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "Este programa genera 100 número aleatorios entre 0 y 20 para luego sustituir un número indicado por otro, ambos introducidos por teclado.");
        int[] ale = new int[100];
        int i = 0;
        for (i = 0; i < 100; i++) {
            ale[i] = (int) (Math.random() * 21);
            System.out.printf("|%3d ", ale[i]);
        }
        System.out.print("Elige el número que quieres sustituir: ");
        int numele = Integer.parseInt(s.nextLine());
        System.out.print("Elige el número que quieres que sustituya el anterior: ");
        int numsus = Integer.parseInt(s.nextLine());
        for (i = 0; i < 100; i++) {
            if (ale[i] == numele) {
                ale[i] = numsus;
            }
        }
        System.out.println("Con el cambio se vería tal que así");
        for (i = 0; i < 100; i++) {
            System.out.printf("|%3d ", ale[i]);
        }
    }
}