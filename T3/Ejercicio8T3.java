public class Ejercicio8T3 {
    /*
     * Escribe un programa que calcule el salario semanal de un empleado en base a
     * las horas trabajadas, a razón de 12 euros la hora.
     */
    public static void main(String[] args) {
        System.out.println("Calculo de salario semanal a 12 euros la hora\nintroduzca la horas trabajadas: ");
        int horas = Integer.parseInt(System.console().readLine());
        int salario = horas * 12;
        System.out.println(salario);
    }
}