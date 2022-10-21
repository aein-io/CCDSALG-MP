import java.util.*;

public class Driver {

    public static void testInsertion(int Size, int numTests, final String chars) {
        InsertionSort insertionSort = new InsertionSort();

        String[] testArray = new String[numTests];

        System.out.println("Test String");
        for (int i = 0; i < numTests; i++) {
            testArray[i] = StringRandomizer.Generate(Size, chars);

//            // print all the strings
//            System.out.println(i + ": " + testArray[i]);
        }

        long startTime = 0;
        long endTime = 0;
        long totalTime = 0;
        long averageTime = 0;
        long[] times = new long[numTests];

        for (int i = 0; i < numTests; i++) {

            String input;
            input = testArray[i];

            // Generate Substrings
            int left = 0;
            int end = input.length();
            String[] sArray = new String[end];
            int[] suffixArray = new int[sArray.length];

            while (left < end) {
                sArray[left] = input.substring(left, end);
                System.out.println(left + ": " + sArray[left]);
                left++;
            }

            startTime = System.nanoTime();
            insertionSort.insertionSort(sArray, suffixArray);
            endTime = System.nanoTime();

            System.out.println("TEST " + i);
            for(int x = 0; x < sArray.length; x++) {
                System.out.println(suffixArray[x] + ": " + sArray[x]);
            }
            System.out.println();
            totalTime = endTime - startTime;
            times[i] = totalTime;

            averageTime += totalTime;
        }

        averageTime /= numTests;

        // print out the times
        for (int i = 0; i < numTests; i++) {
            System.out.println("test " + (i) +" : "+ times[i]/1000000.0 + " ms");
        }

        System.out.println("average time: " + averageTime/1000000.0 + " ms");
    }

    public static void testMergeSort(int Size, int numTests, final String chars) {

        MergeSort mergeSort = new MergeSort(
                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

        String[] testArray = new String[numTests];

        for (int i = 0; i < numTests; i++) {
            testArray[i] = StringRandomizer.Generate(Size, chars);

//            // print all the strings
//            System.out.println(i + ": " + testArray[i]);
        }

        long startTime = 0;
        long endTime = 0;
        long totalTime = 0;
        long averageTime = 0;
        long[] times = new long[numTests];

        for (int i = 0; i < numTests; i++) {

            String input;
            input = testArray[i];

            // Generate Substrings
            int left = 0;
            int end = input.length();
            String[] sArray = new String[end];
            int[] suffixArray = new int[sArray.length];

            while (left < end) {
                sArray[left] = input.substring(left, end);
                System.out.println(left + ": " + sArray[left]);
                left++;
            }

            startTime = System.nanoTime();
            mergeSort.mergeSort(sArray, 0, sArray.length - 1, suffixArray);
            endTime = System.nanoTime();

            System.out.println("TEST " + i);
            for(int x = 0; x < sArray.length; x++) {
                System.out.println(suffixArray[x] + ": " + sArray[x]);
            }
            System.out.println();

            totalTime = endTime - startTime;
            times[i] = totalTime;

            averageTime += totalTime;
        }

        averageTime /= numTests;

        // print out the times
        for (int i = 0; i < numTests; i++) {
            System.out.println("test " + (i) +" : "+ times[i]/1000000.0 + " ms");
        }

        System.out.println("average time: " + averageTime/1000000.0 + " ms");

        // print all counts
        System.out.println("Merge Sort ifCount: " + mergeSort.ifCount);
        System.out.println("Merge Sort midCount: " + mergeSort.midCount);
        System.out.println("Merge Sort mergeSort1: " + mergeSort.mergeCount1);
        System.out.println("Merge Sort mergeSort2: " + mergeSort.mergeCount2);
        System.out.println("Merge Sort mergeCount " + mergeSort.merging);
//
        System.out.println("MERGE COUNTS");
        System.out.println("Merge While Count: " + mergeSort.mergeWhile);
        System.out.println("ifCount: " + mergeSort.mergeif1);
        System.out.println("Swap A1: " + mergeSort.swapA1);
        System.out.println("Swap B1: " + mergeSort.swapB1);
        System.out.println("Swap jIncrement: " + mergeSort.jIncrement);
        System.out.println("Merge While Count2: " + mergeSort.mergeWhile2);
        System.out.println("Swap C1: " + mergeSort.swapC1);
        System.out.println("Merge While Count3: " + mergeSort.mergeWhile3);
        System.out.println("Swap D1: " + mergeSort.swapD1);
        System.out.println("LastforCount: " + mergeSort.lastFor);
        System.out.println("Swap D2: " + mergeSort.swapD2);
    }

    public static void main (String[] args) {

//        System.out.println("Insertion Sort:");
//        testInsertion(10, 1, "acgt");

        System.out.println("\nMerge Sort:");
        testMergeSort(10000, 1, "acgt");

    }
}
