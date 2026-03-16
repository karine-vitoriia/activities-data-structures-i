package List5;
import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
            fusaoArraysOrdenados();
        }

        public static void fusaoArraysOrdenados() {

            Scanner entrada = new Scanner(System.in);

            System.out.print("Tamanho do primeiro array: ");
            int tamanhoA = entrada.nextInt();

            System.out.print("Tamanho do segundo array: ");
            int tamanhoB = entrada.nextInt();

            int[] arrayA = new int[tamanhoA];
            int[] arrayB = new int[tamanhoB];

            System.out.println("Digite o primeiro array (ordenado):");
            for (int posicaoAtual = 0; posicaoAtual < tamanhoA; posicaoAtual++) {
                arrayA[posicaoAtual] = entrada.nextInt();
            }

            System.out.println("Digite o segundo array (ordenado):");
            for (int posicaoAtual = 0; posicaoAtual < tamanhoB; posicaoAtual++) {
                arrayB[posicaoAtual] = entrada.nextInt();
            }

            int[] resultado = new int[tamanhoA + tamanhoB];

            int indiceA = 0;
            int indiceB = 0;
            int indiceResultado = 0;

            while (indiceA < tamanhoA && indiceB < tamanhoB) {

                if (arrayA[indiceA] <= arrayB[indiceB]) {
                    resultado[indiceResultado++] = arrayA[indiceA++];
                } else {
                    resultado[indiceResultado++] = arrayB[indiceB++];
                }
            }

            while (indiceA < tamanhoA) {
                resultado[indiceResultado++] = arrayA[indiceA++];
            }

            while (indiceB < tamanhoB) {
                resultado[indiceResultado++] = arrayB[indiceB++];
            }

            System.out.println("Array resultante:");

            for (int posicaoAtual = 0; posicaoAtual < resultado.length; posicaoAtual++) {
                System.out.print(resultado[posicaoAtual] + " ");
            }
        }
    }

