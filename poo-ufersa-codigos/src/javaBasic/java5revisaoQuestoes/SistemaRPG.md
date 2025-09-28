# Novas Funções para Melhorar o Sistema RPG

## Funções de Relatórios e Estatísticas

```java
// Exibe estatísticas gerais do time: total de niveis, media de niveis, personagem mais forte e mais fraco
public static void mostrarEstatisticasGerais(List<String> nomes, List<Integer> niveis, List<Integer> experiencias)

// Mostra ranking ordenado por nivel (do maior para o menor)
public static void rankingPorNivel(List<String> nomes, List<Integer> niveis, List<Integer> experiencias)

// Mostra ranking ordenado por experiencia atual (da maior para a menor)
public static void rankingPorExperiencia(List<String> nomes, List<Integer> niveis, List<Integer> experiencias)

// Calcula e exibe a media de niveis de todos os personagens
public static void mediaNiveis(List<Integer> niveis)

// Calcula e exibe a soma total de experiencia de todos os personagens
public static void totalExperienciaTime(List<Integer> experiencias)
```

## Funções de Gerenciamento de Personagens

```java
// Permite adicionar um novo personagem ao sistema com nome, nivel e experiencia iniciais
public static void adicionarNovoPersonagem(List<String> nomes, List<Integer> niveis, List<Integer> experiencias, Scanner scanner)

// Remove um personagem escolhido pelo usuario da lista
public static void removerPersonagem(List<String> nomes, List<Integer> niveis, List<Integer> experiencias, Scanner scanner)

// Altera o nome de um personagem existente
public static void renomearPersonagem(List<String> nomes, Scanner scanner)

// Reseta um personagem para nivel 1 e experiencia 0, mantendo o nome
public static void resetarPersonagem(List<String> nomes, List<Integer> niveis, List<Integer> experiencias, Scanner scanner)
```

## Funções de Batalha e Recompensas

```java
// Simula uma batalha aleatoria que concede XP aleatorio para um personagem aleatorio
public static void batalhaAleatoria(List<String> nomes, List<Integer> niveis, List<Integer> experiencias)

// Distribui XP automaticamente para todos os personagens (valor fixo ou aleatorio)
public static void distribuirXPAutomatico(List<Integer> experiencias)

// Oferece uma missao diaria com recompensa de XP para um personagem especifico
public static void missaoDiaria(List<String> nomes, List<Integer> niveis, List<Integer> experiencias)

// Concede recompensa de XP baseada no nivel atual de cada personagem
public static void recompensaPorNivel(List<Integer> niveis, List<Integer> experiencias)
```

## Funções de Desafios e Metas

```java
// Permite definir uma meta de nivel ou XP para um personagem especifico
public static void definirMetaPersonagem(List<String> nomes, List<Integer> niveis, List<Integer> experiencias, Scanner scanner)

// Verifica e exibe conquistas alcançadas (ex: primeiro personagem no nivel 5, etc)
public static void verificarConquistas(List<String> nomes, List<Integer> niveis, List<Integer> experiencias)

// Oferece um desafio semanal com recompensas especiais
public static void desafioSemanal(List<String> nomes, List<Integer> niveis, List<Integer> experiencias)

// Adiciona bonus de XP baseado no tempo desde a ultima evolucao
public static void bonusPorTempo(List<Integer> experiencias)
```

## Funções de Utilidade

```java
// Busca um personagem pelo nome (busca parcial) e mostra seus dados
public static void buscarPersonagem(List<String> nomes, List<Integer> niveis, List<Integer> experiencias, Scanner scanner)

// Filtra personagens por faixa de nivel (ex: mostrar apenas niveis 3-5)
public static void filtrarPorNivel(List<String> nomes, List<Integer> niveis, List<Integer> experiencias, Scanner scanner)

// Ordena personagens por diferentes criterios: nome, nivel, experiencia
public static void ordenarPersonagens(List<String> nomes, List<Integer> niveis, List<Integer> experiencias, int criterio)

// Limpa todos os dados, reiniciando o sistema completamente
public static void limparDados(List<String> nomes, List<Integer> niveis, List<Integer> experiencias)
```

## Funções de Análise Avançada

```java
// Mostra o progresso medio de XP por nivel para analise de equilibrio
public static void progressoMedioPorNivel(List<Integer> niveis, List<Integer> experiencias)

// Preve quanto tempo/XP falta para cada personagem evoluir
public static void previsaoEvolucao(List<String> nomes, List<Integer> niveis, List<Integer> experiencias)

// Compara dois personagens lado a lado mostrando diferencas
public static void compararPersonagens(List<String> nomes, List<Integer> niveis, List<Integer> experiencias, Scanner scanner)

// Mostra historico de progresso dos ultimos dias/acoes
public static void historicoProgresso(List<Integer> niveis, List<Integer> experiencias)
```
