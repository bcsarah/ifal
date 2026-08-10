public class Matriz {
    public static void main(String[] args) {
        // Criar Matriz
        int[][] matriz = {
            {1, 2, 3},
            {2, 4, 6},
            {3, 6, 9}
        };

        // Mostrar Maatriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
