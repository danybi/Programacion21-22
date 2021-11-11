import java.util.Scanner;

/*Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:*/
public class Ejercicio24T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Esta programa pinta por pantalla una pirámide hueca con una altura deseada: ");
        boolean posi = false;
        int hi = 0;
        do {
            System.out.print("Altura deseada: ");
            hi = Integer.parseInt(s.nextLine());
            if (hi < 0) {
                System.out.println("Tiene que ser un valor mayor a 0");
            } else {
                posi = true;
            }
        } while (posi == false);
        int h = 1;
        int n = 0;
        int espacios = hi + 6;
        for (int i = 0; i < hi; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (n = 1; n < h; n++) {
                System.out.print(n);
            }
            for (n = h; n > 0; n--) {
                System.out.print(n);
            }
            h++;
            espacios--;
            System.out.println();
        }
    }
}