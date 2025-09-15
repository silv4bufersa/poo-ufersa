# Questões Java com Listas, Loops e Funções

> As questões a seguir devem ser resolvidas usando listas, arrays, funções, laços de repetição (while, do-while, for,
> for-each) e estruturas condicionais.

## Questões 1-20: Listas e Loops

### **Questão 1 - Sistema de Notas**

```java
// Crie um programa que armazene 10 notas de alunos em uma lista,
// calcule a média usando for, e mostre quantas notas estão acima da média usando while.
```

### **Questão 2 - Controle de Estoque**

```java
// Desenvolva um sistema de estoque onde o usuário pode:
// 1. Adicionar produtos (nome, quantidade)
// 2. Listar todos os produtos usando for-each
// 3. Buscar produtos com quantidade menor que 5 usando while
// 4. Sair do sistema
```

### **Questão 3 - Agenda de Contatos**

```java
// Crie uma agenda que armazene contatos (nome, telefone).
// Use while para menu: 1-Adicionar, 2-Listar, 3-Buscar, 4-Sair.
// Use for para mostrar todos os contatos formatados.
```

### **Questão 4 - Análise de Vendas**

```java
// Uma loja precisa analisar suas vendas mensais.
// Crie uma lista com 12 valores de vendas, use for para calcular:
// - Total anual
// - Média mensal
// - Melhor mês (maior venda)
// Use while para refazer o cálculo se necessário
```

### **Questão 5 - Sistema de Reservas**

```java
// Sistema de reservas de hotel com 20 quartos.
// Use lista booleana onde true=ocupado, false=livre.
// Menu com while: 1-Reservar, 2-Cancelar, 3-Ver disponíveis, 4-Sair.
// Use for para mostrar status dos quartos.
```

### **Questão 6 - Calculadora de IMC**

```java
// Programa que armazene 15 pessoas (nome, peso, altura) em lista.
// Calcule IMC para cada usando for: IMC = peso/(altura*altura)
// Classifique: <18.5=magreza, 18.5-24.9=normal, 25-29.9=sobrepeso, >=30=obesidade
// Use while para permitir novas consultas
```

### **Questão 7 - Jogo da Adivinhação**

```java
// Gere 10 números aleatórios entre 1-100 em uma lista.
// O usuário tem 5 tentativas para adivinhar um número.
// Use while para as tentativas e for para verificar se acertou.
// Dica: use Collections.shuffle() para embaralhar.
```

### **Questão 8 - Gerenciador de Tarefas**

```java
// Lista de tarefas com: descrição, prioridade (1-5), concluída (sim/não)
// Menu com while: 1-Add tarefa, 2-Listar, 3-Marcar como concluída, 4-Listar pendentes, 5-Sair
// Use for-each para mostrar tarefas coloridas por prioridade
```

### **Questão 9 - Calculadora de Finanças**

```java
// Sistema que armazena 30 gastos mensais em lista.
// Use for para: soma total, maior gasto, menor gasto, média
// Use while para permitir filtrar por categorias
// Mostre gastos acima de R$100 usando stream ou for
```

### **Questão 10 - Sistema de Biblioteca**

```java
// Lista de livros: título, autor, disponível (boolean)
// Menu while: 1-Emprestar, 2-Devolver, 3-Listar disponíveis, 4-Listar todos, 5-Sair
// Use for para mostrar livros disponíveis com índice
// Valide empréstimo apenas se livro estiver disponível
```

### **Questão 11 - Conversor de Temperaturas**

```java
// Armazene 7 temperaturas em Celsius em lista.
// Use for para converter para Fahrenheit: F = C × 1,8 + 32
// Use while para permitir conversão inversa (Fahrenheit para Celsius)
// Mostre temperaturas extremas (máxima e mínima)
```

### **Questão 12 - Sistema de Votação**

```java
// Eleição com 3 candidatos armazenados em lista.
// Use while para votação (10 votos)
// Use for para contar votos de cada candidato
// Mostre o vencedor e percentual de votos
```

