package List6Part1;


public class MyArrayList {
    private int[] elementos;
    private int tamanho;

    public MyArrayList(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    // métodos de inserção

    public void addFirst(int value) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }

        //vai descolar todos
        for (int i = tamanho; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = value;
        tamanho++;
    }

    public void addLast(int value) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        elementos[tamanho] = value;
        tamanho++;
    }

    public void insertAt(int index, int value) {
        if (isFull() || index < 0 || index > tamanho) {
            System.out.println("Erro: Índice inválido ou lista cheia!");
            return;
        }
        // vai abrir  espaço a partir do índice desejado
        for (int i = tamanho; i > index; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[index] = value;
        tamanho++;
    }

    // remoção

    public int removeFirst() {
        if (isEmpty()) return -1;

        int removido = elementos[0];

        // vai puxar todos p a esquerda

        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return removido;
    }

    public int removeLast() {
        if (isEmpty()) return -1;

        int removido = elementos[tamanho - 1];
        tamanho--; // diminuir o tamanho, o valor será sobrescrito depois
        return removido;
    }

    public int removeAt(int index) {
        if (isEmpty() || index < 0 || index >= tamanho) return -1;

        int removido = elementos[index];
        for (int i = index; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return removido;
    }

    public boolean remove(int value) {
        int index = find(value);
        if (index == -1) return false;

        removeAt(index);
        return true;
    }

    // busca e atualização

    public int find(int value) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == value) return i; // Retorna a posição
        }
        return -1;
    }

    public int get(int index) {
        if (index < 0 || index >= tamanho) return -1;
        return elementos[index];
    }

    public void set(int index, int value) {
        if (index >= 0 && index < tamanho) {
            elementos[index] = value;
        }
    }

    // utilitarios

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == elementos.length;
    }

    public int count() {
        return tamanho;
    }

    public void display() {
        System.out.print("Conteúdo da Lista: [ ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println("]");
    }
}