// POO: 1 -

package javaObjectOriented.classes.veiculosHeranca;

// Subclasse -> Veiculo
public class Carro extends Veiculo {
    private int numPortas;
    private String tipoCombustivel;

    // Construtores
    public Carro() {
        super(); // Chama o construtor da superclasse
        this.numPortas = 0;
        this.tipoCombustivel = "Gasolina";
    }

    public Carro(int numeroPortas, String tipoCombustivel) {
        super(); // Chama o construtor da superclasse
        this.numPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Carro(String marca, String modelo, int ano, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano); // Chama o construtor da superclasse
        this.numPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto");
    }

    // Override (sobrescrita) de método
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama método da superclasse
        System.out.println("Portas: " + numPortas + ", Combustível: " + tipoCombustivel);
    }
}
