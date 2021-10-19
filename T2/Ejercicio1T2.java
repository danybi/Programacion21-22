public class Ejercicio1T2 {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;
        System.out.println(
                "El programa mostrara la suma, la resta, la multiplicación y la división de dos variables de valor 144 y 999");
        int suma = x + y;
        int resta = x - y;
        int multi = x * y;
        float div = ((float) x / (float) y);

        System.out.println("La suma es: " + suma + "\nLa resta es " + resta + "\nLa multiplicación es " + multi
                + "\nLa división " + div);
    }
}