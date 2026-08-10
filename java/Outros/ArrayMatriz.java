// Sarah Aurora Barbosa Alencar
// Hendrielly Rikelly Pereira Silva

public class ArrayMatriz {
    // Uso de Array
    public static void array() {
        System.out.println("#  ARRAY  #");

        // Inicia o Array e adiciona os itens nele
        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 2;
        }

        // Printa o indice do array (i) e o valor associado,
        // acessando o valor do indice com base na variável i
        System.out.println("Indice\tValor");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + "\t" + nums[i]);
        }
    }

    // Uso da Matriz
    public static void matriz() {
        System.out.println("#  MATRIZ  #");

        // Cria a matriz, com números pre-definidos
        int[][] matriz = {
            {1, 2, 3},
            {2, 4, 6},
            {3, 6, 9}
        };

        // Acessa a linha
        for (int i = 0; i < matriz.length; i++) {
            // Acessa a coluna correspondente, com base no for anterior
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Quebra de linha visual
        }
    }

    // Main
    public static void main(String[] args) {
        array();
        System.out.println();
        matriz();
    }
}
