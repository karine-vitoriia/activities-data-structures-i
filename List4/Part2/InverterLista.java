package List4.Part2;

public class InverterLista {

    public static void inverter_lista(int[] vetor) {

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {

            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }
    }

    public static void imprimir(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] v = {10, 20, 30, 40, 50};

        System.out.print("Antes: ");
        imprimir(v);

        inverter_lista(v);

        System.out.print("Depois: ");
        imprimir(v);
    }
}