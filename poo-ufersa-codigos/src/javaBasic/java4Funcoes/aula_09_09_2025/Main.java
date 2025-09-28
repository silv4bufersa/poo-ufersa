package javaBasic.java4Funcoes.aula_09_09_2025;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static List<Integer> retornaNumeros() {
        UtilitariosCalculadora utilsCalc = new UtilitariosCalculadora();
        List<Integer> numeros = new ArrayList<>();

        numeros.add(utilsCalc.defineNumero());
        numeros.add(utilsCalc.defineNumero());

        return numeros;
    }

    public static void calculadora() {
        Scanner input = new Scanner(System.in);
        Utilitarios utils = new Utilitarios();
        UtilitariosCalculadora utilsCalc = new UtilitariosCalculadora();

        int opcao;

        do {
            utils.exibeMenu();
            opcao = input.nextInt();

            if (opcao > 4 || opcao < 0) {
                utils.println("Opção Inválida ");
            } else {

                if (opcao == 0) {
                    utils.println("Saindo ...");
                    break;
                }

                List<Integer> numeros = retornaNumeros();

                switch (opcao) {
                    case 1:
                        utils.printlnf("Resultado: %d", utilsCalc.soma(numeros.get(0), numeros.get(1)));
                        break;
                    case 2:
                        utils.printlnf("Resultado: %d", utilsCalc.subtracao(numeros.getFirst(), numeros.getLast()));
                        break;
                    case 3:
                        utils.printlnf("Resultado: %d", utilsCalc.multiplicacao(numeros.get(0), numeros.get(1)));
                        break;
                    case 4:
                        utils.printlnf("Resultado: %.2f", utilsCalc.divisao(numeros.get(0), numeros.get(1)));
                        break;
                }
            }
        } while (true);
    }

    public static void main(String[] args) {
        calculadora();
    }
}
