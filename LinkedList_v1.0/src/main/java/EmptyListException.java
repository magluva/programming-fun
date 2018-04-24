package main.java;

public class EmptyListException extends RuntimeException {

    public EmptyListException() {
        super("Unsupported operation on empty list ...");
    }
}
