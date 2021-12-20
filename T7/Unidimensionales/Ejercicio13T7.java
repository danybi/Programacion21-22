import java.util.Scanner;

/*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.*/
public class Ejercicio13T7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = new int[100];
        int max = 0;
        int min = 500;
        int mostrar = 0;
        int i;
        for (i = 0; i < 100; i++) {
            n[i] = (int) (Math.random() * 501);
            System.out.print(n[i] + " ");
            if (n[i] > max) {
                max = n[i];
            }
            if (n[i] < min) {
                min = n[i];
            }
        }
        System.out.println("\nMáximo: " + max + "\nMínimo: " + min);
        System.out.println("¿Quieres remarcar el máximo o el mínimo? (1- max / 2-min): ");
        mostrar = Integer.parseInt(s.nextLine());
        int destacado = 0;
        if (mostrar == 1) {
            destacado = max;
        } else {
            destacado = min;
        }
        for (int ni : n) {
            if (ni == destacado) {
                System.out.print("\033[31m \"" + ni + "\" ");
            } else {
                System.out.print("\033[36m" + ni + " ");
            }
        }
    }
}