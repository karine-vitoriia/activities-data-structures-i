package com.KarineVSRodrigues.queue.interfaces;

public interface Queue<T> {

    void push(T element);

    T pop();

    T peek();

    T back();

    int size();

    boolean isEmpty();

    void clear();
}