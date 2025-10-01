package javaObjectOriented.classes.rpg;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void println(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        List<Personagem> personagens = new ArrayList<>();

        Personagem p1 = new Personagem("Personagem 1", 25);
        println("Nome: " + p1.nome);

        Personagem p2 = new Personagem();
        println("Nome: " + p2.nome);

        println("Quantidade de Personagens: " + Personagem.qtdPersonagens);

        personagens.add(p1);
        personagens.add(p2);

        println("\nPersonagens Cadastrados");
        for (Personagem p: personagens) {
            println("Nome: " + p.nome);
        }
    }
}
