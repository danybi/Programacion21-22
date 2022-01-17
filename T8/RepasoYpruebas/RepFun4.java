import matematicas.FuncionesMatematicas.digitos;
import matematicas.FuncionesMatematicas.digitoN;

public class RepFun4 {
    public static void main(String[] args) {
        int[] num = { 10, 28, 3001 };
        for (int nume : num) {
            System.out.print("El número " + nume + " en morse es: " + convmorse(nume));
            System.out.println("En morse");
        }
    }

    public static String convmorse(int n) {
        String[] morse = { "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----." };
        String result = "";
        for (int i = 0; i < matematicas.FuncionesMatematicas.digitos(n); i++) {
            result += morse[matematicas.FuncionesMatematicas.digitoN(n, i)];
        }
        return result;
    }
}
