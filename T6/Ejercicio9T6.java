/*Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/
public class Ejercicio9T6 {
    public static void main(String[] args) {
        int num = 0;
        int cuenta = 0;
        do {
            num = (int) (Math.random() * 51) * 2;
            System.out.print(num + " ");
            cuenta++;
        } while (num != 24);
        System.out.println("");
        System.out.println("Se cuentan " + cuenta + " números");
    }
}