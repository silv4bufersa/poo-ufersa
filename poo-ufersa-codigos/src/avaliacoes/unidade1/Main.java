package avaliacoes.unidade1;

import java.util.Scanner;

public class Main {
    public static void print(String string) {
        System.out.print(string);
    }

    public static void printf(String string, Object... args) {
        System.out.printf(string, args);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        do {
            print("\n\nQuestões Prova - Unidade I\n\n");
            print("""
                    Opções
                    1 - Questão 1
                    2 - Questão 2
                    3 - Questão 3
                    4 - Questão 4
                    
                    0 - Sair.
                    
                    Questão:\t""");

            int questao = input.nextInt();

            switch (questao) {
                case 1:
                    print("Questao 1:\n\n");
                    Questao1 q1 = new Questao1();
                    q1.run();
                    break;
                case 2:
                    print("Questao 2:\n\n");
                    Questao2 q2 = new Questao2();
                    q2.run();
                    break;
                case 3:
                    print("Questao 3:\n\n");
                    Questao3 q3 = new Questao3();
                    q3.run();
                    break;
                case 4:
                    print("Questao 4:\n\n");
                    Questao4 q4 = new Questao4();
                    q4.run();
                    break;
                case 0:
                    print("Encerreando prova ...");
                    continuar = false;
                    break;
                default:
                    print("Ops!! Questão não existe.");
            }
        } while (continuar);
    }
}