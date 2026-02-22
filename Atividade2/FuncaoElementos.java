package Atividade2;

public class FuncaoElementos {

    void verificarElementosUnicos(int numeros[], int tamanho) {

        for (int posicaoAtual = 0; posicaoAtual < tamanho; posicaoAtual++) {

            for (int comparador = posicaoAtual + 1; comparador < tamanho; comparador++) {

                if (numeros[posicaoAtual] == numeros[comparador]) {
                    System.out.println("Existem números repetidos na lista");
                    return;
                }

            }
        }

        System.out.println("Todos os números são únicos");
    }

    public static void main(String[] args) {

        FuncaoElementos fc = new FuncaoElementos();

        int[] exemplo = {10, 20, 30, 40, 10}; // teste com repetido

        fc.verificarElementosUnicos(exemplo, exemplo.length);

    }
}