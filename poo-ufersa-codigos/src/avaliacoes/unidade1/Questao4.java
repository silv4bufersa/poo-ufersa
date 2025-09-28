package avaliacoes.unidade1;

import java.util.Scanner;

public class Questao4 {
    public void print(String string) {
        System.out.print(string);
    }

    public void printf(String string, Object... args) {
        System.out.printf(string, args);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        int numero;

        while (true) {
            print("\nDigite um número inteiro: ");
            numero = input.nextInt();

            if (numero < 0) {
                print("Número inválido! Tente novamente.\n");
                continue;
            } else if (numero == 0) {
                print("Encerrando o programa ...");
                break;
            }

            // par
            if (numero % 2 == 0) {
                printf("\nTabuada de Multiplicação do %d\n", numero);
                for (int i = 0; i <= 5; i++) {
                    printf("%d * %d = %d\n", numero, i, numero * i);
                }
            } else {
                printf("\nTabuada de Soma do %d\n", numero);
                for (int i = 1; i <= 5; i++) {
                    printf("%d + %d = %d\n", numero, i, numero + i);
                }
            }
        }
    }
}