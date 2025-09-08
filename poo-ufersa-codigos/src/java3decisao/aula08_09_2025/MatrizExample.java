package java3decisao.aula08_09_2025;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MatrizExample {
    /*
    [[1, 2, 3], // getFirst()
     [4, 5, 6], // get()
     [7, 8, 9] // getLast()
    ]

    linhas = numero de listas internas
    colunas = numero de elementos de apenas lista interna
    */

    public static void exemploMatriz() {
        Scanner input = new Scanner(System.in);
        Random geradorNumero = new Random();

        List<List<Integer>> matriz = new ArrayList<>();

        System.out.print("Linhas: ");
        int linhas = input.nextInt();

        System.out.print("Colunas: ");
        int colunas = input.nextInt();

        System.out.println("Preenchendo a Matriz");
        for (int i = 0; i < linhas; i++) {
            List<Integer> linha = new ArrayList<>();
            for (int j = 0; j < colunas; j++) {
                // 10 soma do limite inferior e 89 é o limite superior
                int numero = geradorNumero.nextInt(89) + 10;
                System.out.println("Numero gerado: " + numero);
                linha.add(numero);
            }
            matriz.add(linha);
        }

        // Exibindo matriz preenchida
        System.out.println("Exibindo Matriz\n");
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.getFirst().size(); j++) {
                System.out.printf("%d ", matriz.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        exemploMatriz();
    }
}
