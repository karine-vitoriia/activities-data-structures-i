package List4.Part3;

public class AnaliseComplexidade {

    /*

    Justificativa Teórica: Analise o algoritmo de inversão da Questão 6 e responda:

    1) Quantas trocas são realizadas em um vetor de tamanho n?

    R: Em um vetor de tamanho n, o algoritmo realiza aproximadamente n/2 trocas, porque
    ele sempre troca dois elementos ao mesmo tempo: o primeiro com o último, o segundo
    com o penúltimo e assim por diante, caminhando em direção ao centro do vetor. Isso
    significa que não é necessário percorrer todos os elementos individualmente até o
    final, pois cada troca já posiciona dois valores corretamente. Quando o vetor possui
    quantidade ímpar de elementos, o valor central não precisa ser trocado, pois já está
    na posição correta. Assim, o número total de trocas cresce proporcionalmente à metade
    do tamanho do vetor, sendo representado matematicamente por ⌊n/2⌋.


    2) Baseado no crescimento do número de operações em relação ao tamanho da entrada,
    este algoritmo é considerado O(1), O(n) ou O(n^2). Justifique sua resposta.

    R: Este algoritmo possui complexidade O(n), chamada de complexidade linear, porque a
    quantidade de operações aumenta proporcionalmente ao tamanho do vetor de entrada. Na
    análise de complexidade (Notação Big-O), observamos como o número de passos do
    algoritmo cresce quando aumentamos o tamanho dos dados. Nesse caso, existe apenas
    um laço que percorre o vetor até a metade, sem laços aninhados, fazendo com que o
    número de execuções aumente de forma direta conforme n cresce. Não é O(1), pois o
    tempo não é constante e depende do tamanho do vetor, e também não é O(n^2), já que não
    há repetição de um laço dentro de outro. Portanto, como o crescimento é proporcional
    a n, classificamos o algoritmo como O(n), indicando que ele é eficiente e escala bem
    mesmo para vetores grandes.


     */
}
