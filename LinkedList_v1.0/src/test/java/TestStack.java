package test.java;
import main.java.Stack;
import main.java.InvalidIndexException;
import main.java.EmptyListException;

public class TestStack {

    public static int testNum = 1;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println("\n============================================================");
        System.out.println("Test of Stack");
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
        Stack<Integer> intList = new Stack<>();
        Stack<Double> doubleList = new Stack<>();
        Stack<String> stringList = new Stack<>();


        intList.push(expectedInt);
        doubleList.push(expectedFloat);
        stringList.push(expectedStr);

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

        intList.pop();
        doubleList.pop();
        stringList.pop();

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

        intList.push(expectedInt);
        doubleList.push(expectedFloat);
        stringList.push(expectedStr);

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

        intList.pop();
        doubleList.pop();
        stringList.pop();

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

        Stack<Integer> list = new Stack<>();
        int expectedInt = 5;

        System.out.println("Tests adding, replacing and removing multiple elements:");
        System.out.println("------------------------------------------------------------");
        for (int num = 0; num < 10; num++) {
            list.push(expectedInt);
            expectedInt++;
        }
        if (list.getSize() == 10) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;

        list.push(100);
        list.push(200);
        list.push(300);

        if (list.getItem(2) == 100) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (list.getItem(1) == 200) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (list.getItem(0) == 300) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;

        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        if (list.getSize() == 8) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        int elem = 12;
        for (int i = 0; i < 8; i++) {
            if (list.getItem(i) == elem) {
                System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
            }
            testNum++;
            elem--;
        }
    }

    private static void testExceptions() {

        Stack<Integer> list = new Stack<>();

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

        list.push(100);

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
