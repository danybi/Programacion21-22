/*Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
*/
public class Ejercicio5T7bi {
    public static void main(String[] args) {
        int[][] arr = new int[6][10];
        int posx = 0;
        int posy = 0;
        int max = 0;
        int min = 1000;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (int) (Math.random() * 1000 + 1);
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
        for (int i = 0; i < 6; i++) {
            posy = 0;
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == max) {
                    System.out.println(
                            "El maximo se encuentra en la fila " + (posx + 1) + " y en la columna " + (posy + 1));
                }
                if (arr[i][j] == min) {
                    System.out.println(
                            "El minimo se encuentra en la fila " + (posx + 1) + " y en la columna " + (posy + 1));
                }
                posy++;
            }
            posx++;
        }
    }
}