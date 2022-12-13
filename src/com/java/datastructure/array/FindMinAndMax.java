package com.java.datastructure.array;

public class FindMinAndMax {
    public static void main(String[] args) {

        Long a[] = { 3L, 4L, 2L, 6L, 10L, 22L, 100L, 300L, 78L, 99L, 1000L, 988L, 2L, 1L, 1008L };

        FindMinAndMax obj = new FindMinAndMax();

        MinAndMax result = obj.findMinAndMaxValues(a);

        System.out.println("Min value is " + result.min + ":Max values is :" + result.max);

    }

    class MinAndMax {
        Long min = 0L;
        Long max = 0L;

        MinAndMax(Long min, Long max) {
            this.min = min;
            this.max = max;
        }

    }

    private MinAndMax findMinAndMaxValues(Long arr[]) {
        Long min = arr[0], max = 0L;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new MinAndMax(min, max);
    }

}