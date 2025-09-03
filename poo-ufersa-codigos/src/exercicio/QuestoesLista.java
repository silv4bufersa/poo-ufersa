package exercicio;

import java.util.Scanner;

public class QuestoesLista {
    public static void questao1() {
        Scanner input = new Scanner(System.in);
        int anos, meses, dias, diasTotais;

        System.out.println("Digite sua idade em: anos, mês e dia.\n".toUpperCase());

        System.out.print("Quantos anos: ");
        anos = input.nextInt();

        System.out.print("Quantos meses: ");
        meses = input.nextInt();

        System.out.print("Quantos dias: ");
        dias = input.nextInt();

        // calculando idade em dias, apenas
        // (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
        // ano com 365 dias e o mês com 30

        diasTotais = ((anos * 365) + (meses * 30) + dias);

        // exibindo dados
        System.out.printf("""
                \nDados Recebidos
                
                Anos: %d
                Meses: %d
                Dias: %d
                
                Dias Totais: %d
                """, anos, meses, dias, diasTotais);
    }

    public static void questao2() {
        double media1 = (double) (8 + 9 + 7) / 3;
        System.out.printf("Média de 8, 9 e 7: %.2f\n", media1);

        double media2 = (double) (4 + 5 + 6) / 3;
        System.out.printf("Média de 4, 5 e 6: %.2f\n", media2);

        double somaMedias = media1 + media2;
        // double mediaTotal = somaMedias / 2;
        System.out.printf("Soma das médias: %.2f\n", somaMedias);

        double mediaTotal = (media1 + media2) / 2;
        System.out.printf("Média das médias: %.2f\n", mediaTotal);
    }

    public static void questao3() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um saldo: ");
        double saldo = input.nextDouble(); // vírgula = ponto.

        double saldoAjustado = saldo + (saldo * 0.01);

        System.out.printf("""
                \nSaldo digitado: %.2f
                Saldo ajustado (1%%): %.2f
                Soma dos saldos: %.2f + %.2f = %.2f
                """, saldo, saldoAjustado, saldo, saldoAjustado, (saldo + saldoAjustado));
    }

    public static void questao4() {
        int codPeca1, codPeca2;
        double vlPeca1, vlPeca2, calculoTotal;
        int qtdPeca1, qtdPeca2, porcentagemIpi;

        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite valor do IPI: ");
        porcentagemIpi = input.nextInt();

        System.out.println("\nDados das Peças");

        // peça 1
        System.out.print("\nCód. Peça 1: ");
        codPeca1 = input.nextInt();

        System.out.print("Valor Uni. Peça 1: ");
        vlPeca1 = input.nextDouble();

        System.out.print("Qtd. Peça 1: ");
        qtdPeca1 = input.nextInt();

        // peça 2
        System.out.println("\nCód. Peça 2: ");
        codPeca2 = input.nextInt();

        System.out.print("Valor Uni. Peça 2: ");
        vlPeca2 = input.nextDouble();

        System.out.print("Qtd. Peça 2: ");
        qtdPeca2 = input.nextInt();

        System.out.println("Cálculos Totais\n".toUpperCase());

        calculoTotal = (vlPeca1 * qtdPeca1 + vlPeca2 * qtdPeca2) * ((double) porcentagemIpi / 100 + 1);

        System.out.printf("""
                Peças %d e %d
                Valor total: R$ %.2f
                """, codPeca1, codPeca2, calculoTotal);
    }

    public static void questao5() {
        /*
        Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        (1SM=R$788,00)
        * */

        Scanner input = new Scanner(System.in);
        double salarioMinimoBase = 788.00;

        System.out.print("Salário para cálculo: ");
        double salarioMinimo = input.nextDouble();

        System.out.printf("Salário base para cálculo: R$ %.2f\n", salarioMinimoBase);

        // arredondado
        int qtdSalariosMinimos = (int) (salarioMinimo / salarioMinimoBase);
        System.out.printf("Quantidade de salários mínimos: %d\n", qtdSalariosMinimos);

        // exato
        double qtdSalariosMinimosExato = (salarioMinimo / salarioMinimoBase);
        System.out.printf("Quantidade de salários mínimos (precisão de duas casas): %.2f\n", qtdSalariosMinimosExato);
    }

    public static void questao6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = Integer.parseInt(input.nextLine());
        System.out.printf("""
                Número digitado: %d
                Antecessor: %d
                Sucessor: %d
                
                """, numero, (numero - 1), (numero + 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Questões feitas em sala.
                Escola a questão que quer ver de 1 à 6:\t""");
        int questao = input.nextInt();

        switch (questao) {
            case 1:
                questao1();
                break;
            case 2:
                questao2();
                break;
            case 3:
                questao3();
                break;
            case 4:
                questao4();
                break;
            case 5:
                questao5();
                break;
            case 6:
                questao6();
                break;
            default:
                System.out.println("Questão inválida!");
        }
    }
}
