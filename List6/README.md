# TAD Lista Sequencial - MyArrayList (Java)

## 📌 Descrição

Este projeto implementa um **Tipo Abstrato de Dados (TAD) de Lista Sequencial** em Java utilizando arrays e memória estática.

A lista armazena números inteiros e permite operações de inserção, remoção, busca e atualização de elementos.  
Quando necessário, os elementos são deslocados (shift) dentro do array para manter a organização da lista.

---

## 📂 Estrutura do Projeto

O projeto possui três classes principais:

### 🔹 Main.java
Responsável pela execução do programa.

Funções:
- Exibe um menu interativo.
- Recebe dados do usuário.
- Chama os métodos da lista.
- Demonstra o funcionamento de todas as operações.

---

### 🔹 MyArrayList.java
Classe principal que implementa o TAD.

Responsável por:
- Armazenar os elementos em um array.
- Controlar a quantidade de itens.
- Executar inserções, remoções e buscas.
- Realizar o deslocamento (shift) dos elementos.

Atributos principais:

- `elementos[]` → array onde os dados são guardados
- `quantidade` → número atual de elementos
- `capacidade` → tamanho máximo da lista

---

### 🔹 MyArrayListTAD.java
Interface do TAD.

Define os métodos obrigatórios da lista, garantindo organização e separação entre definição e implementação.

---

## ⚙️ Funcionamento Geral

A lista funciona sobre um **array fixo**.

Quando ocorre:

- inserção no início ou meio → elementos são deslocados para direita
- remoção no início ou meio → elementos são deslocados para esquerda

Esse processo é chamado de **SHIFT**.

---

## 🔄 Resumo dos Algoritmos (Métodos)

### ✅ Inserção

**addLast(valor)**
- Insere no final da lista.
- Complexidade: O(1)

Exemplo:
[10 20]
addLast(30)
[10 20 30]


---

**addFirst(valor)**
- Desloca todos os elementos para direita.
- Insere na posição 0.
- Complexidade: O(n)

[10 20 30]
addFirst(5)
[5 10 20 30]


---

**insertAt(indice, valor)**
- Abre espaço deslocando elementos.
- Insere na posição informada.

[10 20 30]
insertAt(1,15)
[10 15 20 30]


---

**addSorted(valor)**
- Insere mantendo a lista em ordem crescente.
- Move elementos maiores para frente.

[10 20 40]
addSorted(25)
[10 20 25 40]


---

### ❌ Remoção

**removeLast()**
- Remove o último elemento.
- Apenas diminui a quantidade.

[10 20 30]
removeLast()
[10 20]


---

**removeFirst()**
- Remove o primeiro elemento.
- Desloca todos para esquerda.

[10 20 30]
removeFirst()
[20 30]


---

**removeAt(indice)**
- Remove posição específica.
- Realiza shift para esquerda.

[10 20 30]
removeAt(1)
[10 30]


---

**remove(valor)**
- Procura o elemento.
- Remove usando removeAt().

---

### 🔎 Busca

**find(valor)**
- Procura o valor na lista.
- Retorna índice ou -1.

find(20) → 1


---

**get(indice)**
- Retorna elemento da posição informada.

---

### ✏️ Atualização

**set(indice, valor)**
- Substitui o valor existente.
[10 20 30]
set(1,99)
[10 99 30]


---

### 📊 Controle

**isEmpty()**
- Verifica se a lista está vazia.

**isFull()**
- Verifica se atingiu a capacidade máxima.

**quantidade()**
- Retorna número de elementos armazenados.

**display()**
- Mostra o estado atual da lista.

---

## 🧪 Logs de Execução (Exemplos)
Capacidade inicial: 5

addLast 10
Lista atual: [10]

addFirst 5
Lista atual: [5 10]

insertAt 1 7
Lista atual: [5 7 10]

remove 7
Item 7 removido com sucesso
Lista atual: [5 10]

find 10
Encontrado em: 1


---

## ⏱️ Complexidade das Operações

| Operação | Complexidade |
|---|---|
| addLast | O(1) |
| addFirst | O(n) |
| insertAt | O(n) |
| removeLast | O(1) |
| removeFirst | O(n) |
| removeAt | O(n) |
| find | O(n) |
| get | O(1) |
| set | O(1) |

---

## 🎯 Conclusão

O projeto demonstra o funcionamento interno de uma lista sequencial baseada em array, evidenciando como o deslocamento de elementos influencia diretamente na complexidade das operações.
