package javaObjectOriented.classes;

public class Lamp {
    // campos ou características
    private boolean ligada;

    // métodos ou habilidades/funcionalidades

    /* public implícito */
    void ligar() {
        ligada = true;
    }

    void desligar() {
        if (ligada) {
            ligada = false;
        }
    }

    String status() {
        if (ligada) {
            return "Ligada";
        } else {
            return "Desligada";
        }
    }
}
