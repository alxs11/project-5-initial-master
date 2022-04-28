package com.example.sorting;

public class SortingUtility {

    /**
     * Part A Gnome Sort Algorithm
     * <p>
     * Implement gnome sort per this pseudocode.
     * <p>
     * <pre>
     *    method gnomeSort(a[])
     *       pos = 0
     *       while pos < length(a)
     *          if (pos == 0 or a[pos] >= a[pos-1])
     *          pos = pos + 1
     *       else
     *          swap a[pos] and a[pos-1]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        // TODO implement pseudocode above

        int pos = 0;

        while (pos < data.length) {
            if (pos == 0 || data[pos].compareTo(data[pos - 1]) >= 0){
                pos = pos + 1;
            }
            else {
                T temp = data[pos-1];
                data[pos - 1] = data[pos];
                data[pos] = temp;
                pos = pos - 1;
            }

        }


    }

    /**
     * Part B Optimized Gnome Sort Algorithm.
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[])
     *       for pos in 1 to length(a)
     *       gnomierSort(a, pos)
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */

    public static <T extends Comparable<T>> void gnomierSort(T[] data) {

        // TODO implement pseudocode above

        for(int pos = 1; pos < data.length; pos++)

        gnomierSort(data, pos);

    }

    /**
     * Part C Optimized Gnome Sort Algorithm
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[], upperBound)
     *       pos = upperBound
     *       while pos > 0 and a[pos-1] > a[pos]
     *          swap a[pos-1] and a[pos]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     */

    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {

        // TODO implement pseudocode above

        int pos = upperBound;

        while (pos > 0 && data[pos-1].compareTo(data[pos]) > 0) {
            T temp = data[pos-1];
            data[pos - 1] = data[pos];
            data[pos] = temp;
            pos = pos - 1;
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





