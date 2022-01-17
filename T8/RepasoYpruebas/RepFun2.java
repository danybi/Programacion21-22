import java.util.Scanner;
public class RepFun2 {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        System.out.println(
                "Introduzca dos numeros de los cuales se mostraran su suma, resta, multiplicacion y su division (en ese orden respectivamente)");
        int num1 = Integer.parseInt(s.nextLine());
        int num2 = Integer.parseInt(s.nextLine());

        System.out.println("Suma: " + OpSuma(num1, num2) + "\nResta: " + OpResta(num1, num2) + "\nMultiplicacion: "
                + OpMulti(num1, num2) + "\nDivision: " + OpDiv(num1, num2));
    }

    public static int OpSuma(int n, int m) {
        int suma = n + m;
        return suma;
    }

    public static int OpResta(int n, int m) {
        int resta = n - m;
        return resta;
    }

    public static int OpMulti(int n, int m) {
        int multi = n * m;
        return multi;
    }

    public static int OpDiv(int n, int m) {
        int div = n / m;
        return div;
    }
}