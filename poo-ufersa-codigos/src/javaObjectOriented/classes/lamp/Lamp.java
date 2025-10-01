package javaObjectOriented.classes.lamp;

public class Lamp {
    // campos ou características
    private boolean ligada;

    // métodos ou habilidades/funcionalidades

    /* public implícito */
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
        }
    }

    public String status() {
        if (ligada) {
            return "Ligada";
        } else {
            return "Desligada";
        }
    }
}
