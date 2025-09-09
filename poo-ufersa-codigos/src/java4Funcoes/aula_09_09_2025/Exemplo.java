package java4Funcoes.aula_09_09_2025;

public class Exemplo {

    /*
    Só fazem: sem atributos e sem retorno.
    Só retorna: faz algo, mas sem atributos.
    Fazem e retornam: Usam atributos e retornam algo.
    */

    public static void exbibeMensagem() {
        System.out.println("Mensagem.");
    }

    public static void print(String mensagem) {
        System.out.print(mensagem);
    }

    public static void println(String mensagem) {
        System.out.println(mensagem);
    }

    public static void printf(String mensagem, Object... argumentos) {
        System.out.printf(mensagem, argumentos);
    }

    public static void soma(int num1, int num2) {
        printf("%d + %d = %d", num1, num2, (num1 + num2));
    }

    public static void soma(int num1, int num2, int num3) {
        printf("%d + %d + %d= %d", num1, num2, num3, (num1 + num2 + num3));
    }

    public static int somaRetorna(int num1, int num2) {
        int soma = num1 + num2;
        return soma;
    }

    public static int somaRetornaDireto(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        print("Olá e não pula linha. -> ");
        println("Mensagem e pula linha.");
        printf("Minha idade: %d anos e %d meses", 29, 3);

        // ...

        soma(10, 10);
        soma(10, 10, 1);

    }
}
