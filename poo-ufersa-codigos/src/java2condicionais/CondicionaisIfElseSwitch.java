package java2condicionais;

import java.util.Scanner;

public class CondicionaisIfElseSwitch {
    public void println(String mensagem) {
        System.out.println(mensagem);
    }

    public void print(String mensagem) {
        System.out.print(mensagem);
    }

    public void runIf() {
        Scanner input = new Scanner(System.in);

        print("Digite a idade do professor: ");
        int idadeProfessor = Integer.parseInt(input.nextLine());

        print("Digite a idade média da turma: ");
        int mediaIdadeTurma = Integer.parseInt(input.nextLine());

        if (idadeProfessor > mediaIdadeTurma) {
            println("Professor velho, normal!");
        } else if (idadeProfessor == mediaIdadeTurma) {
            println("Todo mundo igual!");
        } else {
            println("Sei lá o que djabeisso.");
        }
    }

    public void runSwitch1() {
        Scanner input = new Scanner(System.in);

        print("Digite o dia da semana [1 ... 7]: ");
        int diaDaSemana = Integer.parseInt(input.nextLine());

        switch (diaDaSemana) {
            case 1:
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
            case 7:
                println("Domingo");
                break;
            default:
                println("Dia inválido!");
                break;
        }
    }

    public void runSwitch2() {
        Scanner input = new Scanner(System.in);

        print("Digite o dia da semana [1 ... 7]: ");
        int diaDaSemana = Integer.parseInt(input.nextLine());

        String stringDiaDaSemana = switch (diaDaSemana) {
            case 1 -> "Segunda";
            case 2 -> "Terça";
            case 3 -> "Quarta";
            case 4 -> "Quinta";
            case 5 -> "Sexta";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Dia inválido!";
        };

        println("Dia da semana: " + stringDiaDaSemana);
    }

    public void runSwitch2variacao() {
        Scanner input = new Scanner(System.in);

        print("Digite o dia da semana [1 ... 7]: ");
        int diaDaSemana = Integer.parseInt(input.nextLine());

        String stringDiaDaSemana = switch (diaDaSemana) {
            case 1 -> {
                println("Vamos começar a semana bem!");
                yield "Segunda";
            }
            case 2 -> "Terça"; // yield "Terça"
            case 3 -> "Quarta";
            case 4 -> "Quinta";
            case 5 -> "Sexta";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> {
                println("Dia inválido!");
                yield null;
            }
        };

        if (stringDiaDaSemana != null) {
            println("Dia da semana: " + stringDiaDaSemana);
        }
    }
}
