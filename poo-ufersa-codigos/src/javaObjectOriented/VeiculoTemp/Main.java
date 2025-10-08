package javaObjectOriented.VeiculoTemp;

import javaObjectOriented.classes.veiculosHeranca.Carro;
import javaObjectOriented.classes.veiculosHeranca.Veiculo;

public class Main {
    public static void println(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {

        // Apenas Veículos (SuperClasse)
        Veiculo fiat = new Veiculo("Fiat", "Uno", 2010);
        Veiculo ducati = new Veiculo("Ducati", "Panigale V4", 2022);

        fiat.exibirInfo();
        ducati.exibirInfo();

        println("Veículos Instanciados: " + Veiculo.qtdVeiculos);

        // Carros (SubClasse)
        Carro meuCarro = new Carro();
        meuCarro.exibirInfo();

        Carro seuCarro = new Carro("Nissan", "Sentra",2025, 4, "Diesel");
        seuCarro.exibirInfo();

        println("Veículos Instanciados: " + Veiculo.qtdVeiculos);
    }
}
