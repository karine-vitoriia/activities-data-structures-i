package List8;

public class PlaylistMusical implements PlaylistTAD {

    private int[] musicas;
    private int quantidade;
    private int capacidadeMaxima;

    public PlaylistMusical(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.musicas = new int[capacidadeMaxima];
        this.quantidade = 0;
    }

    @Override
    public void adicionarMusica(int idMusica) {
        if (playlistEstaCheia()) {
            System.out.println("Playlist cheia!");
            return;
        }

        musicas[quantidade] = idMusica;
        quantidade++;
    }

    @Override
    public void adicionarMusicaNaPosicao(int idMusica, int posicao) {
        if (playlistEstaCheia()) {
            System.out.println("Playlist cheia!");
            return;
        }

        if (posicao < 0 || posicao > quantidade) {
            System.out.println("Posição inválida!");
            return;
        }

        for (int i = quantidade; i > posicao; i--) {
            musicas[i] = musicas[i - 1];
        }

        musicas[posicao] = idMusica;
        quantidade++;
    }

    @Override
    public int removerMusicaPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= quantidade) {
            return -1;
        }

        int removida = musicas[posicao];

        for (int i = posicao; i < quantidade - 1; i++) {
            musicas[i] = musicas[i + 1];
        }

        quantidade--;

        return removida;
    }

    @Override
    public boolean removerMusicaPorId(int idMusica) {
        int posicao = buscarPosicaoDaMusica(idMusica);

        if (posicao == -1) {
            return false;
        }

        removerMusicaPorPosicao(posicao);
        return true;
    }

    @Override
    public int buscarMusicaPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= quantidade) {
            return -1;
        }

        return musicas[posicao];
    }

    @Override
    public int buscarPosicaoDaMusica(int idMusica) {
        for (int i = 0; i < quantidade; i++) {
            if (musicas[i] == idMusica) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean contemMusica(int idMusica) {
        return buscarPosicaoDaMusica(idMusica) != -1;
    }

    @Override
    public int quantidadeDeMusicas() {
        return quantidade;
    }

    @Override
    public boolean playlistEstaVazia() {
        return quantidade == 0;
    }

    @Override
    public boolean playlistEstaCheia() {
        return quantidade == capacidadeMaxima;
    }

    @Override
    public void limparPlaylist() {
        quantidade = 0;
    }

    @Override
    public void exibirPlaylist() {

        if (playlistEstaVazia()) {
            System.out.println("Playlist vazia!");
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Posição " + i + " -> Música ID: " + musicas[i]);
        }
    }
}