package List5;

public class Question1 {

    public static void main(String[] args) {

        inserirElemento();

    }

    public static void inserirElemento() {

        int[] array = new int[10];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        int tamanhoVetor = 5;

        int elemento = 15;
        int posicao = 1;

        for (int i = tamanhoVetor; i > posicao; i--) {

            array[i] = array[i - 1];

        }

        array[posicao] = elemento;

        tamanhoVetor++;

        System.out.println("Vetor após inserção:");

        for (int i = 0; i < tamanhoVetor; i++) {

            System.out.print(array[i] + " ");

        }

    }
}