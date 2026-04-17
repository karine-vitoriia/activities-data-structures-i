# Sistema BookList em Java

## Descrição

Este projeto implementa um TAD de lista de livros utilizando arrays.

Cada livro é representado por um ID inteiro. A lista permite inserção, remoção, busca e controle de estado.

A estrutura mantém os dados compactados através de deslocamento (shift).

---

## Estrutura

- BookListTAD.java → Interface
- BookList.java → Implementação
- Main.java → Testes com menu

---

## Estrutura de Dados

```java
private int[] livros;
private int quantidade;
private int capacidadeMaxima;


Funcionalidades
Adicionar livro
Inserir em posição
Remover por ID
Remover por posição
Buscar livro por posição
Buscar posição de livro
Verificar existência
Quantidade de livros
Limpar lista
Exibir lista
Logs de Execução
Adição

Entrada:
ID 101, 202, 303

Saída:
Posição 0 -> Livro ID: 101
Posição 1 -> Livro ID: 202
Posição 2 -> Livro ID: 303

Inserção

Entrada:
ID 999 na posição 1

Saída:
[101, 999, 202, 303]

Remoção por ID

Entrada:
Remover 202

Saída:
[101, 999, 303]

Busca por posição

Entrada:
posição 1

Saída:
999

Busca por ID

Entrada:
ID 303

Saída:
posição 2

Limpeza

Entrada:
limpar

Saída:
Lista vazia

Conclusão

O sistema aplica conceitos de:

Estrutura sequencial
Busca linear O(n)
Acesso direto O(1)
Shift em remoção/inserção
