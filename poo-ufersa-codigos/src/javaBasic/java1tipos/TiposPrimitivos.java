package java1tipos;

// CameoCase -> CarroBlindado
// snake_case -> carro_blindado

import java.util.ArrayList;
import java.util.List;

public class TiposPrimitivos {
    public void tipoPrimitivos() {

        // definição
        int numero;
        double salario;
        float preco;
        boolean status;
        char letra;
        long grandeValor;

        // tipos complexos;
        String nome;
        List<String> nomes;
        ArrayList<Integer> numeros;

        // atribuições
        numero = 10;
        salario = 1350.00;
        preco = 12;
        grandeValor = 10L;
        status = true; // ou false;
        letra = 'b';
        nome = "Bruno Silva";

        nomes = new ArrayList<>();
        nomes.add("Manoel");
        nomes.add("Maria");
        nomes.add("Rodrigues");
        nomes.remove("Manoel");
        nomes.remove("Maria");

        // ...

        numeros = new ArrayList<>();
        numeros.add(21);
        numeros.add(34);
        numeros.add(8);

        // Remove pelo valor numérico (valueOf do Integger)
        numeros.remove(Integer.valueOf(8));
        numeros.remove(Integer.valueOf(21));
    }
}
