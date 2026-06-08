package com.KarineVSRodrigues.queue.tests;

import com.KarineVSRodrigues.queue.interfaces.Queue;
import com.KarineVSRodrigues.queue.linkedqueue.LinkedQueue;
import com.KarineVSRodrigues.queue.staticqueue.StaticQueue;

public class QueueTests {

    public static void main(String[] args) {

        testStaticQueue();

        System.out.println();

        testLinkedQueue();
    }

    private static void testStaticQueue() {

        System.out.println("===== TESTE FILA ESTÁTICA =====");

        Queue<Integer> queue = new StaticQueue<>(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Primeiro: " + queue.peek());
        System.out.println("Último: " + queue.back());

        System.out.println("Removido: " + queue.pop());
        System.out.println("Removido: " + queue.pop());

        System.out.println("Tamanho: " + queue.size());

        System.out.println("Vazia? " + queue.isEmpty());

        queue.clear();

        System.out.println("Após clear(): " + queue.isEmpty());
    }

    private static void testLinkedQueue() {

        System.out.println("===== TESTE FILA DINÂMICA =====");

        Queue<String> queue = new LinkedQueue<>();

        queue.push("Ana");
        queue.push("Carlos");
        queue.push("João");

        System.out.println("Primeiro: " + queue.peek());
        System.out.println("Último: " + queue.back());

        System.out.println("Removido: " + queue.pop());

        System.out.println("Tamanho: " + queue.size());

        System.out.println("Vazia? " + queue.isEmpty());

        queue.clear();

        System.out.println("Após clear(): " + queue.isEmpty());
    }
}