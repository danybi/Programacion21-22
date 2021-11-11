import java.util.Scanner;

/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
public class Ejercicio19T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Esta programa pinta por pantalla una pirámide con una altura deseada y carácter elegido: ");
        System.out.print("El carácter a pintar: ");
        String c = System.console().readLine();
        boolean posi = false;
        int h = 0;
        do {
            System.out.print("Altura deseada: ");
            h = Integer.parseInt(s.nextLine());
            if (h < 0) {
                System.out.println("Tiene que ser un valor mayor a 0");
            } else {
                posi = true;
            }
        } while (posi == false);
        int puntos = 1;
        int espacios = h - 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < puntos; k++) {
                System.out.print(c);
            }
            puntos += 2;
            espacios--;
            System.out.println();
        }
    }
}