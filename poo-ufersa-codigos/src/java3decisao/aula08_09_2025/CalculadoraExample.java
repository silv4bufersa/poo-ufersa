package java3decisao.aula08_09_2025;

import java.util.Scanner;

public class CalculadoraExample {

    public static void pausaTerminal(Scanner input) {
        System.out.print("Pressione ENTER para voltar ao menu...");
        input.nextLine();
        input.nextLine();
    }

    public static void soma(Scanner input, int n1, int n2) {
        System.out.println("Soma\n");
        System.out.printf("\n%d + %d = %d\n", n1, n2, (n1 + n2));
        pausaTerminal(input);
    }

    public static void subtracao(Scanner input, int n1, int n2) {
        System.out.println("Subtração\n");
        System.out.printf("\n%d - %d = %d\n", n1, n2, (n1 - n2));
        pausaTerminal(input);
    }

    public static void multiplicacao(Scanner input, int n1, int n2) {
        System.out.println("Multiplicação\n");
        System.out.printf("\n%d * %d = %d\n", n1, n2, (n1 * n2));
        pausaTerminal(input);
    }

    public static void divisao(Scanner input, int n1, int n2) {
        System.out.println("Divisão\n");
        if (n2 == 0) {
            System.out.println("Não há divisão por zero.\n");
        } else {
            System.out.printf("%d / %d = %.2f\n", n1, n2, (double) (n1 / n2));
        }
        pausaTerminal(input);
    }

    public static void exemploCalculadora() {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.print("""
                    Calculadora:
                    
                    1 - Soma
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    0 - Sair
                    
                    Opção:\t""");

            opcao = input.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo ...");
                break;
            }

            System.out.print("Digite n1: ");
            int n1 = input.nextInt();

            System.out.print("Digite n2: ");
            int n2 = input.nextInt();

            switch (opcao) {
                case 1:
                    soma(input, n1, n2);
                    break;
                case 2:
                    subtracao(input, n1, n2);
                    break;
                case 3:
                    multiplicacao(input, n1, n2);
                    break;
                case 4:
                    divisao(input, n1, n2);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        exemploCalculadora();
    }
}
