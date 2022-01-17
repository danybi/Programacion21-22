import Conversiones.convierteA;
import matematicas.FuncionesMatematicas;

public class pruebaConversiones {
    public static void main(String[] args) {
    	int[] n= {20032047, 0, 3351, 87648};
    	for(int numero: n) {
    		System.out.println("El numero "+numero+" es "+Conversiones.convierteA.palotes(numero)+ " en el sistema de palotes");
    		System.out.println("El numero "+numero+" es "+Conversiones.convierteA.morse(numero)+ " en morse");
    	}
    }
}