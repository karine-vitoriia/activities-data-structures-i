package dev.karinevitoria.datastructures.list.tests;

import dev.karinevitoria.datastructures.list.MyLinkedList;

public class MyLinkedListTests {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(10);
        list.addLast(30);
        list.insertAt(1, 20);

        list.addSorted(25);

        System.out.println("Size: " + list.size());

        System.out.println("Element at 0: " + list.get(0));
        System.out.println("Element at 1: " + list.get(1));
        System.out.println("Element at 2: " + list.get(2));

        list.set(1, 99);

        System.out.println("After set:");
        System.out.println(list.get(1));

        System.out.println("Find 99: " + list.find(99));

        list.removeFirst();
        list.removeLast();
        list.removeAt(0);

        list.addLast(50);
        list.addLast(60);

        list.remove(50);

        System.out.println("Final size: " + list.size());

        list.clear();

        System.out.println("Size after clear: " + list.size());
    }
}