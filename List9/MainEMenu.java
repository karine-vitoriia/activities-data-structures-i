package List9;
import java.util.Scanner;

public class MainEMenu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        BookList lista = new BookList(20);

        int opcao;

        do {

            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Adicionar livro em posição");
            System.out.println("3 - Remover livro por ID");
            System.out.println("4 - Remover livro por posição");
            System.out.println("5 - Buscar livro por posição");
            System.out.println("6 - Buscar posição do livro");
            System.out.println("7 - Verificar se livro existe");
            System.out.println("8 - Quantidade de livros");
            System.out.println("9 - Exibir lista");
            System.out.println("10 - Limpar lista");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("ID do livro: ");
                    int id = entrada.nextInt();
                    lista.adicionarLivro(id);
                    break;

                case 2:
                    System.out.print("ID do livro: ");
                    id = entrada.nextInt();

                    System.out.print("Posição: ");
                    int pos = entrada.nextInt();

                    lista.adicionarLivroNaPosicao(id, pos);
                    break;

                case 3:
                    System.out.print("ID para remover: ");
                    id = entrada.nextInt();

                    if (lista.removerLivroPorId(id)) {
                        System.out.println("Livro removido!");
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Posição: ");
                    pos = entrada.nextInt();

                    int removido = lista.removerLivroPorPosicao(pos);

                    if (removido != -1) {
                        System.out.println("Livro removido!");
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    break;

                case 5:
                    System.out.print("Posição: ");
                    pos = entrada.nextInt();

                    System.out.println("Livro: " + lista.buscarLivroPorPosicao(pos));
                    break;

                case 6:
                    System.out.print("ID do livro: ");
                    id = entrada.nextInt();

                    System.out.println("Posição: " + lista.buscarPosicaoDoLivro(id));
                    break;

                case 7:
                    System.out.print("ID do livro: ");
                    id = entrada.nextInt();

                    System.out.println(lista.contemLivro(id) ? "Existe" : "Não existe");
                    break;

                case 8:
                    System.out.println("Quantidade: " + lista.quantidadeDeLivros());
                    break;

                case 9:
                    lista.exibirLista();
                    break;

                case 10:
                    lista.limparLista();
                    System.out.println("Lista limpa!");
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