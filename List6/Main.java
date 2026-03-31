package List6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Capacidade inicial: ");
        MyArrayList lista = new MyArrayList(entrada.nextInt());

        int opcao;

        do {
            mostrarMenu();
            opcao = entrada.nextInt();
            executarOpcao(opcao, lista, entrada);

        } while (opcao != 0);

        entrada.close();
    }


    public static void mostrarMenu() {
        System.out.println("\nMENU");
        System.out.println("1  - addLast");
        System.out.println("2  - addFirst");
        System.out.println("3  - insertAt");
        System.out.println("4  - addSorted");
        System.out.println("5  - removeLast");
        System.out.println("6  - removeFirst");
        System.out.println("7  - removeAt");
        System.out.println("8  - remove");
        System.out.println("9  - find");
        System.out.println("10 - get");
        System.out.println("11 - set");
        System.out.println("12 - info");
        System.out.println("13 - display");
        System.out.println("0  - sair");
        System.out.print("Opção: ");
    }


    public static void executarOpcao(int op, MyArrayList lista, Scanner entrada) {

        switch (op) {

            case 1 -> {
                System.out.print("Valor: ");
                lista.addLast(entrada.nextInt());
            }

            case 2 -> {
                System.out.print("Valor: ");
                lista.addFirst(entrada.nextInt());
            }

            case 3 -> {
                System.out.print("Índice: ");
                int i = entrada.nextInt();
                System.out.print("Valor: ");
                lista.insertAt(i, entrada.nextInt());
            }

            case 4 -> {
                System.out.print("Valor: ");
                lista.addSorted(entrada.nextInt());
            }

            case 5 -> lista.removeLast();

            case 6 -> lista.removeFirst();

            case 7 -> {
                System.out.print("Índice: ");
                lista.removeAt(entrada.nextInt());
            }

            case 8 -> {
                System.out.print("Valor: ");
                lista.remove(entrada.nextInt());
            }

            case 9 -> {
                System.out.print("Valor: ");
                int pos = lista.find(entrada.nextInt());
                System.out.println(pos == -1 ? "Não encontrado" : "Encontrado em: " + pos);
            }

            case 10 -> {
                System.out.print("Índice: ");
                System.out.println(lista.get(entrada.nextInt()));
            }

            case 11 -> {
                System.out.print("Índice: ");
                int i = entrada.nextInt();
                System.out.print("Novo valor: ");
                lista.set(i, entrada.nextInt());
            }

            case 12 -> {
                System.out.println("Quantidade: " + lista.count());
                System.out.println("Vazia? " + lista.isEmpty());
                System.out.println("Cheia? " + lista.isFull());
            }


            case 13 -> lista.display();

            case 0 -> System.out.println("Encerrando...");

            default -> System.out.println("Opção inválida!");
        }
    }
}
