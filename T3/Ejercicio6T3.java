public class Ejercicio6T3 {
    public static void main(String[] args) {
        System.out.println("Calculo del área de un triangulo");
        System.out.print("Introduce la base: ");
        double base = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce la altura: ");
        double altura = Double.parseDouble(System.console().readLine());
        double area = (base * altura) / 2;
        System.out.print("El area del triangulo es: " + area);
    }
}