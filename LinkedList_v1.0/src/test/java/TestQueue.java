package test.java;
import main.java.Queue;
import main.java.InvalidIndexException;
import main.java.EmptyListException;

public class TestQueue {

    public static int testNum = 1;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println("\n============================================================");
        System.out.println("Test of Queue");
        System.out.println("============================================================");
        testOneItem();
        testMultipleItems();
        testExceptions();
        System.out.println("------------------------------------------------------------");
        System.out.println("Done ...");
        System.out.println("============================================================");
    }

    public static void testOneItem() {

        boolean testOk;
        int expectedInt = 9;
        double expectedFloat = 3.14;
        String expectedStr = "testString";

        System.out.println("Tests adding, replacing and removing one element:");
        System.out.println("------------------------------------------------------------");
        Queue<Integer> intList = new Queue<>();
        Queue<Double> doubleList = new Queue<>();
        Queue<String> stringList = new Queue<>();


        intList.enqueue(expectedInt);
        doubleList.enqueue(expectedFloat);
        stringList.enqueue(expectedStr);

        if (intList.getItem(0).equals(expectedInt)) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (doubleList.getItem(0).equals(expectedFloat)) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (stringList.getItem(0).equals(expectedStr)) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;

        intList.dequeue();
        doubleList.dequeue();
        stringList.dequeue();

        if (intList.getSize() == 0) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (doubleList.getSize() == 0) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (stringList.getSize() == 0) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;

        intList.enqueue(expectedInt);
        doubleList.enqueue(expectedFloat);
        stringList.enqueue(expectedStr);

        if (intList.getSize() == 1) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (doubleList.getSize() == 1) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (stringList.getSize() == 1) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;

        intList.dequeue();
        doubleList.dequeue();
        stringList.dequeue();

        if (intList.getSize() == 0) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (doubleList.getSize() == 0) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (stringList.getSize() == 0) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        System.out.println("------------------------------------------------------------");
    }

    public static void testMultipleItems() {

        Queue<Integer> list = new Queue<>();
        int expectedInt = 5;

        System.out.println("Tests adding, replacing and removing multiple elements:");
        System.out.println("------------------------------------------------------------");
        for (int num = 0; num < 10; num++) {
            list.enqueue(expectedInt);
            expectedInt++;
        }
        if (list.getSize() == 10) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;

        list.enqueue(100);
        list.enqueue(200);
        list.enqueue(300);

        if (list.getItem(10) == 100) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (list.getItem(11) == 200) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (list.getItem(12) == 300) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;

        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        if (list.getSize() == 8) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        int elem = 10;
        for (int i = 0; i < 5; i++) {
            if (list.getItem(i) == elem) {
                System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
            }
            testNum++;
            elem++;
        }
    }

    private static void testExceptions() {

        Queue<Integer> list = new Queue<>();

        System.out.println("Tests InvalidIndexException and EmptyListException:");
        System.out.println("------------------------------------------------------------");
        try {
            list.removeItem();
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (UnsupportedOperationException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;
        try {
            list.removeItem(0);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (UnsupportedOperationException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;
        try {
            list.removeItem(1);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (UnsupportedOperationException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;
        try {
            list.getItem(0);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (EmptyListException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;
        try {
            list.replaceItem(0, 0);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (UnsupportedOperationException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;

        list.enqueue(100);

        try {
            list.removeItem(4);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (UnsupportedOperationException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;
        try {
            list.replaceItem(2, 2);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (UnsupportedOperationException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;
        try {
            list.getItem(4);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (InvalidIndexException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
    }
}
