package com.java.datastructure.search;

public class BinarySearch {

    public static void main(String[] args) {

        int elementArr[] = { 10, 20, 30, 40, 50, 60, 65, 67, 70 };
        int searchElement = 8;
        int start = 0;
        int end = elementArr.length;

        int searchIndex = binarySearch(start, end, elementArr, searchElement);
        if (searchIndex == -1) {
            System.out.println("Search element not found in the given array ");
        } else {
            System.out.println("Search element found in the position " + searchIndex);
        }
    }

    private static int binarySearch(int start, int end, int[] elementArr, int searchElement) {

        if (end >= start && start <= elementArr.length - 1) {
            int mid = start + (end - start) / 2;

            if (elementArr[mid] == searchElement) {
                System.out.println("Found in position " + mid);
                return mid;
            }
            if (searchElement > elementArr[mid]) {
                return binarySearch(mid + 1, elementArr.length, elementArr, searchElement);
            }
            if (searchElement < elementArr[mid]) {
                return binarySearch(start, mid - 1, elementArr, searchElement);
            }
        }

        return -1;
    }

}
