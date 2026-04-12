package List8;

public interface PlaylistTAD {

    void adicionarMusica(int idMusica);

    void adicionarMusicaNaPosicao(int idMusica, int posicao);

    int removerMusicaPorPosicao(int posicao);

    boolean removerMusicaPorId(int idMusica);

    int buscarMusicaPorPosicao(int posicao);

    int buscarPosicaoDaMusica(int idMusica);

    boolean contemMusica(int idMusica);

    int quantidadeDeMusicas();

    boolean playlistEstaVazia();

    boolean playlistEstaCheia();

    void limparPlaylist();

    void exibirPlaylist();
}
