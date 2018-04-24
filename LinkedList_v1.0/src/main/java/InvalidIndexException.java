package main.java;

public class InvalidIndexException extends RuntimeException {

    public InvalidIndexException(int index) {
        super("Invalid index: " + index);
    }
}
