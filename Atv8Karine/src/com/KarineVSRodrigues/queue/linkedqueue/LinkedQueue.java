package com.KarineVSRodrigues.queue.linkedqueue;

import com.KarineVSRodrigues.queue.interfaces.Queue;
import com.KarineVSRodrigues.queue.exceptions.UnderflowException;

public class LinkedQueue<T> implements Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void push(T element) {

        Node<T> newNode = new Node<>(element);

        if (isEmpty()) {

            head = newNode;
            tail = newNode;

        } else {

            tail.setNext(newNode);
            tail = newNode;
        }

        size++;
    }

    @Override
    public T pop() {

        if (isEmpty()) {
            throw new UnderflowException("Fila vazia.");
        }

        T removed = head.getData();

        head = head.getNext();

        if (head == null) {
            tail = null;
        }

        size--;

        return removed;
    }

    @Override
    public T peek() {

        if (isEmpty()) {
            throw new UnderflowException("Fila vazia.");
        }

        return head.getData();
    }

    @Override
    public T back() {

        if (isEmpty()) {
            throw new UnderflowException("Fila vazia.");
        }

        return tail.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {

        head = null;
        tail = null;
        size = 0;
    }
}