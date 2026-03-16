# Lista 5 – TAD Listas (Estrutura de Dados)

Disciplina: Estrutura de Dados I  
Curso: Análise e Desenvolvimento de Sistemas  
Instituição: IFTM – Campus Patrocínio  

## Objetivo da atividade

Esta atividade teve como objetivo praticar operações básicas em listas utilizando arrays em Java.  
Como arrays possuem tamanho fixo, os exercícios simulam comportamentos comuns de estruturas de dados como inserção, remoção, redimensionamento e fusão de listas.

Cada questão aborda um conceito importante da manipulação de dados em estruturas sequenciais.

---

# Questão 1 – Inserção em posição específica

### O que a questão pedia

O exercício solicitava criar um algoritmo que realizasse a inserção de um novo valor em uma posição específica de um array.

Para isso, era necessário deslocar os elementos existentes uma posição para a direita para abrir espaço para o novo valor.

Essa operação demonstra o custo de inserção em estruturas sequenciais, que possui complexidade O(n).

### Como foi resolvido

Primeiro foi criado um vetor com alguns valores já preenchidos: 10 20 30 40 50

Depois foi definido:

- o elemento a ser inserido
- a posição onde ele deveria entrar

Para abrir espaço, foi utilizado um **laço for que percorre o vetor de trás para frente**, deslocando os valores uma posição à direita.

Exemplo da lógica:

1. Percorrer o vetor do final até a posição desejada
2. Mover cada elemento uma posição para frente
3. Inserir o novo valor na posição desejada

Resultado final do vetor após a inserção: 10 15 20 30 40 50

---

# Questão 2 – Redimensionamento dinâmico de vetor

### O que a questão pedia

O objetivo era simular um vetor de tamanho variável.

Como arrays em Java possuem tamanho fixo, o programa deveria:

1. Detectar quando o vetor está cheio
2. Criar um novo vetor com o **dobro da capacidade**
3. Copiar os elementos do vetor antigo para o novo
4. Continuar inserindo valores normalmente

### Como foi resolvido

O programa começa com um vetor de capacidade inicial igual a 4.

O usuário informa quantos valores deseja inserir.

Durante a inserção, o algoritmo verifica se quantidadeElementos == tamanho do vetor

Se isso acontecer:

1. Um novo vetor com o **dobro da capacidade** é criado
2. Os valores do vetor antigo são copiados
3. O programa continua a inserção normalmente

Isso simula o funcionamento de estruturas como **ArrayList**.

---

# Questão 3 – Remoção de elemento

### O que a questão pedia

O exercício solicitava criar um algoritmo que removesse um valor de um array.

Depois de remover o valor, os elementos à direita deveriam ser deslocados para a esquerda para evitar espaços vazios.

### Como foi resolvido

O algoritmo funciona em três etapas:

1. O usuário informa os valores do vetor
2. O programa procura o valor que deve ser removido
3. Se o valor for encontrado, ocorre o deslocamento dos elementos

O deslocamento é feito utilizando um **laço for** que move cada elemento da direita uma posição para a esquerda.

Exemplo:
Vetor original: 10 20 30 40 50
Removendo o valor **30**
Resultado: 10 20 40 50

---

# Questão 4 – Remover elementos duplicados

### O que a questão pedia

O exercício solicitava identificar valores duplicados em um vetor e removê-los, mantendo apenas uma ocorrência de cada valor.

Após remover a duplicata, o vetor deveria ser reorganizado para não deixar espaços vazios.

### Como foi resolvido

Foi utilizado um algoritmo com **dois laços de repetição**:

- O primeiro percorre cada elemento do vetor
- O segundo compara esse elemento com os demais

Quando dois valores iguais são encontrados:

1. O elemento duplicado é removido
2. Os valores seguintes são deslocados para a esquerda
3. A quantidade de elementos é reduzida

Exemplo:
Entrada: 10 20 20 30 40 40
Saída: 10 20 30 40

---

# Questão 5 – Fusão de arrays ordenados

### O que a questão pedia

O exercício solicitava a fusão de dois arrays **já ordenados** em um terceiro array, mantendo a ordenação.

O algoritmo deveria percorrer os dois arrays ao mesmo tempo, comparando os elementos.

Não era permitido apenas copiar e ordenar depois.

### Como foi resolvido

Foram utilizados três índices:

- um para o primeiro array
- um para o segundo array
- um para o array de resultado

O algoritmo funciona da seguinte forma:

1. Comparar os dois valores atuais
2. Inserir o menor no vetor resultado
3. Avançar o índice correspondente
4. Repetir até um dos vetores terminar
5. Copiar os elementos restantes

Exemplo:
Array A: 1 3 5
Array B: 2 4 6
Resultado: 1 2 3 4 5 6
