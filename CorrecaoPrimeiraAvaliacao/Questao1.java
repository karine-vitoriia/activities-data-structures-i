package CorrecaoPrimeiraAvaliacao;

public class Questao1 {


    public static void main(String[] args) {

        int capacidade = 10;
        int[] lista = new int[capacidade];

        int n = 0;


        n = inserirOrdenadoDecrescente(lista, n, capacidade, 50);
        n = inserirOrdenadoDecrescente(lista, n, capacidade, 30);
        n = inserirOrdenadoDecrescente(lista, n, capacidade, 70);
        n = inserirOrdenadoDecrescente(lista, n, capacidade, 40);
        n = inserirOrdenadoDecrescente(lista, n, capacidade, 90);

        System.out.println("Lista em ordem decrescente:");

        for (int i = 0; i < n; i++) {
            System.out.print(lista[i] + " ");
        }

}

    public static int inserirOrdenadoDecrescente(int[] lista, int n, int capacidadeMaxima, int novoValor) {


        if (n >= capacidadeMaxima) {
            System.out.println("Lista cheia!");
            return n;
        }

        int i;

        for (i = 0; i < n; i++) {
            if (novoValor > lista[i]) {
                break;
            }
        }
        for (int j = n; j > i; j--) {
            lista[j] = lista[j - 1];
        }

        lista[i] = novoValor;

        return n + 1;
    }
}
