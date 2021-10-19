public class Ejercicio3T3 {
    public static void main(String[] args) {
        System.out.println("Conversor de pesetas a euros \n introduce la cantidad de pesetas: ");
        int pesetas = Integer.parseInt(System.console().readLine());
        double euros = (pesetas * 0.0060);
        System.out.println(euros);
    }
}