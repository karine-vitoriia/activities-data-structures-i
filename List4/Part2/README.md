# Parte 2 — Novo Algoritmo e Teste de Mesa

## Descrição da Atividade
Nesta etapa foi desenvolvido um novo algoritmo chamado `inverter_lista(vetor)`, responsável por inverter os elementos de um vetor de inteiros utilizando a estratégia *in-place*, ou seja, sem a criação de um vetor auxiliar.

Antes da implementação em código, foi realizado um teste de mesa manuscrito para validar o funcionamento lógico do algoritmo.

---

## Objetivos
- Desenvolver raciocínio algorítmico
- Validar algoritmos através de teste de mesa
- Implementar manipulação de vetores
- Aplicar estratégia in-place (uso mínimo de memória)

---

## Funcionamento do Algoritmo
O algoritmo utiliza dois índices:

- `inicio` → aponta para o primeiro elemento
- `fim` → aponta para o último elemento

Os valores são trocados enquanto `inicio < fim`, avançando um índice para frente e outro para trás até chegar ao centro do vetor.

---

## Recursos Utilizados
- Linguagem Java
- Vetores (arrays)
- Estrutura de repetição `while`
- Variável temporária para troca de valores (swap)

---

## Instruções de Execução

1. Compile o arquivo:

```bash
javac InverterLista.java

Execute o programa:

java InverterLista

O programa exibirá o vetor antes e depois da inversão.

Exemplo de Entrada e Saída

Entrada:

[10, 20, 30, 40, 50]

Saída:

[50, 40, 30, 20, 10]
