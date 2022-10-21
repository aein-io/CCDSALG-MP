import java.util.*;

public class Driver {

    public static void testInsertion(int Size, int numTests, final String chars) {
        InsertionSort insertionSort = new InsertionSort();

        String[] testArray = new String[numTests];

        for (int i = 0; i < numTests; i++) {
                testArray[i] = StringRandomizer.Generate(Size, chars);

                // print all the strings
                System.out.println(testArray[i]);
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
//                System.out.println(left + ": " + sArray[left]);
                left++;
            }

            startTime = System.nanoTime();
            insertionSort.insertionSort(sArray, suffixArray);
            endTime = System.nanoTime();

            System.out.println("TEST " + i);
            for(String s : sArray) {
                System.out.println(s);
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

        MergeSort mergeSort = new MergeSort();

        String[] testArray = new String[numTests];

        for (int i = 0; i < numTests; i++) {
            testArray[i] = StringRandomizer.Generate(Size, chars);

            // print all the strings
            System.out.println(testArray[i]);
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
//                System.out.println(left + ": " + sArray[left]);
                left++;
            }

            startTime = System.nanoTime();
            mergeSort.mergeSort(sArray, 0, sArray.length - 1, suffixArray);
            endTime = System.nanoTime();

            System.out.println("TEST " + i);
            for(String s : sArray) {
                System.out.println(s);
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

    public static void main (String[] args) {

        testInsertion(128, 10, "acgt");
        testMergeSort(128, 10, "acgt");

//        Scanner scanner = new Scanner(System.in);
//
//        String input;
//
//        System.out.print("Input string: ");
//        input = StringRandomizer.Generate(1024, "acgt");
//
//        // Generate Substrings
//        int left = 0;
//        int end = input.length();
//        String[] sArray = new String[end];
//        String[] values = new String[end];
//        int[] suffixArray = new int[sArray.length];
//
//        System.out.println();
//        System.out.println("Suffix Array:");
//
//        while (left < end) {
//            sArray[left] = input.substring(left, end);
//            System.out.println(left + ": " + sArray[left]);
//            left++;
//        }
//
//        // Modified Insertion Sort
//        InsertionSort InsertionSort = new InsertionSort();
//
//        long startTime = System.nanoTime();
//
//        InsertionSort.insertionSort(sArray, suffixArray);
//
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        System.out.println("Insertion Sort Time: " + duration/1000000 + "ms");
//
//        System.out.println();
//        System.out.println("Insertion Sort:");
//
//        for (int i = 0; i < sArray.length; i++) {
//            System.out.println(suffixArray[i] +": "+ sArray[i]);
//        }

        // Modified Merge Sort
//        left = 0;
//
//        while (left < end){
//            values[left] = input.substring(left, end);
//            left++;
//        }
//        left = 0;

//        MergeSort MergeSort = new MergeSort();
//        long startTime = System.nanoTime();
//
//        MergeSort.mergeSort(sArray, 0, sArray.length - 1, suffixArray);
//
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        System.out.println(duration/1000000.0 + " ms");








        // print all elements of kvp




//        MergeSort.mergeSort(kvp, 0, sArray.length - 1);


//        System.out.println();
//        System.out.println("Merge Sort:");
//        for (int p = 0; p < sArray.length; p++) {
//            System.out.println(suffixArray[p] +": "+ values[p]);
//        }

        System.out.println(System.nanoTime() / 1000000);
    }
}
