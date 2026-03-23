package List6Part1;

public class Main {
    public static void main(String[] args) {
        // só p exemplo
        // criando uma lista com capacidade para 5 elementos

        MyArrayList lista = new MyArrayList(5);


        // estando inserções
        System.out.println("Teste de Inserção");
        lista.addLast(10);  // [10]
        lista.addLast(20);  // [10, 20]
        lista.addFirst(5);  // [5, 10, 20] deslocou 10 e 20 para a direita
        lista.insertAt(1, 7); // [5, 7, 10, 20] inseriu 7 entre o 5 e o 10
        lista.display();

        // testando buscas e acessos
        System.out.println("Teste de Busca e Acesso");
        System.out.println("O valor 10 está na posição: " + lista.find(10));
        System.out.println("Quem está na posição 3? " + lista.get(3));
        System.out.println("Total de elementos agora: " + lista.count());

        // testando atualizações (set)
        System.out.println("Teste de Atualização (set)");
        lista.set(1, 8); // mudando o 7 para 8
        lista.display();

        // testando remoções
        System.out.println("Teste de Remoção");
        System.out.println("Removido do início: " + lista.removeFirst()); // sai o 5
        lista.display(); // [8, 10, 20]  deslocou

        System.out.println("Removido do índice 1: " + lista.removeAt(1)); // sai o 10
        lista.display(); // [8, 20]

        // testando lista cheia
        System.out.println("Teste de Limite");
        lista.addLast(30);
        lista.addLast(40);
        lista.addLast(50); // aqui a lista atinge o limite de 5
        lista.display();

        System.out.print("Tentando adicionar mais um (60): ");
        lista.addLast(60); // deve exibir a mensagem de erro da sua classe

        System.out.println("\nA lista está cheia? " + (lista.isFull() ? "Sim" : "Não"));
    }
}