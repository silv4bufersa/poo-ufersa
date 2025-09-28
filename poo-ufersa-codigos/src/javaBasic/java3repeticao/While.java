package java3decisao;

import java.util.Scanner;

public class While {

    public static void pausaTerminal(Scanner input) {
        System.out.print("Pressione ENTER para voltar ao menu...");
        input.nextLine(); // consome o ENTER anterior
        input.nextLine(); // espera o usuário apertar ENTER
    }

    public static void main(String[] args) {
        int n1, n2, opcao;

        Scanner input = new Scanner(System.in);

        /*
        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        */
        boolean continuar = false;
        System.out.print("Exibir calculadora [1: Sim & 'any other number': Não]: ");
        opcao = input.nextInt();
        if (opcao == 1) {
            continuar = true;
        }

        while (continuar) {
            System.out.print("""
                    \nMenu da Calculadora
                    
                    1 - Somar
                    2 - Subtrair
                    3 - Multiplicar
                    4 - Dividir
                    0 - Sair
                    
                    Operação:/t""");

            opcao = input.nextInt();

            // condição de saída/encerramento
            if (opcao == 0) {
                System.out.println("Encerrando ...");
                break;
            }

            // seguimento padrão
            System.out.print("Digite o primeiro numero: ");
            n1 = input.nextInt(); // \n ao final
            System.out.print("Digite o segundo numero: ");
            n2 = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("\nResultado: %d + %d = %d\n", n1, n2, (n1 + n2));
                    pausaTerminal(input);
                    break;
                case 2:
                    System.out.printf("\nResultado: %d - %d = %d\n", n1, n2, (n1 - n2));
                    pausaTerminal(input);
                    break;
                case 3:
                    System.out.printf("\nResultado: %d * %d = %d\n", n1, n2, (n1 * n2));
                    pausaTerminal(input);
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Não dividirás por 0.");
                    } else {
                        System.out.printf("Resultado: %d / %d = %.2f\n", n1, n2, (double) (n1 / n2));
                    }
                    pausaTerminal(input);
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
}
