package com.java.datastructure.search;

/**
 * This is also called linear search, this can be applied to unsorted array
 * elements
 */
public class SequentialSearch {

    public static void main(String[] args) {

        int a[] = { 10, 20, 5, 12, 30, 40, 34, 39, 55, 53 };
        int searchElement = 34;
        int searchIndex = linearSearch(a, searchElement);
        if (searchElement == -1) {
            System.out.println("Search element not found in the given array");
        } else {
            System.out.println("Search element found in the array index at " + searchIndex);
        }

    }

    private static int linearSearch(int[] a, int searchElement) {
        int size = a.length;

        for (int i = 0; i < size; i++) {
            if (a[i] == searchElement) {
                return i;
            }
        }

        return -1;
    }

}
