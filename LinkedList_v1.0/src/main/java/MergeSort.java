package main.java;

public class MergeSort<T extends Comparable<T>> {

    private static final boolean ACTIVE = false;
    private static int recNum = 1;
    private Debugger dev = new Debugger(ACTIVE);


    private LinkedList<T> list;
    private T[] helper;

    public void sort(LinkedList<T> list) {
        if (list.isEmpty()) {
            throw new EmptyListException();
        }
        this.list = list;
        int size = list.getSize();
        this.helper = (T[]) new Comparable[size];
        mergeSort(0, size - 1);
    }

    public void mergeSort(int min, int max) {
        if (min < max) {
            int middle = min + (max-min) / 2;
            mergeSort(min, middle);
            mergeSort(middle+1, max);
            merge(min, middle, max);
        }
    }

    public void merge(int min, int middle, int max) {
        for (int i = min; i <= max; i++) {
            helper[i] = list.getItem(i);
        }
        dev.log(3, "helper recursion " + recNum + ":\n" + printHelper());
        recNum++;
        int i = min;
        int j = middle + 1;
        int k = min;
        while (i <= middle && j <= max) {
            if (helper[i].compareTo(helper[j]) <= 0) {

                list.replaceItem(k, helper[i]);
                i++;
            } else {

                list.replaceItem(k, helper[j]);
                j++;
            }
            k++;
        }
        while (i <= middle) {
            list.replaceItem(k, helper[i]);
            i++;
            k++;
        }
    }

    private String printHelper() {
        String str1 = "";
        for (int i = 0; i < helper.length; i++) {
            str1 += " " + helper[i];
        }
        return str1;
    }

    private void printList() {
        list.showItems();
    }
}