### **Questão 13 - Calculadora de Idades**

```java
// Armazene idades de 25 pessoas em lista.
// Use for para: média de idade, pessoa mais velha, mais nova
// Use while para categorizar: 0-12=criança, 13-17=adolescente, 18-59=adulto, 60+=idoso
// Conte quantos em cada categoria
```

### **Questão 14 - Jogo da Forca**

```java
// Lista de 15 palavras para o jogo.
// Use while para o loop principal do jogo (6 tentativas)
// Use for para mostrar a palavra oculta com letras adivinhadas
// Use Collections.shuffle() para escolher palavra aleatória
```

### **Questão 15 - Sistema de Pedidos**

```java
// Restaurante: lista de pedidos (número, descrição, valor, status)
// Menu while: 1-Novo pedido, 2-Listar pedidos, 3-Alterar status, 4-Total vendido, 5-Sair
// Use for para calcular valor total dos pedidos "entregues"
// Use for-each para listar pedidos "em preparação"
```

### **Questão 16 - Analisador de Texto**

```java
// Receba uma frase e armazene palavras em lista.
// Use for para: contar palavras, palavra mais longa, mais curta
// Use while para permitir buscar palavras específicas
// Conte vogais e consoantes usando charAt()
```

### **Questão 17 - Sistema de Pontuação**

```java
// Jogo com 10 jogadores armazenados em lista (nome, pontuação)
// Use for para: ranking em ordem decrescente, pontuação média
// Use while para permitir adicionar pontos a jogadores
// Mostre os 3 primeiros colocados
```

### **Questão 18 - Controle de Freqüência**

```java
// Lista de 30 alunos (nome, presenças, faltas)
// Menu while: 1-Registrar presença, 2-Registrar falta, 3-Ver relatório, 4-Sair
// Use for para calcular percentual de frequência de cada aluno
// Alerte se frequência < 75% (usando if dentro do for)
```

### **Questão 19 - Simulador de Dado**

```java
// Simule 1000 lançamentos de dado, armazene resultados em lista.
// Use for para contar frequência de cada face (1-6)
// Use while para permitir simular mais lançamentos
// Calcule percentual de cada número
```

### **Questão 20 - Sistema de Níveis (Expandida em Sala)**

```java
// Jogo RPG: lista de 8 personagens (nome, nível, experiência)
// Use for para: subir de nível (XP >= nível*100)
// Use while para menu: 1-Add XP, 2-Listar personagens, 3-Ver mais forte, 4-Sair
// Mostre personagens que podem evoluir
```

## Questões 21-30: Com Funções

### **Questão 21 - Calculadora Estatística**

```java
/**
 * Crie funções para:
 * 1. calcularMedia(List<Double> numeros)
 * 2. encontrarMaximo(List<Double> numeros)
 * 3. encontrarMinimo(List<Double> numeros)
 * 4. calcularDesvioPadrao(List<Double> numeros)
 * Use essas funções para analisar uma lista de 20 números
 */
```

### **Questão 22 - Validador de Senhas**

```java
/**
 * Função validarSenha(String senha) que retorne boolean verificando:
 * - Mínimo 8 caracteres
 * - Pelo menos 1 letra maiúscula
 * - Pelo menos 1 número
 * - Pelo menos 1 caractere especial
 * Teste com uma lista de 10 senhas
 */
```

### **Questão 23 - Conversor de Moedas**

```java
/**
 * Crie funções:
 * 1. realParaDolar(double valor, double cotacao)
 * 2. dolarParaReal(double valor, double cotacao)
 * 3. realParaEuro(double valor, double cotacao)
 * Use menu com while para conversões múltiplas
 */
```

### **Questão 24 - Gerador de Sequências**

```java
/**
 * Funções para gerar sequências:
 * 1. fibonacci(int n) - retorna List<Integer> com n termos
 * 2. pares(int limite) - retorna lista de pares até limite
 * 3. impares(int limite) - retorna lista de ímpares até limite
 * Menu para escolher qual sequência gerar
 */
```

