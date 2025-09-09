package java4Funcoes.calculadora;

import java4Funcoes.Utilitarios;

public class Main {
    public static void main(String[] args) {
        Utilitarios utils = new Utilitarios();
        CalculadoraUtils calc = new CalculadoraUtils();

        utils.println("Calculadora");

        // calc.soma(10, 10);
        // calc.subtracao(10, 10);
        // calc.multiplicacao(10, 10);
        // calc.divisao(10, 10);

        utils.printf("Somatório de 10 até 10: %d", utils.somatorio(10, 20));
        // 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 = 165
        utils.printf("\nSomatório de 10 até 10 (recursivo): %d", utils.somatorioRecursivo(10, 20));

        utils.printf("\nFatorial de 10: %d", utils.fatorial(4));
        utils.printf("\nFatorial de 10: %d", utils.fatorialRecursivo(1));
    }
}
