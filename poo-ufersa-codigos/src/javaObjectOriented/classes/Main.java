package javaObjectOriented.classes;

public class Main {
    public static void main(String[] args) {
        Lamp lampada = new Lamp();

        lampada.ligar();
        System.out.println("Lâmpada Ligada: " + lampada.status());

        lampada.desligar();
        System.out.println("Lâmpada Ligada: " + lampada.status());
    }
}
