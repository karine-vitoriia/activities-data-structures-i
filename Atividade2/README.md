Exercícios – Atividade 2 (Java)

Este repositório contém a resolução de dois exercícios desenvolvidos em Java utilizando lógica básica, operadores matemáticos, vetores e estruturas de repetição.
Pacote utilizado: package Atividade2;

Arquivos: Tempo.java / FuncaoElementos.java

---------- Exercício 1 – Conversão de Tempo ------------
O programa recebe um valor inteiro representando o tempo total em segundos e converte para:

Horas / Minutos / Segundos

Exemplo: Entrada: 3665 / Saída: 1h, 1min e 5seg


Lógica utilizada

Foi aplicada a lógica de conversão de tempo: 1 hora = 3600 segundos / 1 minuto = 60 segundos

Recursos utilizados: Scanner para entrada de dados / Operador de divisão para calcular horas e minutos / Operador de resto para calcular o tempo restante / Variável auxiliar resto para armazenar o que sobra após cada divisão

A conversão foi feita passo a passo: Divide por 3600 para obter horas / Usa o resto para calcular minutos / Usa o resto novamente para calcular os segundos finais

--------------- Exercício 2 – Verificação de Elementos Únicos -------------------

Foi criada uma função que recebe: Um vetor de números inteiros /o tamanho do vetor. O objetivo é verificar se existem números repetidos na lista.

Lógica utilizada: O algoritmo compara cada elemento do vetor com todos os outros elementos seguintes / Foi utilizada uma estrutura de repetição aninhada /Um for externo percorre o vetor / Um for interno compara o elemento atual com os próximos

Se encontrar dois valores iguais: O programa imprime que existem números repetidos / Usa return para encerrar a função imediatamente
Caso não encontre repetição: nforma que todos os números são únicos

Recursos utilizados

Vetores (int[])

Estrutura for

Comparação com ==

Método exemplo.length para obter o tamanho do vetor

Uso do return para encerrar a função quando encontra repetição

Como executar

Compilar: javac Atividade2/*.java

Executar: java Atividade2.Tempo / java Atividade2.FuncaoElementos

Att. Karine
