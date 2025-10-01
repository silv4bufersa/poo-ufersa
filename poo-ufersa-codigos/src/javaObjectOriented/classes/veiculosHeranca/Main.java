package javaObjectOriented.classes.veiculosHeranca;

public class Main {

    public static void println(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();

        println(veiculo.modelo);
    }
}
