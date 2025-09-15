package java5revisaoQuestoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaRPGSala {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.print("""
                Sistema RPG Sala:
                
                1 - Listar Personagens
                2 - Atribuir XP
                3 - Evoluir Personagens
                4 - Adicionar Personagem
                5 - Remover Personagem
                6 - Exibir Personagem Mais Forte (p/ Xp)
                0 - Sair
                
                Opção:\t""");

        opcao = input.nextInt();
        return opcao;
    }

    public static void inicializaPersonagens(List<String> person, List<Integer> lv, List<Integer> xp) {
        person.add("Guerreiro");    // 0
        person.add("Ladino");       // 1
        person.add("Paladino");     // 2

        lv.add(1); // 0
        lv.add(1); // 1
        lv.add(1); // 2

        xp.add(0); // 0
        xp.add(0); // 1
        xp.add(0); // 2
    }

    public static void atribuirExperiencia(List<String> person, List<Integer> lv, List<Integer> xp) {
        Scanner input = new Scanner(System.in);
        int opcao, qtdXp;

        System.out.print("Personagens Cadastrados\n");
        listaPersonagens(person, lv, xp);

        System.out.print("Qual personagem deseja treinar: ");
        opcao = input.nextInt();

        // atribuindo de fato xp
        System.out.printf("Quantidade de XP em %s:\t", person.get(opcao - 1));
        qtdXp = input.nextInt();

        // setar xp
        xp.set(opcao - 1, qtdXp + (xp.get(opcao - 1)));
    }

    /*
                    0          1          2
    Lista1 = ["Guerreiro", "Ladino", "Paladino"]
    Lista2 = ["1",         "1",      "1"]
    Lista3 = ["0",         "0",      "0"]

    Lista1[1]
    Lista2[1]
    Lista3[1]
    */

    public static void listaPersonagens(List<String> person, List<Integer> lv, List<Integer> xp) {
        for (int i = 0; i < person.size(); i++) {
            System.out.printf("%d. Personagem: %s ", i + 1, person.get(i));
            System.out.printf("Lv.: %d ", lv.get(i));
            System.out.printf("Exp.: %d\n", xp.get(i));
        }
    }

    // [1, 2, 3, 1]
    public static void exibePersonagemMaisForte(List<String> person, List<Integer> lv, List<Integer> xp) {
        int posicaoMaiorNivel = 0;
        int maiorNivel = 0;

        for (int i = 0; i < xp.size(); i++) {
            if (xp.get(i) > maiorNivel) {
                maiorNivel = xp.get(i);
                posicaoMaiorNivel = i;
            }
        }

        System.out.printf("Personagem mais forte: %s Xp. %d\n", person.get(posicaoMaiorNivel), maiorNivel);
    }

    public static void main(String[] args) {
        boolean executando = true;

        /* Personagem: classe, nivel (lv) e experiencia (xp) */

        List<String> personagens = new ArrayList<>();
        List<Integer> niveis = new ArrayList<>();
        List<Integer> experiencia = new ArrayList<>();

        inicializaPersonagens(personagens, niveis, experiencia);

        do {
            int opcao = menu();

            switch (opcao) {
                case 1:
                    System.out.print("Dados do Personagem\n---\n");
                    listaPersonagens(personagens, niveis, experiencia);
                    break;
                case 2:
                    System.out.print("Atribuindo XP\n---\n");
                    atribuirExperiencia(personagens, niveis, experiencia);
                    break;
                case 3:
                    // ...
                case 4:
                    // ...
                case 5:
                    // ...
                case 6:
                    exibePersonagemMaisForte(personagens, niveis, experiencia);
                    break;
                case 0:
                    System.out.println("Saindo ...");
                    executando = false;
            }
        } while (executando);
    }
}
