package test.java;
import main.java.*;

public class TestSort {

    public static int testNum = 1;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println("\n============================================================");
        System.out.println("Test of Stack");
        System.out.println("============================================================");
        testSortString();
        testSortInteger();
        testExceptions();
        System.out.println("------------------------------------------------------------");
        System.out.println("Done ...");
        System.out.println("============================================================");
    }

    private static void testSortString() {
        System.out.println("Tests String sorting");
        System.out.println("------------------------------------------------------------");
        LinkedList<String> list = new LinkedList<>();
        MergeSort<String> mergeSort = new MergeSort<>();
        for (int i = 9; i >= 0; i--) {
            list.addItem("str" + i);
        }
        int append = 9;
        String expectedStr;
        for (int i = 0; i < list.getSize(); i++) {
            expectedStr = "str" + append;
            if (list.getItem(i).equals(expectedStr)) {
                System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
            }
            append--;
            testNum++;
        }

        mergeSort.sort(list);

        for (int i = 0; i < list.getSize(); i++) {
            expectedStr = "str" + i;
            if (list.getItem(i).equals(expectedStr)) {
                System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
            }
            append--;
            testNum++;
        }
    }

    private static void testSortInteger() {
        System.out.println("Tests Integer sorting");
        System.out.println("------------------------------------------------------------");
        LinkedList<Integer> list = new LinkedList<>();
        MergeSort<Integer> mergeSort = new MergeSort<>();
        for (int i = 9; i >= 0; i--) {
            list.addItem(i);
        }
        int expectedInt = 9;
        for (int i = 0; i < list.getSize(); i++) {
            if (list.getItem(i).equals(expectedInt)) {
                System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
            }
            expectedInt--;
            testNum++;
        }

        mergeSort.sort(list);

        for (int i = 0; i < list.getSize(); i++) {
            if (list.getItem(i).equals(i)) {
                System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
            }
            testNum++;
        }
    }

    private static void testExceptions() {
        System.out.println("Tests EmptyListException");
        System.out.println("------------------------------------------------------------");
        LinkedList<Integer> list = new LinkedList<>();
        MergeSort<Integer> mergeSort = new MergeSort<>();
        try {
            mergeSort.sort(list);
            System.out.println(ANSI_RED + "Test" + testNum + " FAILED ..." + ANSI_RESET);
        } catch (EmptyListException e) {
            System.out.println(ANSI_GREEN + "Test" + testNum + " PASSED ..." + ANSI_RESET);
        }
    }
}
