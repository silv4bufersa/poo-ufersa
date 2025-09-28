package avaliacoes.unidade1;

import java.util.Scanner;

public class Questao3 {
    public void print(String string) {
        System.out.print(string);
    }

    public void printf(String string, Object... args) {
        System.out.printf(string, args);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        double salario = 0.0;
        double aumento = 0.0;

        do {
            print("\n\nCalculadora das Organizações Tabajara\n");
            print("Digite o salário: ");
            salario = input.nextDouble();

            if (salario < 0) {
                print("Saindo ...");
                break;
            }

            if (salario <= 280) {
                aumento = 0.20;
            } else if (salario > 280 && salario <= 700) {
                aumento = 0.15;
            } else if (salario > 700 && salario <= 1500) {
                aumento = 0.10;
            } else if (salario > 1500) {
                aumento = 0.05;
            }

            print("\n========= Informações =========\n");
            printf("\nSalário antes do reajuste: R$ %.2f", salario);
            printf("\nPorcentagem de aumento: %.0f %%", (aumento * 100));
            printf("\nValor do aumento: R$ %.2f", (aumento * salario));
            printf("\nNovo salário: R$ %.2f", salario + (aumento * salario));
        } while (true);
    }
}