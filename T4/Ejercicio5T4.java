public class Ejercicio5T4 {
    /*
     * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b
     * =0).
     */
    public static void main(String[] args) {
        System.out.print("El programa resuelve una ecuación de primer grado (ax+b=0): \na: ");
        Double a = Double.parseDouble(System.console().readLine());
        System.out.print("b: ");
        Double b = Double.parseDouble(System.console().readLine());
        Double resultado = -b / a;
        if (a == 0) {
            System.out.println("No se puede dividir entre 0");
        }
        System.out.println("Pasa a ser x=-b/a y el resultado es x=" + resultado);
    }
}