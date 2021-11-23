/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.*/
public class Ejercicio10T6 {
    public static void main(String[] args) {
        int cant = 0;
        int car = 0;
        String rell = "";
        for (int i = 0; i < 10; i++) {
            cant = (int) (Math.random() * 40) + 1;
            car = (int) (Math.random() * 6);
            switch (car) {
            case 0:
                rell = "*";
                break;
            case 1:
                rell = "-";
                break;
            case 2:
                rell = "=";
                break;
            case 3:
                rell = ".";
                break;
            case 4:
                rell = "|";
                break;
            case 5:
                rell = "@";
                break;
            default:
            }
            for (int j = 0; j < cant; j++) {
                System.out.print(rell);
            }
            System.out.println("");
        }
    }
}