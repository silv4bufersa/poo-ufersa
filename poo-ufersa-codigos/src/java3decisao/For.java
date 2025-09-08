package java3decisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class For {
    public static void exemploListasArrays() {
        // Lista e Preenchiemento
        List<String> coresList = new ArrayList<>();

        coresList.add("Azul");
        coresList.add("Verde");
        coresList.add("Amarelo");
        coresList.add("Vermelho");
        coresList.add("Laranja");

        System.out.println("\nList (ArrayList)");
        for (String cor : coresList) {
            System.out.println(cor);
        }

        // Array e Preenchimento
        String[] coresArray = new String[5];

        coresArray[0] = "Azul";
        coresArray[1] = "Verde";
        coresArray[2] = "Amarelo";
        coresArray[3] = "Vermelho";
        coresArray[4] = "Laranja";

        System.out.println("\nArray (com Preenchimento)");
        for (int i = 0; i < coresArray.length; i++) {
            System.out.println(coresArray[i]);
        }

        // Array Carregado de Valores Iniciais
        String[] coresArray2 = new String[]{
                "Azul",
                "Verde",
                "Amarelo",
                "Vermelho",
                "Laranja"
        };

        System.out.println("\nArray (Preenchido)");
        for (String cor : coresArray) {
            System.out.println(cor);
        }
    }

    public static void exemploBuscaBreak(List<List<Integer>> matrix, Integer numero) {
        /*
        [[1,2,3,4],
         [4,5,6,7],
         [7,8,9,0]]
        */
        int linhas = matrix.size(); // numero de listas internas
        int colunas = matrix.get(0).size(); // numero de elementos das listas internas

        outer:
        for (int i = 0; i < linhas; i++){
            inner:
            for (int j = 0; j < colunas; j++){
                System.out.print(matrix.get(i).get(j) + " ");
                if (matrix.get(i).get(j) == numero){
                    System.out.printf("\nAchei a 1ª ocorrência: %d\n", numero);
                    break outer;
                }
            }
            System.out.println("Passando do for.");
            System.out.println();
        }
    }

    public static void exemploMatriz() {
        Scanner input = new Scanner(System.in);

        // Matriz (Lista de Listas)
        List<List<Integer>> matriz = new ArrayList<>();
        Random numeroAleatorio = new Random();

        int linhas = 3;
        int colunas = 3;
        int nuneroGerado;

        for (int i = 0; i < linhas; i++) {
            List<Integer> linha = new ArrayList<>();
            for (int j = 0; j < colunas; j++) {
                System.out.printf("\nNúmero para a posição [%d][%d] da matriz: ", i + 1, j + 1);
                linha.add(input.nextInt());

//                nuneroGerado = numeroAleatorio.nextInt(91) + 10; // O "+ 10" serve pra definir o limite inferior.
//                System.out.printf("Número para a posição [%d][%d] da matrix: %d\n", i + 1, j + 1, nuneroGerado);
//                linha.add(nuneroGerado);
            }
            matriz.add(linha);
        }

        System.out.println("\nExibindo Matriz\n");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz.get(i).get(j) + " ");
            }
            System.out.println();
        }

        exemploBuscaBreak(matriz, 10);
    }

    public static void main(String[] args) {
        exemploMatriz();
    }
}
