package javaObjectOriented.heranca2polimorfismo.ExemploInterfaces.familia;

// Filho aqui é Pai.
// Pai e Mae aqui são "avós"

public class Neto extends Filho{
    private String nomeNeto;

    public Neto(String nomePai, String nomeNeto) {
        super(nomePai); // -> Classe Pai (Filho)
        this.nomeNeto = nomeNeto;
    }

    public String nomePai() {
        return "O nome do meu pai é " + super.getNome();
    }
}
