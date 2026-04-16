package List9;

public interface BookListTAD {

    void adicionarLivro(int idLivro);

    void adicionarLivroNaPosicao(int idLivro, int posicao);

    int removerLivroPorPosicao(int posicao);

    boolean removerLivroPorId(int idLivro);

    int buscarLivroPorPosicao(int posicao);

    int buscarPosicaoDoLivro(int idLivro);

    boolean contemLivro(int idLivro);

    int quantidadeDeLivros();

    boolean listaEstaVazia();

    boolean listaEstaCheia();

    void limparLista();

    void exibirLista();
}