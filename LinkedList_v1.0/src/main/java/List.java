package main.java;

public interface List<T> {

    int getSize();

    boolean isEmpty();

    void addItem(T element);

    void addItem(int index, T element);

    void replaceItem(int index, T element);

    T getItem(int index);

    T removeItem();

    T removeItem(int index);

    void showItems();
}
