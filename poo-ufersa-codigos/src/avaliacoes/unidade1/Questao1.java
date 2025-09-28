package avaliacoes.unidade1;

import java.util.ArrayList;
import java.util.List;

public class Questao1 {
    /*
    [["_","_","_"],
    ["_","_","_"],
    ["_","_","_"]]

    ["D","_","_"],
    ["_","D","_"],
    ["_","_","D"]]

    ["D","A","A"],
    ["A","D","A"],
    ["A","A","D"]]

    ["D","A","A"],
    ["A","X","A"],
    ["A","A","D"]]
    */
    public void print(String string) {
        System.out.print(string);
    }

    public void exibeMatriz(List<List<String>> matriz) {
        for (List<String> linha : matriz) {
            for (String elemento : linha) {
                print(elemento + " ");
            }
            print("\n");
        }
    }

    /*
    matriz = [
                ["_", "_", "_"],
                ["_", "_", "_"],
                ["_", "_", "_"]
            ];
    * */
    public void run() {
        List<List<String>> matriz = new ArrayList<>();

        print("Matriz\n\n1ª Etapa:\n");
        for (int i = 0; i < 3; i++) {
            List<String> linhaTemp = new ArrayList<String>();
            for (int j = 0; j < 3; j++) {
                linhaTemp.add("_");
            }
            matriz.add(linhaTemp);
        }
        exibeMatriz(matriz);

        print("\n2ª Etapa:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    matriz.get(i).set(j, "D");
                }
            }
        }
        exibeMatriz(matriz);

        print("\n3ª Etapa:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    matriz.get(i).set(j, "A");
                }
            }
        }
        exibeMatriz(matriz);

        print("\n4ª Etapa:\n");
        int meio = 3 / 2; // 3/2 = 1.5 (int) 1
        matriz.get(meio).set(meio, "X");
        exibeMatriz(matriz);
    }
}
