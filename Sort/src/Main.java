import java.util.*;

public class Main {
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
        Modified.Sort(sArray);

        System.out.println();
        System.out.println("Sorted Array");

        for (int i = 0; i < end; i++) {
            System.out.println(left + ": " + sArray[i]);
            i++;
        }

        // Modified Merge Sort

    }
}