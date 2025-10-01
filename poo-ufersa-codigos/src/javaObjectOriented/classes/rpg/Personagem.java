package javaObjectOriented.classes.rpg;

public class Personagem {
    // Atributos
    public String nome;
    public int idade;
    private String classe;
    private int nivel;
    private int exp;

    // Atributo de Classe
    public static int qtdPersonagens;

    // Construtores
    public Personagem() {
        this.nome = "Sem Nome";
        this.idade = 0;
        this.classe = "Sem Classe";
        this.nivel = 0;
        this.exp = 0;
        qtdPersonagens++;
    }

    public Personagem(String nome, int idade) {
        this.nome = nome;   // recebe nome
        this.idade = idade; // recebe idade
        this.classe = "Sem Classe";
        this.nivel = 0;
        this.exp = 0;
        qtdPersonagens++;
    }

    public Personagem(String nome, int idade, String classe) {
        this.nome = nome;   // recebe nome
        this.idade = idade; // recebe idade
        this.classe = classe;
        this.nivel = 0;
        this.exp = 0;
        qtdPersonagens++;
    }

    public Personagem(String nome, int idade, String classe, int nivel, int exp) {
        this.nome = nome;   // recebe nome
        this.idade = idade; // recebe idade
        this.classe = classe;
        this.nivel = nivel;
        this.exp = exp;
        qtdPersonagens++;
    }
}
