# Parte 3 — Análise de Complexidade (Notação Big-O)

## Descrição da Atividade
Esta etapa consiste na análise teórica do algoritmo de inversão de vetor desenvolvido na Parte 2, utilizando a Notação Big-O para avaliar sua eficiência.

A análise considera o crescimento do número de operações conforme aumenta o tamanho da entrada (n).

---

## Objetivos
- Compreender análise de algoritmos
- Aplicar Notação Big-O
- Avaliar desempenho computacional
- Relacionar teoria e implementação prática

---

## Conceitos Utilizados

### Notação Big-O
A Notação Big-O descreve como o tempo de execução de um algoritmo cresce em relação ao tamanho da entrada.

Principais classificações:

- **O(1)** → tempo constante
- **O(n)** → crescimento linear
- **O(n²)** → crescimento quadrático

---

## Análise do Algoritmo

- O algoritmo realiza aproximadamente `n/2` trocas.
- Apenas um laço é utilizado.
- Não existem laços aninhados.

Portanto:

- Complexidade temporal: **O(n)**
- Complexidade espacial: **O(1)** (não utiliza vetor auxiliar)

---

## Conclusão
O algoritmo é considerado eficiente, pois o número de operações cresce linearmente com o tamanho do vetor, mantendo baixo consumo de memória e bom desempenho mesmo para grandes volumes de dados.
