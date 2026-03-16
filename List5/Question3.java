package List5;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
            removerElemento();
        }


        public static void removerElemento() {

            Scanner entrada = new Scanner(System.in);

            int[] vetor = new int[10];

            System.out.print("Quantidade de elementos: ");
            int quantidadeElementos = entrada.nextInt();

            for (int posicaoAtual = 0; posicaoAtual < quantidadeElementos; posicaoAtual++) {
                System.out.print("Valor da posição " + posicaoAtual + ": ");
                vetor[posicaoAtual] = entrada.nextInt();
            }

            System.out.print("Valor a remover: ");
            int valorRemover = entrada.nextInt();

            int posicaoEncontrada = -1;

            for (int posicaoAtual = 0; posicaoAtual < quantidadeElementos; posicaoAtual++) {
                if (vetor[posicaoAtual] == valorRemover) {
                    posicaoEncontrada = posicaoAtual;
                    break;
                }
            }

            if (posicaoEncontrada != -1) {

                for (int posicaoAtual = posicaoEncontrada; posicaoAtual < quantidadeElementos - 1; posicaoAtual++) {
                    vetor[posicaoAtual] = vetor[posicaoAtual + 1];
                }

                quantidadeElementos--;
            }

            System.out.println("Vetor final:");

            for (int posicaoAtual = 0; posicaoAtual < quantidadeElementos; posicaoAtual++) {
                System.out.print(vetor[posicaoAtual] + " ");
            }
        }
    }