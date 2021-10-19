/*Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3πr2h */
public class Ejercicio9T3 {
    public static void main(String[] args) {
        System.out.println("calculo del volumen de un cono\n Introduce el radio: ");
        double radio = Double.parseDouble(System.console().readLine());
        System.out.println("Introduce la altura: ");
        double altura = Double.parseDouble(System.console().readLine());
        double volumen = (1 / 3) * (Math.PI * (radio * radio) * altura);
        System.out.println("El volumen es: " + volumen);
    }
}