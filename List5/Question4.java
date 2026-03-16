package List5;
import java.util.Scanner;

public class Question4 {


        public static void main(String[] args) {
            removerDuplicados();
        }

        public static void removerDuplicados() {

            Scanner entrada = new Scanner(System.in);

            int[] vetor = new int[10];

            System.out.print("Quantidade de elementos: ");
            int quantidadeElementos = entrada.nextInt();

            for (int posicaoAtual = 0; posicaoAtual < quantidadeElementos; posicaoAtual++) {
                System.out.print("Valor da posição " + posicaoAtual + ": ");
                vetor[posicaoAtual] = entrada.nextInt();
            }

            for (int posicaoAtual = 0; posicaoAtual < quantidadeElementos; posicaoAtual++) {

                for (int posicaoComparacao = posicaoAtual + 1; posicaoComparacao < quantidadeElementos; posicaoComparacao++) {

                    if (vetor[posicaoAtual] == vetor[posicaoComparacao]) {

                        for (int posicaoShift = posicaoComparacao; posicaoShift < quantidadeElementos - 1; posicaoShift++) {
                            vetor[posicaoShift] = vetor[posicaoShift + 1];
                        }

                        quantidadeElementos--;
                        posicaoComparacao--;
                    }
                }
            }

            System.out.println("Vetor sem duplicados:");

            for (int posicaoAtual = 0; posicaoAtual < quantidadeElementos; posicaoAtual++) {
                System.out.print(vetor[posicaoAtual] + " ");
            }
        }
    }

