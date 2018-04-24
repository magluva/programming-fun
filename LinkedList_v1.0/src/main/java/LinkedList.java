package main.java;

public class LinkedList<T> implements List<T> {

    private static final boolean ACTIVE = false;
    private Debugger dev = new Debugger(ACTIVE);
    private int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        this.size = 0;
    }

    protected class Node {

        private Node next = null;
        private Node prev = null;
        private T element;

        protected Node(T element) {
            this.element = element;
        }

        protected void setNext(Node node) {
            next = node;
        }

        protected void setPrev(Node node) {
            prev = node;
        }

        protected void setElement(T element) {
            this.element = element;
        }

        protected Node getNext() {
            return next;
        }

        protected Node getPrev() {
            return prev;
        }

        protected T getElement() {
            return element;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addItem(T element) {
        addLast(element);
        size++;
        dev.log(3, "(DevLog) New size: " + size);
    }

    public void addItem(int index, T element) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException(index);
        }
        Node newNode = new Node(element);
        if (isEmpty() || index == size) {
            addLast(element);
        } else if (index == 0) {
            addFirst(element);
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    newNode.setPrev(current.getPrev());
                    newNode.setNext(current);
                    current.getPrev().setNext(newNode);
                    current.setPrev(newNode);
                }
                current = current.getNext();
            }
        }
        size++;
        dev.log(3, "(DevLog) New size: " + size);
    }

    public void replaceItem(int index, T element) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException(index);
        }
        if (isEmpty()) {
            throw new EmptyListException();
        }
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                current.setElement(element);
            }
            current = current.getNext();
        }
    }

    public T getItem(int index) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException(index);
        }
        if (isEmpty()) {
            throw new EmptyListException();
        }
        T element = null;
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                element = current.getElement();
            }
            current = current.getNext();
        }
        return element;
    }

    public T removeItem() {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        T element = removeFirst();
        size--;
        dev.log(3, "(DevLog) New size: " + size);
        return element;
    }

    public T removeItem(int index) {
        if ((index < 0 || index > size) || (index != 0 && index == size)) {
            throw new InvalidIndexException(index);
        }
        if (isEmpty()) {
            throw new EmptyListException();
        }
        T element = null;
        if (index == 0) {
            element = removeFirst();
        } else if (index == size - 1) {
            element = removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    element = current.getElement();
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }
                current = current.getNext();
            }
        }
        size--;
        dev.log(3, "(DevLog) New size: " + size);
        return element;
    }

    public void showItems() {
        if (isEmpty()) {
            throw new EmptyListException();
        }
        Node current = head;
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + current.getElement());
            current = current.getNext();
        }
    }

    private void addFirst(T element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else if (size == 1) {
            head = newNode;
            head.setNext(tail);
            tail.setPrev(head);
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
        dev.log(3, "(DevLog) Method: addFirst(), Element: " + element);
        dev.log(3, "(DevLog) Previous size: " + size);
    }

    private void addLast(T element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else if (size == 1) {
            tail = newNode;
            head.setNext(tail);
            tail.setPrev(head);
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        dev.log(3, "(DevLog) Method: addLast(), Element: " + element);
        dev.log(3, "(DevLog) Previous size: " + size);
    }

    private T removeFirst() {
        T element = head.getElement();
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
        dev.log(3, "(DevLog) Method: removeFirst(), Element: " + element);
        dev.log(3, "(DevLog) Previous size: " + size);
        return element;
    }

    private T removeLast() {
        T element = tail.getElement();
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        dev.log(3, "(DevLog) Method: removeLast(), Element: " + element);
        dev.log(3, "(DevLog) Previous size: " + size);
        return element;
    }
}