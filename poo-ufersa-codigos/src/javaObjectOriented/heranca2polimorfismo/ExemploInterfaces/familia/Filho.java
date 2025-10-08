package javaObjectOriented.heranca2polimorfismo.ExemploInterfaces.familia;

//public class Filho extends ClassAbs, ClassAbs2 { (não pode)

public class Filho implements Pai, Mae {
    private String nome;

    public Filho(String nome) {
        this.nome = nome;
    }

    public String getNome(boolean showName) {
        if (showName) {
            System.out.printf("Meu nome é %s\n", this.nome);
        }
        return nome;
    }

    public String getNome() {
        return nome;
    }
}


