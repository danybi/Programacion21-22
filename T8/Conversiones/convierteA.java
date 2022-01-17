package Conversiones;

public class convierteA {
	public static String palotes(int n) {
		String transformado="";
		for(int i=0;i<matematicas.FuncionesMatematicas.digitos(n);i++) {
			for(int j=0;j<matematicas.FuncionesMatematicas.digitoN(n, i);j++) {
				transformado +="|";
			}
			if(i<matematicas.FuncionesMatematicas.digitos(n)-1) {
				transformado+="-";
			}
		}
		return transformado;
	}
	
	public static String morse(int n) {
		String[] cambioM= {"----- ",".---- ","..--- ","...-- ","....- ","..... ","-.... ","--... ","---.. ","----. "};
		String cambio="";
		for(int i=0;i<matematicas.FuncionesMatematicas.digitos(n);i++) {
			cambio+=cambioM[matematicas.FuncionesMatematicas.digitoN(n, i)];
		}
		return cambio;
	}
}