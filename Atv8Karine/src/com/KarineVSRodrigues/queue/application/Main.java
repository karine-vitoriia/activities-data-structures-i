package com.KarineVSRodrigues.queue.application;

import com.KarineVSRodrigues.queue.interfaces.Queue;
import com.KarineVSRodrigues.queue.staticqueue.StaticQueue;
import com.KarineVSRodrigues.queue.linkedqueue.LinkedQueue;

public class Main {

  public static void main(String[] args) {

    System.out.println("=== FILA ESTÁTICA ===");

    Queue<Integer> filaEstatica = new StaticQueue<>(5);

    filaEstatica.push(10);
    filaEstatica.push(20);
    filaEstatica.push(30);

    System.out.println("Primeiro: " + filaEstatica.peek());
    System.out.println("Último: " + filaEstatica.back());

    System.out.println("Removido: " + filaEstatica.pop());
    System.out.println("Removido: " + filaEstatica.pop());

    System.out.println("Tamanho: " + filaEstatica.size());

    System.out.println();

    System.out.println("=== FILA DINÂMICA ===");

    Queue<String> filaDinamica = new LinkedQueue<>();

    filaDinamica.push("Ana");
    filaDinamica.push("Carlos");
    filaDinamica.push("João");

    System.out.println("Primeiro: " + filaDinamica.peek());
    System.out.println("Último: " + filaDinamica.back());

    System.out.println("Removido: " + filaDinamica.pop());

    System.out.println("Tamanho: " + filaDinamica.size());
  }
}