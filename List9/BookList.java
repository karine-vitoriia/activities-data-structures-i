package List9;

public class BookList implements BookListTAD {

    private int[] livros;
    private int quantidade;
    private int capacidadeMaxima;

    public BookList(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.livros = new int[capacidadeMaxima];
        this.quantidade = 0;
    }

    @Override
    public void adicionarLivro(int idLivro) {
        if (listaEstaCheia()) {
            System.out.println("Lista cheia!");
            return;
        }

        livros[quantidade] = idLivro;
        quantidade++;
    }

    @Override
    public void adicionarLivroNaPosicao(int idLivro, int posicao) {

        if (listaEstaCheia()) {
            System.out.println("Lista cheia!");
            return;
        }

        if (posicao < 0 || posicao > quantidade) {
            System.out.println("Posição inválida!");
            return;
        }

        for (int i = quantidade; i > posicao; i--) {
            livros[i] = livros[i - 1];
        }

        livros[posicao] = idLivro;
        quantidade++;
    }

    @Override
    public int removerLivroPorPosicao(int posicao) {

        if (posicao < 0 || posicao >= quantidade) {
            return -1;
        }

        int removido = livros[posicao];

        for (int i = posicao; i < quantidade - 1; i++) {
            livros[i] = livros[i + 1];
        }

        quantidade--;

        return removido;
    }

    @Override
    public boolean removerLivroPorId(int idLivro) {

        int posicao = buscarPosicaoDoLivro(idLivro);

        if (posicao == -1) {
            return false;
        }

        removerLivroPorPosicao(posicao);
        return true;
    }

    @Override
    public int buscarLivroPorPosicao(int posicao) {

        if (posicao < 0 || posicao >= quantidade) {
            return -1;
        }

        return livros[posicao];
    }

    @Override
    public int buscarPosicaoDoLivro(int idLivro) {

        for (int i = 0; i < quantidade; i++) {
            if (livros[i] == idLivro) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean contemLivro(int idLivro) {
        return buscarPosicaoDoLivro(idLivro) != -1;
    }

    @Override
    public int quantidadeDeLivros() {
        return quantidade;
    }

    @Override
    public boolean listaEstaVazia() {
        return quantidade == 0;
    }

    @Override
    public boolean listaEstaCheia() {
        return quantidade == capacidadeMaxima;
    }

    @Override
    public void limparLista() {
        quantidade = 0;
    }

    @Override
    public void exibirLista() {

        if (listaEstaVazia()) {
            System.out.println("Lista vazia!");
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Posição " + i + " -> Livro ID: " + livros[i]);
        }
    }
}