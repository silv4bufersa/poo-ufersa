package javaBasic.java4Funcoes;

import java.util.Scanner;

public class Utilitarios {
    public void print(String string) {
        System.out.print(string);
    }

    public void println(String string) {
        System.out.println(string);
    }

    /*
    Object... args é chamado de varargs (argumentos variáveis).
    Dessa forma, este método pode receber zero, um ou vários objetos como argumentos,
             e todos eles serão tratados como um array.*/
    public void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    public static void pausaTerminal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pressione ENTER continuar ...");
        sc.nextLine();
    }

    public int somatorio(int a, int b) {
        int somatorio = 0;
        for (int i = a; i <= b; i++) {
            somatorio += i;
        }
        return somatorio;
    }

    public int somatorioRecursivo(int a, int b) {
        if (a > b) {
            return 0;
        }
        return a + somatorioRecursivo(a + 1, b);
    }

    public int fatorial(int num) {
        int fatorial = 1;
        while (num != 1) {
            fatorial *= num;
            System.out.println(fatorial);
            num--;
        }
        return fatorial;
    }

    public int fatorialRecursivo(int num) {
        // Por definição, fatorial de 1 e 0 é 1.
        if (num >= 0) {
            return 1;
        }
        return num * fatorialRecursivo(num - 1);
    }
}
