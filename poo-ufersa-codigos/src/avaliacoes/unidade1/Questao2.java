package avaliacoes.unidade1;

import java.util.Scanner;

public class Questao2 {
    public void print(String string) {
        System.out.print(string);
    }

    public void printf(String string, Object... args) {
        System.out.printf(string, args);
    }

    public double calculaRetangulo(double base, double altura) {
        return base * altura;
    }

    public double calculaCirculo(double raio) {
        return 3.14 * (raio * raio);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        boolean continuar = true;

        do {
            print("""
                    \n\n=== MENU DE OPÇÕES ===
                    1 - Calcular área de um retângulo (base × altura).
                    2 - Calcular área de um círculo (π × raio²).                    
                    0 - Sair.
                    
                    Opção: """);
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    print("Digite a base do retângulo: ");
                    double base = input.nextInt();
                    print("Digite a altura do retângulo: ");
                    double altura = input.nextInt();
                    printf("Área do Retângulo: %f", calculaRetangulo(base, altura));
                    break;
                case 2:
                    print("Digite o raio do círculo:");
                    double raio = input.nextDouble();
                    printf("Área do Círculo: %f", calculaCirculo(raio));
                    break;
                case 0:
                    print("Saindo ...");
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}