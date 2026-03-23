# MyArrayList - Esqueleto de Lista Sequencial (TAD)

Este repositório contém o **esqueleto funcional** de uma implementação do Tipo Abstrato de Dados (TAD) Lista Sequencial em Java. O projeto foi desenvolvido como uma atividade acadêmica para exercitar a lógica de manipulação de arrays e deslocamento de memória.

## 📋 Descrição do Projeto

O objetivo principal é demonstrar a estrutura básica de uma lista baseada em array fixo, focando na organização sequencial dos elementos. O código serve como base para entender como os dados são "empurrados" ou "puxados" na memória durante as operações de inserção e remoção.

## 🛠️ Estrutura do Esqueleto

A classe `MyArrayList` fornece a base para as seguintes operações:

* **Inserção com Shift (Direita):** Métodos `addFirst`, `addLast` e `insertAt`.
* **Remoção com Shift (Esquerda):** Métodos `removeFirst`, `removeLast`, `removeAt` e `remove`.
* **Busca e Acesso:** Métodos `find`, `get` e `set`.
* **Gerenciamento de Estado:** Verificação de lista cheia (`isFull`), vazia (`isEmpty`) e contagem de elementos (`count`).

## 🚀 Como Testar

O projeto inclui uma classe `Main` que funciona como um driver de teste. Ela instancia o esqueleto da lista e executa as operações básicas, exibindo o estado do array no console através do método `display()`.

---
*Nota: Este é um projeto de cunho educacional para estudo de Estrutura de Dados.*
