/*
Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.
*/
public class Ejercicio4T7 {
    public static void main(String[] args) {
        int[] num = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            num[i] = (int) (Math.random() * 101);
            cuadrado[i] = num[i] * num[i];
            cubo[i] = cuadrado[i] * num[i];
        }

        System.out.println("\nA continuación se muestra un número junto a su cuadrado y a su cubo");

        System.out.println("─────┼───────┼─────────");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%5d|%7d|%8d\n", num[i], cuadrado[i], cubo[i]);
        }
    }
}
