package java4Funcoes.aula_09_09_2025;

public class Utilitarios {
    public void print(String mensagem) {
        System.out.print(mensagem);
    }

    public void println(String mensagem) {
        System.out.println(mensagem);
    }

    public void printf(String mensagem, Object... argumentos) {
        System.out.printf(mensagem, argumentos);
    }

    public void printlnf(String mensagem, Object... argumentos) {
        System.out.printf(mensagem.concat("\n"), argumentos);
    }

    public void exibeMenu() {
        print("""
                
                Menu
                
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                0 - Sair
                
                Opção:\t""");
    }
}
