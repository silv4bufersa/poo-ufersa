package javaObjectOriented.heranca2polimorfismo.ExemploAbstractClass;

public class Retangulo extends Forma {

    public Retangulo(String descricao) {
        this.nomeForma = descricao;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando Circulo");
    }

    @Override
    public void informacoes() {
        System.out.println("Informacoes de Circulo");
    }
}
