package javaObjectOriented.heranca2polimorfismo.ExemploAbstractClass;

import java.sql.SQLOutput;

public class Circulo extends Forma {

    public Circulo(String descricao) {
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
