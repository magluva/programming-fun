package main.java;

public class Stack<T> extends LinkedList<T> {

    public Stack() {
        super();
    }

    public void push(T element) {
        super.addItem(0, element);
    }

    public T pop() {
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
