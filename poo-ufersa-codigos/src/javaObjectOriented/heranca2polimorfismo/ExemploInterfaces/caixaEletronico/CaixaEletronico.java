package javaObjectOriented.heranca2polimorfismo.ExemploInterfaces.caixaEletronico;

public class CaixaEletronico implements ICaixaEletronico {
    @Override
    public void sacar(float valor) {
        System.out.printf("Sacando R$ %.2f da conta.\n", valor);
    }
}
