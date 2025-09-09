package java4Funcoes.aula_09_09_2025;

import java.util.Scanner;

public class UtilitariosCalculadora {
    Utilitarios utils = new Utilitarios();

    public int soma(int n1, int n2) {
        return n1 + n2;
    }

    public int subtracao(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    public double divisao(int n1, int n2) {
        int resultado = 0;

        if (n2 == 0) {
            utils.println("Não pode dividir por 0.");
        } else {
            resultado = n1 / n2;
        }

        return resultado;
    }

    public int defineNumero() {
        Scanner input = new Scanner(System.in);
        utils.print("Digite um número: ");
        return input.nextInt();
    }
}
