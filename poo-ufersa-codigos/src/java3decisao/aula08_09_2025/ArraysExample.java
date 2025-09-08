package java3decisao.aula08_09_2025;

import java.util.ArrayList;
import java.util.List;

public class ArraysExample {

    public static void exemploArray() {
        String[] cores = new String[5]; // 0 > (tam - 1)

        cores[0] = "Amarelo";
        cores[1] = "Azul";
        cores[2] = "Roxo";
        cores[3] = "Vermelho";
        cores[4] = "Laranja";

        // For convencional
        for (int i = 0; i < cores.length; i++) {
            System.out.println(cores[i]);
        }

        // Foreach
        for (String cor : cores) {
            System.out.println(cor);
        }

        String[] nomes = new String[]{
                "Bruno",
                "Manoel",
                "Joana",
                "Matheus",
                "Jorge"
        };
    }

    public static void exemploLista() {
        List<String> cores = new ArrayList<>();
        cores.add("Amarelo"); // remove 1º
        cores.add("Preto"); // remove 2º
        cores.add("Azul");
        cores.add("Violeta");
        cores.add("Cinza"); // remove 3º

        cores.remove("Amarelo");
        cores.removeFirst();
        cores.removeLast();

        System.out.println("Exibindo Cores:\n");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }

    public static void main(String[] args) {
        // exemploArray();
        exemploLista();
    }
}
