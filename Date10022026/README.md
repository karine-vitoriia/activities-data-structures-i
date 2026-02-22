Exercícios – Lógica e Algoritmos (Java)

Este repositório contém a resolução de 3 exercícios propostos na disciplina de Estrutura de Dados I.
Os algoritmos foram desenvolvidos em Java, utilizando estruturas básicas da linguagem como vetores, laços de repetição, condicionais e entrada de dados com Scanner.

Organização

Pacote utilizado:
package Date10022026;

Arquivos:
OperacoesNotas.java
CaixaEletronico.java
CriteriosSenhas.java

----------- Exercício 1 – Operações com Notas -----------

Foi utilizado um vetor fixo com 10 notas.

O programa:
Calcula a média das notas
Conta quantos alunos ficaram acima da média
Encontra a maior nota do vetor (sem usar ordenação pronta)

Métodos e estruturas utilizadas:

Laço for
Estrutura if
Variáveis acumuladoras
Percorrimento manual do vetor

----------- Exercício 2 – Caixa Eletrônico -----------

Simula um caixa eletrônico que entrega o menor número possível de notas.

O programa:
Lê um valor inteiro múltiplo de 10
Valida se o valor é correto
Calcula a quantidade de notas de R$50, R$20 e R$10

Recursos utilizados:
Scanner para entrada de dados
Operador de divisão /
Operador de resto %
Estrutura if para validação

----------- Exercício 3 – Validador de Senha -----------

Valida se uma senha atende aos critérios mínimos:
Pelo menos 8 caracteres (sem contar espaços)
Pelo menos 1 caractere especial
O programa percorre a string digitada caractere por caractere.

Métodos pesquisados e utilizados:
senha.length() → para obter o tamanho da string
senha.charAt(i) → para acessar cada caractere da senha
Character.isLetterOrDigit(c) → para verificar se o caractere é letra ou número

O método Character.isLetterOrDigit(c) foi utilizado após pesquisa para identificar quando um caractere não é letra nem número, permitindo assim detectar caracteres especiais.

Como executar

Compilar:
javac Date10022026/*.java

Executar:
java Date10022026.OperacoesNotas
java Date10022026.CaixaEletronico
java Date10022026.CriteriosSenhas

Tecnologias usadas
Java
Estruturas de repetição (for)
Condicionais (if)
Vetores
Manipulação de Strings
Classe Scanner

Att. Karine
