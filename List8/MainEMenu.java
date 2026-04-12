package List8;

import java.util.Scanner;

public class MainEMenu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        PlaylistMusical playlist = new PlaylistMusical(20);

        int opcao;

        do {

            System.out.println("\n===== MENU PLAYLIST =====");
            System.out.println("1 - Adicionar música");
            System.out.println("2 - Adicionar música em posição específica");
            System.out.println("3 - Remover música por ID");
            System.out.println("4 - Remover música por posição");
            System.out.println("5 - Buscar música por posição");
            System.out.println("6 - Buscar posição de uma música");
            System.out.println("7 - Verificar se música existe");
            System.out.println("8 - Mostrar quantidade de músicas");
            System.out.println("9 - Exibir playlist");
            System.out.println("10 - Limpar playlist");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o ID da música: ");
                    int id = entrada.nextInt();
                    playlist.adicionarMusica(id);
                    break;

                case 2:
                    System.out.print("Digite o ID da música: ");
                    id = entrada.nextInt();

                    System.out.print("Digite a posição: ");
                    int posicao = entrada.nextInt();

                    playlist.adicionarMusicaNaPosicao(id, posicao);
                    break;

                case 3:
                    System.out.print("Digite o ID para remover: ");
                    id = entrada.nextInt();

                    if (playlist.removerMusicaPorId(id)) {
                        System.out.println("Música removida!");
                    } else {
                        System.out.println("Música não encontrada!");
                    }
                    break;

                case 4:
                    System.out.print("Digite a posição para remover: ");
                    posicao = entrada.nextInt();

                    int removida = playlist.removerMusicaPorPosicao(posicao);

                    if (removida != -1) {
                        System.out.println("Música removida!");
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    break;

                case 5:
                    System.out.print("Digite a posição: ");
                    posicao = entrada.nextInt();

                    System.out.println("Música encontrada: " +
                            playlist.buscarMusicaPorPosicao(posicao));
                    break;

                case 6:
                    System.out.print("Digite o ID da música: ");
                    id = entrada.nextInt();

                    System.out.println("Posição: " +
                            playlist.buscarPosicaoDaMusica(id));
                    break;

                case 7:
                    System.out.print("Digite o ID da música: ");
                    id = entrada.nextInt();

                    if (playlist.contemMusica(id)) {
                        System.out.println("Música está na playlist.");
                    } else {
                        System.out.println("Música não está na playlist.");
                    }
                    break;

                case 8:
                    System.out.println("Quantidade: " +
                            playlist.quantidadeDeMusicas());
                    break;

                case 9:
                    playlist.exibirPlaylist();
                    break;

                case 10:
                    playlist.limparPlaylist();
                    System.out.println("Playlist limpa!");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        entrada.close();
    }
}