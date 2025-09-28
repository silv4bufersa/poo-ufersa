package java2condicionais;
// meu.caminho.pasta;
// minha.pasta;
// com.br.minha.empresa.projeto;

/*
package meu.caminho.pasta;
package minha.pasta
package com.br.minha.empresa.projeto
* */

import java.util.Scanner;

public class IfElseSwitch {
    public static void print(String str) {
        System.out.print(str);
    }

    public static void println(String str) {
        System.out.println(str);
    }

    public static void dadosExibeTeclado() {
        println("Hello World!");

        Scanner input = new Scanner(System.in);

        print("Digite seu nome: ");
        String nome = input.nextLine();

        print("Digite sua idade: ");
        int idade = Integer.parseInt(input.nextLine());

        System.out.println("\nSeu nome " + nome + " e sua idade " + idade);
        System.out.printf("\nSeu nome %s e sua idade %d.\n", nome, idade);
        System.out.printf("""
                \nDados Digitados:
                ----------------
                Seu nome %s.
                Sua idade %d.
                """, nome, idade);
    }

    public void runSwitch1() {
        Scanner input = new Scanner(System.in);

        print("Digite o dia da semana [1 ... 7]: ");
        int diaDaSemana = Integer.parseInt(input.nextLine());

        switch (diaDaSemana) {
            case 1: // if {}
                println("Segunda");
                break;
            case 2:
                println("Terça");
                break;
            case 3:
                println("Quarta");
                break;
            case 4:
                println("Quinta");
                break;
            case 5:
                println("Sexta");
                break;
            case 6:
                println("Sábado");
                break;
            case 7: // else if ()
                println("Domingo");
                break;
            default: // else {}
                println("Dia inválido!");
                break;
        }
    }

    public void runSwitch2() {
        Scanner input = new Scanner(System.in);

        print("Digite o dia da semana [1 ... 7]: ");
        int diaDaSemana = Integer.parseInt(input.nextLine());

        String stringDiaDaSemana = switch (diaDaSemana) {
            case 1 -> {
                println("Primeiro dia da semana!");
                yield "Segunda";
            }
            case 2 -> "Terça"; // yield
            case 3 -> "Quarta";
            case 4 -> "Quinta";
            case 5 -> "Sexta";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Dia inválido!";
        };

        println("Dia da semana: " + stringDiaDaSemana);
    }

    public static void main(String[] args) {
        println("\nEstruturas condicionais".toUpperCase());
        Scanner input = new Scanner(System.in);

        print("Digite um número: ");
        int n1 = input.nextInt();

        print("Digite outro número: ");
        int n2 = input.nextInt();

        if (n1 == n2) {
            println("São iguais.");
        } else if (n1 > n2) {
            println("N1 é maior que N2.");
        } // else if (n1 < n2) {}
        else {
            println("N2 é maior que N1.");
        }
    }
}
