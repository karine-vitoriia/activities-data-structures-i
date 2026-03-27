package List6;

public class MyArrayList implements MyArrayListTAD {

    private int[] elementos;
    private int quantidade;
    private int capacidade;

    public MyArrayList(int tamanho) {
        this.capacidade = tamanho;
        this.elementos = new int[capacidade];
        this.quantidade = 0;
    }

    @Override
    public boolean isEmpty() {
        return quantidade == 0;
    }

    @Override
    public boolean isFull() {
        return quantidade == capacidade;
    }

    @Override
    public int quantidade() {
        return quantidade;
    }

    @Override
    public void addLast(int novoItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }

        elementos[quantidade] = novoItem;
        quantidade++;
    }

    @Override
    public void addFirst(int novoItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }

        for (int i = quantidade; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[0] = novoItem;
        quantidade++;
    }

    @Override
    public void insertAt(int indice, int novoItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }

        if (indice < 0 || indice > quantidade) {
            System.out.println("Erro: Índice inválido!");
            return;
        }

        for (int i = quantidade; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[indice] = novoItem;
        quantidade++;
    }

    @Override
    public void addSorted(int novoItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }

        int i = quantidade - 1;

        while (i >= 0 && elementos[i] > novoItem) {
            elementos[i + 1] = elementos[i];
            i--;
        }

        elementos[i + 1] = novoItem;
        quantidade++;
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Erro: Lista vazia!");
            return;
        }

        quantidade--;
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Erro: Lista vazia!");
            return;
        }

        for (int i = 0; i < quantidade - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        quantidade--;
    }

    @Override
    public void removeAt(int indice) {
        if (indice < 0 || indice >= quantidade) {
            System.out.println("Erro: Índice inválido!");
            return;
        }

        for (int i = indice; i < quantidade - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        quantidade--;
    }

    @Override
    public void remove(int item) {
        int indice = find(item);

        if (indice != -1) {
            removeAt(indice);
            System.out.println("Item " + item + " removido com sucesso.");
        } else {
            System.out.println("Erro: Item " + item + " não encontrado na lista.");
        }
    }

    @Override
    public int find(int item) {
        for (int i = 0; i < quantidade; i++) {
            if (elementos[i] == item) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int indice) {
        if (indice < 0 || indice >= quantidade) {
            throw new IndexOutOfBoundsException("Erro: Índice " + indice + " fora dos limites.");
        }

        return elementos[indice];
    }

    @Override
    public void set(int indice, int novoItem) {
        if (indice < 0 || indice >= quantidade) {
            throw new IndexOutOfBoundsException("Erro: Índice " + indice + " inválido.");
        }

        elementos[indice] = novoItem;
    }

    @Override
    public void display() {
        System.out.print("Lista atual: [ ");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(elementos[i] + " ");
        }

        System.out.println("]");
    }
}