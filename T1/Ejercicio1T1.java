public class Ejercicio1T1 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        System.out.println("Este programa resuelve una ecuación de primer grado (A * x + B = C)");
        System.out.print("Dame el valor de A: ");
        A = Integer.parseInt(System.console().readLine());
        System.out.print("Dame el valor de B: ");
        B = Integer.parseInt(System.console().readLine());
        System.out.print("Dame el valor de C: ");
        C = Integer.parseInt(System.console().readLine());
        System.out.println("La ecuación pasa a ser x = " + "(" + C + "-" + B + ")" + "/" + A + " y su solución es: x = "
                + (C - B) / A);
    }
}