package test.java;
import main.java.*;

public class TestList {

    public static int testNum = 1;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println("\n============================================================");
        System.out.println("Test of LinkedList");
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
        List<Integer> intList = new LinkedList<>();
        List<Double> doubleList = new LinkedList<>();
        LinkedList<String> stringList = new LinkedList<>();


        intList.addItem(expectedInt);
        doubleList.addItem(expectedFloat);
        stringList.addItem(expectedStr);

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


        expectedInt = 10;
        expectedFloat = 2.4142;
        expectedStr = "newString";
        intList.replaceItem(0, expectedInt);
        doubleList.replaceItem(0, expectedFloat);
        stringList.replaceItem(0, expectedStr);

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

        intList.removeItem();
        doubleList.removeItem();
        stringList.removeItem();

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

        intList.addItem(expectedInt);
        doubleList.addItem(expectedFloat);
        stringList.addItem(expectedStr);

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

        intList.removeItem(0);
        doubleList.removeItem(0);
        stringList.removeItem(0);

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

        LinkedList<Integer> list = new LinkedList<>();
        int expectedInt = 5;

        System.out.println("Tests adding, replacing and removing multiple elements:");
        System.out.println("------------------------------------------------------------");
        for (int num = 0; num < 10; num++) {
            list.addItem(num, expectedInt);
            expectedInt++;
        }
        if (list.getSize() == 10) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;

        list.addItem(0, 100);
        list.addItem(5, 200);
        list.addItem(10, 300);

        if (list.getItem(0) == 100) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (list.getItem(5) == 200) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (list.getItem(10) == 300) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;

        list.removeItem();
        list.removeItem(0);
        list.removeItem(3);
        list.removeItem(7);
        list.removeItem(list.getSize()-1);
        if (list.getSize() == 8) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        int elem = 6;
        for (int i = 0; i < 8; i++) {
            if (list.getItem(i) == elem) {
                System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
            }
            testNum++;
            elem++;
        }

        list.replaceItem(0, 0);
        list.replaceItem(5, 5);
        list.replaceItem(7, 7);
        if (list.getItem(0) == 0) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (list.getItem(5) == 5) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
        if (list.getItem(7) == 7) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        }
        testNum++;
    }

    public static void testExceptions() {

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Tests InvalidIndexException and EmptyListException:");
        System.out.println("------------------------------------------------------------");
        try {
            list.removeItem();
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (EmptyListException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;
        try {
            list.removeItem(0);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (EmptyListException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;
        try {
            list.removeItem(1);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (InvalidIndexException e) {
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
        } catch (EmptyListException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;

        list.addItem(100);

        try {
            list.removeItem(4);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (InvalidIndexException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
        testNum++;
        try {
            list.replaceItem(2, 2);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (InvalidIndexException e) {
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
