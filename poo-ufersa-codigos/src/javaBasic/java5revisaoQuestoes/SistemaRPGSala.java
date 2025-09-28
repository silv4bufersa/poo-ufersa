package javaBasic.java5revisaoQuestoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SistemaRPGSala {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.print("""
                Sistema RPG de POO v0.0.1
                
                1 - Listar Personagens [ok]
                2 - Atribuir XP [ok]
                3 - Personagens que Podem Evoluir [ok] 
                4 - Evoluir Personagens [ok]
                5 - Adicionar Personagem [ok]
                6 - Remover Personagem [ok]
                7 - Exibir Personagem Mais Forte (p/ Xp) [ok]
                
                0 - Sair
                
                Opção:\t""");

        opcao = input.nextInt();
        return opcao;
    }

    public static Object[] inicializaPersonagensArray() {
        List<String> person = Arrays.asList("Guerreiro", "Ladino", "Paladino");
        List<Integer> lv = Arrays.asList(1, 1, 1);
        List<Integer> xp = Arrays.asList(0, 0, 0);

        Object[] personagens = new Object[]{person, lv, xp};
        return personagens;
    }

    public static List<Object> inicializaPersonagensList() {
        List<String> person = Arrays.asList("Guerreiro", "Ladino", "Paladino");
        List<Integer> lv = Arrays.asList(1, 1, 1);
        List<Integer> xp = Arrays.asList(0, 0, 0);

        return Arrays.asList(person, lv, xp);
    }

    public static void inicializaPersonagens(List<String> person, List<Integer> lv, List<Integer> xp) {
        person.add("Guerreiro");
        lv.add(1);
        xp.add(0);

        person.add("Ladino");
        lv.add(1);
        xp.add(0);

        person.add("Paladino");
        lv.add(1);
        xp.add(0);

        person.add("Necromante");
        lv.add(1);
        xp.add(0);

        person.add("Dragon Slayer");
        lv.add(1);
        xp.add(0);

        person.add("Mago");
        lv.add(1);
        xp.add(0);
    }

    public static void listaPersonagens(List<String> person, List<Integer> lv, List<Integer> xp) {
        for (int i = 0; i < person.size(); i++) {
            System.out.printf("%d. %s ", i + 1, person.get(i));
            System.out.printf("Lv.: %d ", lv.get(i));
            System.out.printf("Exp.: %d\n", xp.get(i));
        }
        System.out.println();
    }

    public static void atribuirExperiencia(List<String> person, List<Integer> lv, List<Integer> xp) {
        Scanner input = new Scanner(System.in);
        int opcao, qtdXp;

        System.out.print("\nPersonagens Cadastrados\n");
        listaPersonagens(person, lv, xp);

        do {
            System.out.print("Qual personagem deseja treinar: ");
            opcao = input.nextInt();

            // validação de integridade.
            if (opcao > person.size() || opcao < 0) {
                System.out.println("Personagem Inválido.");
            } else {
                break;
            }
        } while (true); // do-while contínuio que encerra no break;

        // atribuindo de fato xp
        System.out.printf("Quantidade de XP em %s:\t", person.get(opcao - 1));
        qtdXp = input.nextInt();

        // setar xp
        xp.set(opcao - 1, qtdXp + (xp.get(opcao - 1)));
    }

    public static int qtdPersonagensEvoluiveis(List<String> person, List<Integer> lv, List<Integer> xp) {
        /*
         * Lista todos os personagens cuja quantidade de experiência
         * seja <= a quantidade necessária para que possam evoluir.
         *
         * QtdEvolucao = Lv. 3 * 100 = 300 xp p/ evoluir.
         * */

        int xpParaEvoluir;
        int qtd = 0;

        for (int i = 0; i < xp.size(); i++) {
            xpParaEvoluir = lv.get(i) * 100;

            if (xp.get(i) >= xpParaEvoluir) {
                qtd++;
            }
        }

        return qtd;
    }

    public static void personagensEvoluiveis(List<String> person, List<Integer> lv, List<Integer> xp) {
        /*
         * Lista todos os personagens cuja quantidade de experiência
         * seja <= a quantidade necessária para que possam evoluir.
         *
         * QtdEvolucao = Lv. 3 * 100 = 300 xp p/ evoluir.
         * */

        int xpParaEvoluir;
        boolean encontrou = false;

        for (int i = 0; i < xp.size(); i++) {
            xpParaEvoluir = lv.get(i) * 100; //qtd minima pra evoluir

            if (xp.get(i) >= xpParaEvoluir) {
                System.out.printf("%d. %s Lv. %d XP. %d\n", (i + 1), person.get(i), lv.get(i), xp.get(i));
                encontrou = true;
            }
        }

        System.out.println();

        if (encontrou == false) {
            System.out.println("Nenhum personagem está pronto pra evoluir.\n");
        }
    }

    public static void evoluirPersonagem(List<String> person, List<Integer> lv, List<Integer> xp) {
        /*
         * Incrementa o nível do personagem de acordo com a quantidade de Xp que ele possui.
         * Segundo a regra: Para cada 1 Lv. devem ser necessários  Lv * 100 de Xp.
         * Após cada evolução, o Xp restante deve ser preservado (ou descartado?).
         * */

        Scanner input = new Scanner(System.in);
        int opcao;

        if (qtdPersonagensEvoluiveis(person, lv, xp) > 0) {

            System.out.println("Personagens que Podem Evoluir\n---");
            personagensEvoluiveis(person, lv, xp);

            System.out.print("Qual personagem deseja evoluir: ");
            opcao = input.nextInt() - 1; // index da lista

            // Mago. Lv. 1 & 150 Xp.

            int xpRestante = xp.get(opcao) - (lv.get(opcao) * 100);
            xp.set(opcao, xpRestante);

            // Mago. Lv. 1 & 50 Xp.
            lv.set(opcao, lv.get(opcao) + 1);

            System.out.printf("Personagem %s evoluído para o Lv. %d com sucesso!\n", person.get(opcao), lv.get(opcao));
        } else {
            System.out.println("Sem personagens para evoluir.");
        }

        /*
         * 1. Incrementar o Nível do Personagem Escolhido
         * 2. Calcular o XP gasto pra evoluir
         * 3. Calcular e reatribuir o XP restante
         * */
    }

    public static void adicionarPersonagem(List<String> person, List<Integer> lv, List<Integer> xp) {
        /*
         * Adicionar personagens a lista, pedindo apenas a classe.
         * Nível inicial sempre deve ser 1 e;
         * Experiência inicial sempre deve ser 0.
         * */

        Scanner input = new Scanner(System.in);
        System.out.print("Nome do Personagem: ");
        String nomePersonagem = input.nextLine();

        person.add(nomePersonagem);
        lv.add(1);
        xp.add(0);

        System.out.printf("Personagem %s adicionado com sucesso!\n", person.getLast());
    }

    public static void removerPersonagem(List<String> person, List<Integer> lv, List<Integer> xp) {
        /*
         * Remover personagens personagens da lista, pedendo apenas o índice,
         * de acordo com a exibição dos personagens.
         * */

        int opcao;
        Scanner input = new Scanner(System.in);
        listaPersonagens(person, lv, xp);

        System.out.print("Qual personagem deseja remover: ");
        opcao = input.nextInt() - 1;

        System.out.printf("Removendo %s do set de Personagens.\n", person.get(opcao));

        person.remove(opcao);
        lv.remove(opcao);
        xp.remove(opcao);

        System.out.println("Personagem removido com sucesso!");
    }

    public static void exibePersonagemMaisForte(List<String> person, List<Integer> lv, List<Integer> xp) {
        int posicaoMaiorNivel = 0;
        int maiorNivel = 0;

        // por level
        for (int i = 0; i < xp.size(); i++) {
            if (lv.get(i) > maiorNivel) {
                maiorNivel = lv.get(i);
                posicaoMaiorNivel = i;
            }
        }

        System.out.printf("Personagem mais forte: %s Lv. %d\n", person.get(posicaoMaiorNivel), maiorNivel);
    }

    public static void main(String[] args) {
        boolean executando = true;
        int opcao;

        List<String> personagens = new ArrayList<>();
        List<Integer> niveis = new ArrayList<>();
        List<Integer> experiencia = new ArrayList<>();
        inicializaPersonagens(personagens, niveis, experiencia);

        /*
         * Forma Alternativa
         *
         * Object[] personagensGerados = inicializaPersonagens();
         * List<String> personagens = (List<String>) personagensGerados[0];
         * List<Integer> niveis = (List<Integer>) personagensGerados[1];
         * List<Integer> experiencia = (List<Integer>) personagensGerados[2];
         */

        do {
            opcao = menu();

            switch (opcao) {
                case 1:
                    System.out.println("Listar Personagens\n---");
                    listaPersonagens(personagens, niveis, experiencia);
                    break;
                case 2:
                    System.out.println(" Atribuir XP\n---");
                    atribuirExperiencia(personagens, niveis, experiencia);
                    break;
                case 3:
                    System.out.println("Personagens que Podem Evoluir\n---");
                    personagensEvoluiveis(personagens, niveis, experiencia);
                    break;
                case 4:
                    System.out.println("Evoluindo Personagem\n---");
                    evoluirPersonagem(personagens, niveis, experiencia);
                    break;
                case 5:
                    System.out.println("Adicionando Personagem\n---");
                    adicionarPersonagem(personagens, niveis, experiencia);
                    break;
                case 6:
                    System.out.println("Removendo Personagem\n---");
                    removerPersonagem(personagens, niveis, experiencia);
                    break;
                case 7:
                    System.out.println("Atribuindo XP\n---");
                    exibePersonagemMaisForte(personagens, niveis, experiencia);
                    break;
                case 0:
                    System.out.println("Saindo ...");
                    executando = false;
            }
        } while (executando);
    }
}
