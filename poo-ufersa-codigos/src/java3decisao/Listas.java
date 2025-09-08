package java3decisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void exemplosListas() {
        List<String> cores = new ArrayList<>();

        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Laranja");

        // seco
        System.out.println(cores);

        // foreach
        for (String cor : cores) {
            System.out.println(cor);
        }

        // for
        for (int i = 0; i < cores.size(); i++) {
            System.out.println(cores.get(i));
        }

        System.out.println("Quantidade de Cores: " + cores.size());
        System.out.printf("Primeira cor: %s\n", cores.getFirst());
        System.out.printf("Ultima cor: %s\n", cores.getLast());

        cores.add("Roxo");
        System.out.printf("Ultima cor: %s\n", cores.getLast());

        cores.removeFirst();
        System.out.printf("Primeira cor: %s\n", cores.getFirst());

        cores.removeLast();
        System.out.printf("Ultima cor: %s\n", cores.getLast());

        cores.remove(cores.size() - 2);
        System.out.println("Quantidade de Cores: " + cores.size());
        System.out.printf("Ultima cor: %s\n", cores.getLast());

        cores.clear();
        System.out.println("Quantidade de Cores: " + cores.size());
    }

    public static void main(String[] args) {
        exemplosListas();
    }
}
