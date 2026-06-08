package com.KarineVSRodrigues.queue.staticqueue;

import com.KarineVSRodrigues.queue.interfaces.Queue;
import com.KarineVSRodrigues.queue.exceptions.OverflowException;
import com.KarineVSRodrigues.queue.exceptions.UnderflowException;

public class StaticQueue<T> implements Queue<T> {

    private T[] elements;
    private int head;
    private int tail;
    private int size;

    @SuppressWarnings("unchecked")
    public StaticQueue(int capacity) {
        elements = (T[]) new Object[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public void push(T element) {

        if (size == elements.length) {
            throw new OverflowException("Fila cheia.");
        }

        elements[tail] = element;

        tail = (tail + 1) % elements.length;

        size++;
    }

    @Override
    public T pop() {

        if (isEmpty()) {
            throw new UnderflowException("Fila vazia.");
        }

        T removed = elements[head];

        elements[head] = null;

        head = (head + 1) % elements.length;

        size--;

        return removed;
    }

    @Override
    public T peek() {

        if (isEmpty()) {
            throw new UnderflowException("Fila vazia.");
        }

        return elements[head];
    }

    @Override
    public T back() {

        if (isEmpty()) {
            throw new UnderflowException("Fila vazia.");
        }

        int lastIndex = (tail - 1 + elements.length) % elements.length;

        return elements[lastIndex];
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

        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }

        head = 0;
        tail = 0;
        size = 0;
    }
}