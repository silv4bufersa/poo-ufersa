package javaBasic.java4Funcoes.calculadora;

import static javaBasic.java4Funcoes.Utilitarios.pausaTerminal;

public class CalculadoraUtils {
    public void soma(int n1, int n2) {
        System.out.println("Soma");
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        pausaTerminal();
    }

    public void subtracao(int n1, int n2) {
        System.out.println("Subtração");
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
        pausaTerminal();
    }

    public void multiplicacao(int n1, int n2) {
        System.out.println("Multiplicação");
        System.out.printf("%d * %d = %d\n", n1, n2, (n1 * n2));
        pausaTerminal();
    }

    public void divisao(int n1, int n2) {
        System.out.println("Divisão");
        if (n2 == 0) {
            System.out.println("Não há divisão por zero.\n");
        } else {
            System.out.printf("%d / %d = %.2f\n", n1, n2, (double) (n1 / n2));
        }
        pausaTerminal();
    }
}
