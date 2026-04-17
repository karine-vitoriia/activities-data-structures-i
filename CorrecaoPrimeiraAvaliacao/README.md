# Correção do método inserirOrdenadoDecrescente

## O que a questão pedia

Implementar um método para inserir um valor em um array já ordenado de forma decrescente, garantindo:

- Manter a ordem decrescente
- Fazer o deslocamento correto dos elementos (shift)
- Não perder dados
- Respeitar o tamanho máximo do array
- Retornar o novo tamanho lógico (n)

---

## Erros encontrados

- Uso de variável `n` sem declarar
- Não buscava a posição correta para inserir
- Shift feito de forma errada (apagava dados)
- Inserção incorreta (`lista = novoValor`)
- Não verificava se a lista estava cheia

---

## O que foi corrigido

- Adicionado o parâmetro `n` (tamanho da lista)
- Criada lógica para encontrar a posição correta
- Corrigido o shift (feito da direita para a esquerda)
- Inserção feita corretamente na posição
- Adicionada verificação de capacidade

