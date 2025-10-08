package javaObjectOriented.heranca2polimorfismo.ExemploInterfaces.familia;

public class Main {
    public static void println(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        Filho filho = new Filho("Bruno");

        filho.habilidadeMae();
        filho.habilidadePai();
        filho.getNome(true);

        System.out.println("Meu nome é " + filho.getNome());

        Neto netinho = new Neto("Papai", "Eu");

        println("Neto".toUpperCase());

        // mae aqui é a pedreira avó.
        netinho.habilidadeMae();
    }
}


