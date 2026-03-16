package List5;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int capacidadeAtual = 4;
        int quantidadeElementos = 0;

        int[] vetor = new int[capacidadeAtual];

        System.out.println("Quantos valores deseja inserir?");
        int quantidadeDesejada = leitor.nextInt();

        for (int posicaoAtual = 0; posicaoAtual < quantidadeDesejada; posicaoAtual++) {

            System.out.print("Digite um valor: ");
            int valorInserido = leitor.nextInt();

            vetor = inserirElemento(vetor, valorInserido, quantidadeElementos);
            quantidadeElementos++;
        }

        listarElementos(vetor, quantidadeElementos);

        leitor.close();
    }


    public static int[] inserirElemento(int[] vetorAtual, int valorInserido, int posicaoAtual) {

        // 1º parte: detectar se o array está cheio
        if (posicaoAtual == vetorAtual.length) {

            System.out.println("\nVetor cheio!");
            System.out.println("Redimensionando automaticamente...\n");

            vetorAtual = redimensionarVetor(vetorAtual);
        }

        vetorAtual[posicaoAtual] = valorInserido;

        return vetorAtual;
    }

    // 2º parte:  criar um novo array com o dobro da capacidade
    public static int[] redimensionarVetor(int[] vetorAntigo) {

        int capacidadeAntiga = vetorAntigo.length;
        int novaCapacidade = capacidadeAntiga * 2;

        int[] novoVetor = new int[novaCapacidade];

        for (int posicaoAtual = 0; posicaoAtual < capacidadeAntiga; posicaoAtual++) {
            novoVetor[posicaoAtual] = vetorAntigo[posicaoAtual];
        }

        return novoVetor;
    }

    // 3º parte:  mostrar os valores nas posições
    public static void listarElementos(int[] vetor, int quantidadeElementos) {

        System.out.println("\nElementos armazenados:");

        for (int posicaoAtual = 0; posicaoAtual < quantidadeElementos; posicaoAtual++) {
            System.out.println("Posição " + posicaoAtual + ": " + vetor[posicaoAtual]);
        }
    }
}