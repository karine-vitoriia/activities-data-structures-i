# Atividade 8 – Implementação e Validação de TAD Fila

## Sobre o Projeto

Este projeto foi desenvolvido para a disciplina de Estrutura de Dados e tem como objetivo implementar o Tipo Abstrato de Dados (TAD) Fila utilizando duas abordagens diferentes:

* Fila Estática (Array Circular)
* Fila Dinâmica (Lista Encadeada)

As implementações seguem o comportamento FIFO (First In, First Out), onde o primeiro elemento inserido é o primeiro a ser removido.

---

## Estrutura do Projeto

```text
com.KarineVSRodrigues.queue

├── application
│   └── Main.java
│
├── interfaces
│   └── Queue.java
│
├── exceptions
│   ├── OverflowException.java
│   └── UnderflowException.java
│
├── staticqueue
│   └── StaticQueue.java
│
├── linkedqueue
│   ├── Node.java
│   └── LinkedQueue.java
│
└── tests
    └── QueueTests.java
```

---

## Operações Implementadas

As duas estruturas implementam os seguintes métodos:

* `push()` → Insere um elemento na fila.
* `pop()` → Remove o primeiro elemento da fila.
* `peek()` → Retorna o primeiro elemento sem removê-lo.
* `back()` → Retorna o último elemento inserido.
* `size()` → Retorna a quantidade de elementos.
* `isEmpty()` → Verifica se a fila está vazia.
* `clear()` → Remove todos os elementos da fila.

---

## Tratamento de Exceções

Foram criadas exceções personalizadas para tratar situações especiais:

* `OverflowException` → Tentativa de inserção em uma fila estática cheia.
* `UnderflowException` → Tentativa de remoção ou acesso em uma fila vazia.

---

## Testes Realizados

Foram realizados testes para validar:

* Inserção em fila vazia;
* Remoção de elementos;
* Funcionamento FIFO;
* Consulta do primeiro e último elemento;
* Limpeza da fila;
* Verificação de fila vazia;
* Overflow na fila estática;
* Underflow nas duas implementações.

---

## Comparativo das Implementações

| Característica    | Fila Estática  | Fila Dinâmica   |
| ----------------- | -------------- | --------------- |
| Estrutura         | Array Circular | Lista Encadeada |
| Inserção          | O(1)           | O(1)            |
| Remoção           | O(1)           | O(1)            |
| Limite de tamanho | Sim            | Não             |
| Overflow          | Sim            | Não             |
| Uso de memória    | Fixo           | Variável        |

---

## Conclusão

A implementação permitiu compreender o funcionamento interno das filas e as diferenças entre as abordagens estática e dinâmica. Enquanto a fila estática possui limite de capacidade e utiliza um array circular para reaproveitamento de espaço, a fila dinâmica oferece maior flexibilidade por utilizar alocação dinâmica de memória através de nós encadeados.
