import java.util.Scanner;

/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.*/
public class Ejercicio8T7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] temp = new int[12];
        System.out.println("Introduce la temperatura media de cada mes del año: ");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + ": ");
            temp[i] = Integer.parseInt(s.nextLine());
        }
        for (int i = 0; i < 12; i++) {
            System.out.printf("Mes %3d  |", (i + 1));
            for (int j = 0; j < temp[i]; j++) {
                System.out.print("▓");
            }
            System.out.println("");
        }
    }
}