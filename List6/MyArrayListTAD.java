package List6;

public interface MyArrayListTAD {

    boolean isEmpty();
    boolean isFull();
    int count();
    void display();

    int get(int index);
    void set(int index, int newItem);

    void addLast(int newItem);
    void addFirst(int newItem);
    void insertAt(int index, int newItem);
    void addSorted(int newItem);

    void removeLast();
    void removeFirst();
    void removeAt(int index);
    void remove(int item);

    int find(int item);
}
