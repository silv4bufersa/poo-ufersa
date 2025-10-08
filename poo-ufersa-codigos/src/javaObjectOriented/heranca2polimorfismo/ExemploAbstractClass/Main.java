package javaObjectOriented.heranca2polimorfismo.ExemploAbstractClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Usando a Abstract Class Forma como "tipo" no List
        List<Forma> formas = new ArrayList<>();

        formas.add(new Retangulo("Ret. Azul"));
        formas.add(new Retangulo("Ret. Amarelo"));
        formas.add(new Retangulo("Circ. Azul"));
        formas.add(new Retangulo("Circ. Amarelo"));

        System.out.println("Lista de Formas\n");

        for (Forma f : formas) {
            System.out.println(f.getNomeForma());
        }
    }
}
