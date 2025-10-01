package javaObjectOriented.classes.veiculosHeranca;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public static int qtdVeiculos = 0;

    public static void println(String string) {
        System.out.println(string);
    }

    // Construtores
    public Veiculo() {
        this.marca = "Sem Marca";
        this.modelo = "Sem Modelo";
        this.ano = 1996;
        qtdVeiculos++;
    }

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        qtdVeiculos++;
    }

    public void acelerar() {
        println("Acelerando...");
    }

    public void frear() {
        println("Freando...");
    }

    public void exibirInfo() {
        println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }
}
