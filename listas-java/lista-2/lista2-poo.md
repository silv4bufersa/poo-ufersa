# Lista POO - Java

## Antes de Começar

> - As questões devem ser enviadas no formato especificado a seguir.
> - Para envio, compacte o projeto com as questões desenvolvidas e envie no SIGAA em formato **.zip** ou **.rar**, apenas.

## Formato das Respostas

Exemplos de arquivos no projeto: A pasta deve contar um arquivo Main.java e para cada questão um arquivo .java diferente.

Arquivo **Questao1.java**

```java
// Questao1.java
public class Questao1 {
    public static boolean verificaParidade(int n1) {
        return (n1 % 2) == 0;
    }

    public static boolean verificaPositivo(int n1) {
        return n1 > 0; // true ou false
    }

    public static boolean verificaNegativo(int n1) {
        return n1 < 0; // true ou false
    }

    public void run() {
        System.out.println("Para 10\n");

        System.out.println("Paridade: " + verificaParidade(10));
        System.out.println("Positivo: " + verificaPositivo(10));
        System.out.println("Negativo: " + verificaNegativo(10));

        System.out.println("\nPara 11\n");

        System.out.println("Paridade: " + verificaParidade(11));
        System.out.println("Positivo: " + verificaPositivo(11));
        System.out.println("Negativo: " + verificaNegativo(11));

        System.out.println("\nPara -1\n");

        System.out.println("Paridade: " + verificaParidade(-1));
        System.out.println("Positivo: " + verificaPositivo(-1));
        System.out.println("Negativo: " + verificaNegativo(-1));
    }
}
```

Arquivo **Main.java**

```java
// Main.java
public class Main {
    public static void main(String[] args) {
        Questao1 q1 = new Questao1();
        q1.run();
    }
}
```

## Questões

### **Nível 3: Estrutura de Seleção**

1. Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:

    1 – Adição

    2 – Subtração

    3 – Multiplicação

    4 – Divisão

2. Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja realizar:

    1 – Verificar se um dos números lidos é ou não múltiplo do outro

    2 – Verificar se os dois números lidos são pares

    3 – Verificar se a média dos dois números é maior ou igual a 7.

    4 – Sair
3. Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu peso ideal, utilizando as seguintes fórmulas: (h = altura)

    - Para homens: (72.7*h) - 58
    - Para mulheres: (62.1 *h) - 44.

### **Nível 4: Estruturas de Repetição**

1. Escreva um programa que exiba os números de 1 a 100 na tela em ordem decrescente.

2. Escreva um programa que leia:

    - a quantidade de números que deverá processar;
    - os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu fatorial.

    Lembrete: O fatorial de um número N é dado pela fórmula: N! = 1 *2* 3 *4* 5 *...* N

3. Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.

4. Faça um programa que exiba os números de 1 até 2000.

5. Faça um programa para imprimir uma tabuada.

6. Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou ímpar. Exiba ao final a soma total dos números pares lidos e também a soma dos números ímpares lidos. Suporemos que o número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o fim dos dados.

7. Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros positivos ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.

8. Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O número de alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na prova em questão.

9. Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior. Suporemos que o número de elementos deste conjunto não é conhecido, e que um número negativo será utilizado para sinalizar o fim dos dados.

10. Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de 10".

11. Faça um programa que leia 10 valores inteiros e positivos e:

    - Encontre o maior valor
    - Encontre o menor valor
    - Calcule a média dos números lidos

12. A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. Faça um programa que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?" ou o índice for 0,0.

### **Nível 5: Vetores e Matrizes**

1. Dada uma sequência de n números (vetor de inteiros), imprimi-la na ordem inversa que foi realizada a leitura.

2. Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses vetores. Ou seja, realizar a soma de todos dos resultados da multiplicação de x[i] por y[i].

3. Considere um vetor de 10 números inteiros positivos maiores que zero e um único número inteiro, também positivo e maior que zero. Faça um programa para:

    a. ler pelo teclado o vetor;

    b. ler pelo teclado o número X;

    c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.

4. Uma agência de publicidade pediu à agência de modelos Luz & Beleza para encontrar uma modelo que tenha idade entre 18 e 20 anos para participar de uma campanha publicitária milionária de produtos de beleza. Foram inscritas 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações foram armazenadas em 2 vetores distintos. Faça um programa para imprima o vetor que contém os nomes das candidatas aptas a concorrer a uma vaga para a campanha milionária.

5. Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes que V1 e V2 possuem valores idênticos nas mesmas posições.

6. Fazer um programa que sorteie um número de 0 a 100 e que permita que o usuário (sem conhecer o número sorteado) tente acertar. Caso não acerte, o programa deve imprimir uma mensagem informando se o número sorteado é maior ou menor que a tentativa feita. Ao acertar o número, o programa deve imprimir a quantidade de tentativas feitas.

7. Escreva um programa que solicite dois caracteres de A a Z ao usuário e imprima o número de caracteres existente entre eles. Assuma que o usuário digite os 2 caracteres em ordem alfabética. Caso não o estejam, emitir mensagem de erro.

    ```batch
    Exemplo: Digite 2 caracteres.

    1º Caractere: j
    2º Caractere: t

    Resultado: j t O numero de caracteres entre eles é: 9
    ```

### **Nível 6: Métodos**

> Todas as opções dessa sessão devem ser feitas usando funções.

1. Escreva um programa que calcule e retorne o salário atualizado através do método REAJUSTE. O método deve receber o valor do salário e o índice de reajuste.

2. Escreva um programa que verifique se um número é par ou ímpar através de um método chamado VERIFICA. O método deverá receber um número inteiro (n) e deverá retornar a mensagem "PAR" ou "ÍMPAR".

3. Escreva um programa que deverá ter as seguintes opções:

    ```java
    Opções Disponíveis

    1 - Carregar Vetor
    2 - Listar Vetor
    3 - Exibir apenas os números pares do vetor
    4 - Exibir apenas os números ímpares do vetor
    5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
    6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
    0 - Sair
    ```

    Deverá ser implementado um método para realizar cada uma das opções de 1 a 6.

4. Escreva um programa que calcule e retorne o tipo do triângulo quanto a sua classificação por lados, de acordo com a descrição a seguir:

    Classificação por Lados

    - Equilátero: Possui todos os três lados com a mesma medida.
    - Isósceles: Tem dois lados com a mesma medida e um lado com medida diferente.
    - Escaleno: Apresenta todos os três lados com medidas diferentes.

    O programa deve ter três métodos, um  pra cada tipo, cada método deve verificar as condições e retornar `true` ou `false`. Esses métodos devem ser chamados passando os ângulos.
