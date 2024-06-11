package core.programming.datastructures.sorting;

import java.util.Arrays;

public class Sortings {
    public static void main(String[] args) {
        int[] array = { 8, 5, 2, 9, 5, 6, 3 };
        int[] arrayq = new int[array.length];

        int[] arraySelection = array;
        arrayq = selectionSort(arraySelection);
//        for (int i = 0; i < arrayq.length; i++) {
//            System.out.println(arrayq[i]);
//        }
        System.out.println(Arrays.toString(arrayq));
        System.out.println("------------------------------------");
        int[] arrayInsertion = { 8, 5, 2, 9, 5, 6, 3 };
        arrayq = insertionSort(arrayInsertion);
//        for (int i = 0; i < arrayq.length; i++) {
//            System.out.println(arrayq[i]);
//        }
        System.out.println(Arrays.toString(arrayq));
        System.out.println("------------------------------------");

        int[] arrayBubble = { 8, 5, 2, 9, 5, 6, 3 };
        arrayq = bubbleSort(arrayBubble);
//        for (int i = 0; i < arrayq.length; i++) {
//            System.out.println(arrayq[i]);
//        }
        System.out.println("way 1 :" +Arrays.toString(arrayq));

        int[] myArray = {4, 2, 6, 5, 1, 3};
        bubbleSort1(myArray);
        System.out.println("way 2 :" + Arrays.toString(myArray));
        System.out.println("------------------------------------");
    }

    /**
     * Time O(n^2)
     *
     * Space O(1)
     *
     * trick :wf_fix_counter_issorted in each iteration one max will be at fixed
     * location like 1st iteration max will be goto n-1 location; like 2nd iteration
     * max-1 will be goto n-2 location; If Array sorted already then time is O(n)
     *
     * @param array
     * @return
     */
    private static int[] bubbleSort(int[] array) {
        System.out.println("**** Bubble Sort **** ");
        int counter = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (array.length - 1 - counter); i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i + 1, i);
                    isSorted = false;
                }
            }
            counter += 1;
        }
        return array;
    }

    /**
     * Time O(n^2)
     *
     * Space O(1)
     *
     * Hack is fw in each iternation suppose kth trans compare in 1 to k-1 and set
     * If Array sorted already then time is O(n)
     *
     * @param array
     * @return
     */
    private static int[] insertionSort(int[] array) {
        System.out.println("**** insertionSort **** ");
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                --j;
            }
            System.out.println("in -- " + Arrays.toString(array));
        }
        return array;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    /**
     * Time O(n^2)
     *
     * Space O(1)
     *
     * Hack:wf
     *
     * 1. k-1 is stored for kth node and k- (n-1) will be unsorted.
     *
     * 2. find min element and swap with current index
     *
     * @param array
     * @return
     */
    private static int[] selectionSort(int[] array) {
        System.out.println("**** Selection Sort **** ");
        int currentIndex = 0;
        while (currentIndex < (array.length - 1)) {
            int minIndex = currentIndex;
            for (int i = currentIndex + 1; i < array.length; i++) {
                if (array[minIndex] > array[i]) {
                    minIndex = i;
                }
            }
            swap(array, minIndex, currentIndex);
            System.out.println("in minI["+minIndex+"]-- " + Arrays.toString(array));
            currentIndex += 1;
        }
        return array;
    }

    public static void bubbleSort1(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j+1);
                }
            }

        }
    }
}
