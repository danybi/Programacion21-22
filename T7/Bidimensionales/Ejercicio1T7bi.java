public class Ejercicio1T7bi {
    public static void main(String[] args) {
        int[][] cuadro = new int[3][6];
        cuadro[0][0] = 0;
        cuadro[0][1] = 30;
        cuadro[0][2] = 2;
        cuadro[0][5] = 5;
        cuadro[1][0] = 75;
        cuadro[1][4] = 0;
        cuadro[2][2] = -2;
        cuadro[2][3] = 9;
        cuadro[2][5] = 11;
        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("|Fila %2d ", i);
            for (int j = 0; j < 6; j++) {
                System.out.printf("| %6d   ", cuadro[i][j]);
            }
            System.out.println("|");
            System.out.println("----------------------------------------------------------------------------");
        }
    }
}