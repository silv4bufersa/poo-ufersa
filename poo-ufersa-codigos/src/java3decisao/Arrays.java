package java3decisao;

public class Arrays {
    public static void main(String[] args) {
        /*
        String[] cores = new String[5];

        cores[0] = "Azul";
        cores[1] = "Verde";
        cores[2] = "Amarelo";
        cores[3] = "Vermelho";
        cores[4] = "Laranja";
        */

        // Arrays
        String[] cores = new String[]{
                "Azul",
                "Verde",
                "Amarelo",
                "Vermelho",
                "Laranja"
        };

        System.out.println("Quantidade de Cores: " + cores.length);
        System.out.printf("Primeira cor: %s\n", cores[0]);
        System.out.printf("Ultima cor: %s\n", cores[cores.length - 1]);
    }
}
























