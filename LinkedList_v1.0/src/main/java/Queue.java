package main.java;

public class Queue<T> extends LinkedList<T> {

    public Queue() {
        super();
    }

    public void enqueue(T element) {
        super.addItem(element);
    }

    public T dequeue() {
        return super.removeItem();
    }

    @Override
    public void addItem(T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addItem(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T removeItem() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T removeItem(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceItem(int index, T element) {
        throw new UnsupportedOperationException();
    }
}
