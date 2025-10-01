package familia;

public class Pai {
    protected String corSinal;
    protected String altura;

    public Pai(String corSinal, String Altura) {
        this.corSinal = corSinal;
        this.altura = Altura;
    }

    public void habilidadeMae() {
        System.out.println("Condutora de Motos");
    }
}
