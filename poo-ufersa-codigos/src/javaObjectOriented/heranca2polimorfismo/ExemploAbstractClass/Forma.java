package javaObjectOriented.heranca2polimorfismo.ExemploAbstractClass;

public abstract class Forma {
    protected String nomeForma;

    public abstract void desenhar();

    public abstract void informacoes();

    public void teste() {
        System.out.println("Testando classe forma!");
    }

    public String getNomeForma() {
        return nomeForma;
    }
}