### **Questão 25 - Processador de Texto**

```java
/**
 * Funções para:
 * 1. contarVogais(String texto)
 * 2. inverterString(String texto)
 * 3. ehPalindromo(String texto)
 * 4. contarPalavras(String texto)
 * Aplique em uma lista de frases
 */
```

### **Questão 26 - Sistema de Descontos**

```java
/**
 * Funções para calcular descontos:
 * 1. descontoPorQuantidade(int quantidade, double precoUnitario)
 * 2. descontoPorValor(double valorTotal)
 * 3. descontoClienteVip(boolean isVip, double valorTotal)
 * Aplique em uma lista de compras
 */
```

### **Questão 27 - Classificador de Números**

```java
/**
 * Funções que retornam boolean:
 * 1. ehPrimo(int numero)
 * 2. ehPar(int numero)
 * 3. ehPerfeito(int numero)
 * 4. ehArmstrong(int numero)
 * Classifique uma lista de 25 números
 */
```

### **Questão 28 - Calculadora Geométrica**

```java
/**
 * Funções para cálculo de áreas:
 * 1. areaCirculo(double raio)
 * 2. areaRetangulo(double base, double altura)
 * 3. areaTriangulo(double base, double altura)
 * 4. areaQuadrado(double lado)
 * Menu para escolher cálculo
 */
```

### **Questão 29 - Organizador de Listas**

```java
/**
 * Funções para manipular listas:
 * 1. ordenarCrescente(List<Integer> lista)
 * 2. ordenarDecrescente(List<Integer> lista)
 * 3. removerDuplicatas(List<Integer> lista)
 * 4. encontrarComuns(List<Integer> lista1, List<Integer> lista2)
 * Aplique em duas listas de números
 */
```

### **Questão 30 - Simulador de Investimentos**

```java
/**
 * Funções para:
 * 1. calcularJurosSimples(double capital, double taxa, int tempo)
 * 2. calcularJurosCompostos(double capital, double taxa, int tempo)
 * 3. calcularMontanteMensal(double aporte, double taxa, int meses)
 * Simule diferentes cenários de investimento
 */
```

## 💡 Exemplo Desenvolvido - Questão 21

