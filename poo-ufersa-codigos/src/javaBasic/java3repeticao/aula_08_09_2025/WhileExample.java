package java3decisao.aula08_09_2025;

public class WhileExample {

    public static void exemploWhile() {
        /*

        enquanto: verdade {
            // bla bla bla
        }
        * */

        int contador = 11;

        System.out.println("\n(While) Exibindo contador:\n");
        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        int outroContador = 11;
        System.out.println("\n(Do-While) Exibindo contador:\n");
        do {
            System.out.println(outroContador);
            outroContador++;
        } while (outroContador <= 10);
    }

    public static void main(String[] args) {
        exemploWhile();
    }
}
