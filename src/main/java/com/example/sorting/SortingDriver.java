package com.example.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingDriver {

    public static void main(String[] args) {

        // Generate array of random Integers
        Integer[] arr = IntStream.generate(() -> (int) (Math.random() * 5000))
                                 .boxed()
                                 .limit(100)
                                 .toArray(Integer[]::new);

        printFirstTenOfArray(arr);

        Integer[] copy1 = copyArray(arr);
        Integer[] copy2 = copyArray(arr);

        System.out.println("\nGnome Sort...");
        SortingUtility.gnomeSort(copy1);
        printFirstTenOfArray(copy1);

        System.out.println("\nGnomier Sort...");
        SortingUtility.gnomierSort(copy2);
        printFirstTenOfArray(copy2);

    }

    private static <T> void printFirstTenOfArray(T[] obj) {

        if (obj != null) {

            int counter = 1;
            System.out.println("\nFirst 10 of Array...");

            for (T i : obj) {
                System.out.println(counter + ": " + i.toString());

                if (counter >= 10) {
                    break;
                }
                counter++;
            }

        } else {
            System.out.println("Array is null.");
        }
    }

    private static <T> T[] copyArray(T[] obj) {

        T[] copy = (T[]) Arrays.copyOf(obj, obj.length);

        return copy;
    }

}
/*
First 10 of Array...
1: 1178
2: 4104
3: 444
4: 4821
5: 4690
6: 4181
7: 1164
8: 2656
9: 4381
10: 290

Gnome Sort...

First 10 of Array...
1: 38
2: 65
3: 91
4: 135
5: 246
6: 250
7: 266
8: 290
9: 444
10: 493

Gnomier Sort...

First 10 of Array...
1: 38
2: 65
3: 91
4: 135
5: 246
6: 250
7: 266
8: 290
9: 444
10: 493
 */
