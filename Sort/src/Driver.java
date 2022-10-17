import java.util.*;

public class Driver {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        System.out.print("Input string: ");
        input = scanner.nextLine();

        // Generate Substrings
        int left = 0;
        int end = input.length();
        String[] sArray = new String[end];

        System.out.println();
        System.out.println("Suffix Array");

        while (left < end) {
            sArray[left] = input.substring(left, end);
            System.out.println(left + ": " + sArray[left]);
            left++;
        }

        // Modified Insertion Sort
        InsertionSort Modified = new InsertionSort();

        int[] suffixArray = new int[sArray.length];
        Modified.Sort(sArray, suffixArray);

        System.out.println();
        System.out.println("Insertion Sort");

        for (int i = 0; i < sArray.length; i++) {
            System.out.println(suffixArray[i] +": "+ sArray[i]);
        }

        // Modified Merge Sort
        MergeSort Modified= new MergeSort();
        
        String [] suffixArray2=new String[sArray.length];
        Modified.mergeSort(suffixArray2,0,suffixArray2.length-1);
        
        System.out.println();
        System.out.println("Merge Sort");
        
        for (int i = 0; i < sArray.length; i++) {
        System.out.println(suffixArray[i] +": "+ sArray[i]);
        }
        
        
        
        
    }
}
