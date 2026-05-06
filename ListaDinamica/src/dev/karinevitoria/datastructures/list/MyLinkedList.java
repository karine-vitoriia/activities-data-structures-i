package dev.karinevitoria.datastructures.list;

public class MyLinkedList<T> implements MyList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;


    private static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
            this.next = null;
        }

        Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addFirst(T element) {}

    @Override
    public void addLast(T element) {}

    @Override
    public void insertAt(int i, T element) {}

    @Override
    public void addSorted(T element) {}

    @Override
    public T removeFirst() { return null; }

    @Override
    public T removeLast() { return null; }

    @Override
    public T removeAt(int i) { return null; }

    @Override
    public boolean remove(T element) { return false; }

    @Override
    public int find(T element) { return -1; }

    @Override
    public T get(int i) { return null; }

    @Override
    public void set(int i, T element) {}
}