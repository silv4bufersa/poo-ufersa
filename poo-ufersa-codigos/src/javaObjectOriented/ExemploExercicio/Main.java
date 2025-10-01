package javaObjectOriented.ExemploExercicio;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void print(String string) {
        System.out.print(string);
    }

    public static void main(String[] args) {
        boolean continuar = true;
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<Veiculo>();

        do {
            print("""
                    Adicione Carros
                    
                    1 - Adicionar Carro
                    2 - Listar Veículos
                    0 - Sair
                    
                    Opção:\t""");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    print("Adicionando veículo\n");
                    print("Marca do Veículo: ");
                    String marca = input.next();
                    print("Modelo do Veículo: ");
                    String modelo = input.next();
                    print("Ano do Veículo: ");
                    int ano = input.nextInt();
                    Veiculo veiculo = new Veiculo(marca, modelo, ano);
                    veiculos.add(veiculo);
                    // veiculos.add(new Veiculo(marca, modelo, ano));
                    break;
                case 2:
                    if (!veiculos.isEmpty()) {
                        print("Listando veículos cadastrados\n\n");
                        for (Veiculo v : veiculos) {
                            System.out.printf("""
                                    Marca:  %s, Modelo: %s, Ano: %d
                                    """, v.getMarca(), v.getModelo(), v.getAno());
                        }
                    } else {
                        print("Nenhum veículos cadastrados!\n");
                    }
                    break;
                case 0:
                    print("Saindo ...");
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}
