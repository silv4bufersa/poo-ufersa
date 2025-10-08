package javaObjectOriented.heranca2polimorfismo;

public interface Iinterface {
    // Constantes (implícitamente public, static e final)
    String CONSTANTE = "valor";

    // Método Abstrato
    void metodoAbstrato();

    // Métodos default
    default void metodoDefault() {
    }

    // Métodos estáticos
    static void metodoEstatico() {
    }

    // Métodos privados
    private void metodoPrivado() {
    }
}
