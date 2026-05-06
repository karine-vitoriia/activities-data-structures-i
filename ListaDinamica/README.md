# MyLinkedList - Estrutura de Dados


## Descrição
Implementação de uma lista simplesmente encadeada em Java, utilizando generics (`<T>`).  
A estrutura permite armazenar elementos de forma dinâmica, com inserções e remoções eficientes, especialmente nas extremidades da lista.

---

## Estrutura do Projeto

src/dev/karinevitoria/datastructures/list/
- MyList.java → Interface com definição das operações
- MyLinkedList.java → Implementação da lista encadeada

src/dev/karinevitoria/datastructures/list/tests/
- MyLinkedListTests.java → Classe de testes (método main)

---

## Funcionalidades

### 🔹 Inserção
- **addFirst(T element)**  
  Insere um elemento no início da lista. Atualiza o `head` e, se necessário, o `tail`.  
  Complexidade: O(1)

- **addLast(T element)**  
  Insere no final da lista utilizando a referência `tail`, evitando percorrer a lista.  
  Complexidade: O(1)

- **insertAt(int i, T element)**  
  Insere em uma posição específica.  
  Trata casos especiais (início e fim) e, no caso geral, percorre a lista.  
  Complexidade: O(n)

- **addSorted(T element)**  
  Insere o elemento mantendo a lista ordenada (ordem crescente).  
  Utiliza comparação (`Comparable`) para encontrar a posição correta.  
  Complexidade: O(n)

---

### 🔹 Remoção
- **removeFirst()**  
  Remove o primeiro elemento da lista e atualiza o `head`.  
  Complexidade: O(1)

- **removeLast()**  
  Remove o último elemento. Necessita percorrer até o penúltimo nó.  
  Complexidade: O(n)

- **removeAt(int i)**  
  Remove um elemento em posição específica.  
  Utiliza delegação para `removeFirst` e `removeLast` nos casos extremos.  
  Complexidade: O(n)

- **remove(T element)**  
  Remove a primeira ocorrência do elemento.  
  Utiliza busca linear (`find`) e depois remove pela posição.  
  Complexidade: O(n)

---

### 🔹 Consulta e Controle
- **get(int i)**  
  Retorna o elemento em uma posição específica.  
  Complexidade: O(n)

- **set(int i, T element)**  
  Atualiza o valor de um elemento em determinada posição.

- **find(T element)**  
  Retorna o índice da primeira ocorrência do elemento.  
  Retorna -1 caso não exista.  
  Complexidade: O(n)

- **size()**  
  Retorna a quantidade de elementos armazenados.  
  Complexidade: O(1)

- **clear()**  
  Remove todos os elementos da lista, reinicializando a estrutura.

---

## Execução

Compilar: javac src/dev/karinevitoria/datastructures/list/tests/MyLinkedListTests.java


---

## Observações
- A lista utiliza uma classe interna `Node` para representar cada elemento.
- São mantidas referências para o início (`head`) e fim (`tail`) da lista.
- Todos os métodos definidos na interface `MyList<T>` foram implementados.
- A classe de testes realiza chamadas diretas no método `main` para validação das operações.

---

## Status
✔ Implementação completa  
✔ Testes realizados  
✔ Pronto para entrega  
