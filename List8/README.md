# Sistema de Playlist Musical em Java

## Descrição do Projeto

Este projeto consiste na implementação de um Tipo Abstrato de Dados (TAD) de Playlist Musical utilizando a linguagem Java e estrutura de dados sequencial baseada em arrays.

O sistema simula o gerenciamento de uma playlist de músicas, onde cada música é representada por um ID numérico inteiro (`int`).

A implementação permite realizar operações de inserção, remoção, busca, consulta e manipulação da playlist de forma organizada, mantendo sempre a lista compactada após exclusões através da técnica de deslocamento de elementos (shift).

---

## Estrutura do Projeto

O sistema foi dividido em três partes principais:

### PlaylistTAD.java
Interface responsável por definir os métodos obrigatórios do TAD.

### PlaylistMusical.java
Classe concreta responsável pela implementação da lógica de funcionamento da playlist.

### Main.java
Classe principal utilizada para testes e interação com o usuário através de menu no console.

---

## Estrutura de Dados Utilizada

Foi utilizado um array do tipo inteiro para armazenar os IDs das músicas:

```java
private int[] musicas;

Além disso, são utilizados atributos auxiliares para controle:

private int quantidade;
private int capacidadeMaxima;

Onde:

quantidade: controla quantas músicas existem atualmente.
capacidadeMaxima: define o tamanho máximo da playlist.

Funcionalidades Implementadas

O sistema possui as seguintes operações:

Adicionar música ao final da playlist;
Adicionar música em posição específica;
Remover música pelo ID;
Remover música pela posição;
Buscar música por posição;
Buscar posição de uma música;
Verificar existência de música;
Mostrar quantidade de músicas;
Exibir playlist completa;
Limpar playlist;
Verificar se playlist está vazia;
Verificar se playlist está cheia.

Funcionamento do Shift

Sempre que uma música é removida, os elementos posteriores são deslocados uma posição à esquerda para manter a lista compactada.

Exemplo:

Antes da remoção:

[101, 202, 303, 404]

Removendo posição 1:

[101, 303, 404]

Logs de Execução / Testes Realizados
Teste 1 – Adicionar músicas

Entrada:
Adicionar ID 101
Adicionar ID 202
Adicionar ID 303

Saída:
Playlist:
Posição 0 -> Música ID: 101
Posição 1 -> Música ID: 202
Posição 2 -> Música ID: 303

Teste 2 – Inserir música em posição específica

Entrada:
Adicionar música 999 na posição 1

Saída:
Playlist:
Posição 0 -> Música ID: 101
Posição 1 -> Música ID: 999
Posição 2 -> Música ID: 202
Posição 3 -> Música ID: 303

Teste 3 – Remover música por ID

Entrada:
Remover música ID 202

Saída:
Música removida com sucesso.

Playlist:
Posição 0 -> Música ID: 101
Posição 1 -> Música ID: 999
Posição 2 -> Música ID: 303

Teste 4 – Buscar música por posição

Entrada:
Buscar posição 1

Saída:
Música encontrada: 999

Teste 5 – Buscar posição de música

Entrada:
Buscar ID 303

Saída:
Posição encontrada: 2

Teste 6 – Verificar existência de música

Entrada:
Verificar ID 101

Saída:
Música está na playlist.

Teste 7 – Quantidade de músicas

Entrada:
Consultar quantidade

Saída:
Quantidade de músicas: 3


Teste 8 – Limpar playlist

Entrada:
Limpar playlist

Saída:
Playlist limpa com sucesso.

Conclusão

O sistema implementa corretamente um TAD de Playlist Musical utilizando arrays, aplicando conceitos fundamentais de Estrutura de Dados como:

Manipulação sequencial de listas;
Inserção e remoção com deslocamento;
Busca sequencial;
Controle de capacidade e estado da estrutura.
