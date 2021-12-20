import java.util.Scanner;
/*Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.
*/
public class Ejercicio8T7bi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Este programa te pide la posición de un alfil en un tablero de ajedrez y te muestra sus posibles movimientos");
		int i; 
		int j;
		int posx;
		String posy="";
		String posyaux="";
		int posynum=0;
		String[][] tablero= new String[9][9];
		System.out.print("Introduce en que fila esta tu alfil en el tablero (1-8): ");
		boolean valido = true;
		do {
			valido=true;
			posx=Integer.parseInt(s.nextLine());
			if((posx<1)||(posx>8)) {
				valido=false;
				System.out.println("Valor invalido introduce un número entre 1 y 8 ambos incluidos.");
			}
		}while(!valido);
		System.out.print("Introduce la columna de su ubicación (a-h): ");
		do {
			valido=true;
			posy=s.nextLine();
			switch(posy) {
			case "a": 
			posynum=1;
			break;
			case "b": 
				posynum=2;
				break;
			case "c": 
				posynum=3;
				break;
			case "d": 
				posynum=4;
				break;
			case "e": 
				posynum=5;
				break;
			case "f": 
				posynum=6;
				break;
			case "g": 
				posynum=7;
				break;
			case "h": 
				posynum=8;
				break;
			default:
				System.out.println("La letra introducida no es una columna en el tablero.");
				valido=false;
			}
		}while(!valido);
		for(i=1;i<9;i++) {
			for(j=1;j<9;j++) {
				switch(j) {
				case 1: 
				posyaux="a";
				break;
				case 2: 
					posyaux="b";
					break;
				case 3: 
					posyaux="c";
					break;
				case 4: 
					posyaux="d";
					break;
				case 5: 
					posyaux="e";
					break;
				case 6: 
					posyaux="f";
					break;
				case 7: 
					posyaux="g";
					break;
				case 8: 
					posyaux="h";
					break;
				default:
					System.out.println("La letra introducida no es una columna en el tablero.");
					valido=false;
				}

				tablero[i][j]=(i+"-"+posyaux);
			}
		}
		System.out.print("Te puedes desplazar por las casillas: ");
		int colaux=posynum-1;
		for(i=posx-1;i>0;i--) {
			if(colaux>=1) {
				System.out.print(tablero[i][colaux]+" ");
				colaux--;
			}
		}
		System.out.println("");
		colaux=posynum+1;
		for(i=posx-1;i>0;i--) {
			if(colaux<=8) {
				System.out.print(tablero[i][colaux]+" ");
				colaux++;
			}
		}
		System.out.println("");
		colaux=posynum-1;
		for(i=posx+1;i<9;i++) {
			if(colaux>=1) {
				System.out.print(tablero[i][colaux]+" ");
				colaux--;
			}
		}
		System.out.println("");
		colaux=posynum+1;
		for(i=posx+1;i<9;i++) {
			if(colaux<=8) {
				System.out.print(tablero[i][colaux]+" ");
				colaux++;
			}
		}
	}
}