```java
import java.util.*;
import java.util.function.Function;

public class CalculadoraEstatistica {

    // Função para calcular média
    public static double calcularMedia(List<Double> numeros) {
        if (numeros.isEmpty()) return 0;
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.size();
    }

    // Função para encontrar máximo
    public static double encontrarMaximo(List<Double> numeros) {
        if (numeros.isEmpty()) return 0;
        double max = numeros.get(0);
        for (double num : numeros) {
            if (num > max) max = num;
        }
        return max;
    }

    // Função para encontrar mínimo
    public static double encontrarMinimo(List<Double> numeros) {
        if (numeros.isEmpty()) return 0;
        double min = numeros.get(0);
        for (double num : numeros) {
            if (num < min) min = num;
        }
        return min;
    }

    // Função para calcular desvio padrão
    public static double calcularDesvioPadrao(List<Double> numeros) {
        if (numeros.size() < 2) return 0;
        double media = calcularMedia(numeros);
        double somaQuadrados = 0;

        for (double num : numeros) {
            somaQuadrados += Math.pow(num - media, 2);
        }

        return Math.sqrt(somaQuadrados / (numeros.size() - 1));
    }

    // Função para gerar números aleatórios
    public static List<Double> gerarNumerosAleatorios(int quantidade, double min, double max) {
        List<Double> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < quantidade; i++) {
            double numero = min + (max - min) * random.nextDouble();
            numeros.add(Math.round(numero * 100.0) / 100.0); // Arredonda para 2 casas
        }

        return numeros;
    }

    // Função para mostrar estatísticas
    public static void mostrarEstatisticas(List<Double> numeros, String titulo) {
        System.out.println("\n=== " + titulo + " ===");
        System.out.println("Números: " + numeros);
        System.out.println("Média: " + calcularMedia(numeros));
        System.out.println("Máximo: " + encontrarMaximo(numeros));
        System.out.println("Mínimo: " + encontrarMinimo(numeros));
        System.out.println("Desvio Padrão: " + calcularDesvioPadrao(numeros));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        // Menu principal
        boolean executando = true;
        while (executando) {
            System.out.println("\n=== CALCULADORA ESTATÍSTICA ===");
            System.out.println("1. Adicionar números manualmente");
            System.out.println("2. Gerar números aleatórios");
            System.out.println("3. Mostrar estatísticas");
            System.out.println("4. Limpar lista");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantos números deseja adicionar? ");
                    int quantidade = scanner.nextInt();
                    System.out.println("Digite os números:");
                    for (int i = 0; i < quantidade; i++) {
                        numeros.add(scanner.nextDouble());
                    }
                    break;

                case 2:
                    System.out.print("Quantidade de números: ");
                    int qtd = scanner.nextInt();
                    System.out.print("Valor mínimo: ");
                    double min = scanner.nextDouble();
                    System.out.print("Valor máximo: ");
                    double max = scanner.nextDouble();

                    numeros = gerarNumerosAleatorios(qtd, min, max);
                    System.out.println("Números gerados: " + numeros);
                    break;

                case 3:
                    if (numeros.isEmpty()) {
                        System.out.println("Lista vazia! Adicione números primeiro.");
                    } else {
                        mostrarEstatisticas(numeros, "ESTATÍSTICAS");

                        // Análise adicional usando for-each
                        int acimaMedia = 0;
                        int abaixoMedia = 0;
                        double media = calcularMedia(numeros);

                        for (double num : numeros) {
                            if (num > media) acimaMedia++;
                            else if (num < media) abaixoMedia++;
                        }

                        System.out.println("Acima da média: " + acimaMedia);
                        System.out.println("Abaixo da média: " + abaixoMedia);
                    }
                    break;

                case 4:
                    numeros.clear();
                    System.out.println("Lista limpa!");
                    break;

                case 5:
                    executando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
```

## Dicas para Resolver as Questões:

### **Para Listas e Loops:**

- Use `ArrayList` para flexibilidade
- `for-each` para percorrer listas: `for (Tipo item : lista)`
- `while` para menus e validações
- `Scanner` para entrada de dados
- `Collections.sort()` para ordenação
- `Random` para números aleatórios

### **Para Funções:**

1. **Modularização**: Cada função deve ter uma única responsabilidade
2. **Parâmetros Claros**: Use nomes descritivos nos parâmetros
3. **Retorno Adequado**: Escolha o tipo de retorno apropriado
4. **Tratamento de Erros**: Valide entradas e trate exceções
5. **Documentação**: Comente suas funções com JavaDoc

### **Padrões Úteis:**

```java
// Estrutura básica de menu com while
boolean executando = true;
while(executando){
        System.out.

println("1. Opção 1");
    System.out.

println("2. Opção 2");
    System.out.

println("3. Sair");

int opcao = scanner.nextInt();
    
    switch(opcao){
        case 1:
        // executar opção 1
        break;
        case 2:
        // executar opção 2
        break;
        case 3:
executando =false;
        break;
default:
        System.out.

println("Opção inválida!");
    }
            }

// Estrutura básica de função
public static TipoRetorno nomeFuncao(TipoParametro parametro) {
    // implementação
    return valorRetorno;
}
```

## Tópicos Abordados nas Questões:

| Categoria                | Tópicos                                     |
|--------------------------|---------------------------------------------|
| **Estruturas de Dados**  | ArrayList, Arrays, Listas multidimensionais |
| **Controle de Fluxo**    | for, while, switch, if-else                 |
| **Funções**              | Parâmetros, retorno, modularização          |
| **Manipulação de Dados** | Strings, números, booleanos                 |
| **Algoritmos**           | Ordenação, busca, cálculos matemáticos      |
| **Aplicações Práticas**  | Sistemas, jogos, calculadoras               |
