import java.util.Scanner;

/*Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado*/
public class Ejercicio14T7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] palabra = new String[8];
        String[] resultado = new String[8];
        String[] col = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
        int cantcol = 0;
        String[] colcoin = new String[8];
        for (int i = 0; i < 8; i++) {
            palabra[i] = s.nextLine();
        }
        for (String n : palabra) {
            for (int i = 0; i < 9; i++) {
                if (n == col[i]) {
                    cantcol++;
                }
            }

        }
    }
}