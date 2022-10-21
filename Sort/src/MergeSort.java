// Merge sort coding implementation
public class MergeSort {

    public void mergeSort(String[] strings, int left, int right, int[] suffixArray) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(strings, left, middle, suffixArray);
            mergeSort(strings, middle + 1, right, suffixArray);
            merge(strings, left, middle, right, suffixArray);
        }
    }

    public void merge(String[] a, int left, int mid, int right, int[] suffixArray) {
        int n = right - left + 1;
        String[] b = new String[n];
        int i1 = left;
        int i2 = mid + 1;
        int j = 0;

        while (i1 <= mid && i2 <= right) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                suffixArray[j] = i1;
                i1++;
            } else {
                b[j] = a[i2];
                suffixArray[j] = i2;
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = a[i1];
            suffixArray[j] = i1;
            i1++;
            j++;
        }

        while (i2 <= right) {
            b[j] = a[i2];
            suffixArray[j] = i2;
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[left + j] = b[j];
        }
    }
}

// merge method for mergeSort


// merge method for mergeSort
// keys must be swapp


//        // combine suffixes in SuffixArray
//        for (int x = 0; x < leftSuffixes.length; x++) {
//            SuffixArray[x] = leftSuffixes[x];
//        }
//        for (int y = 0; y < rightSuffixes.length; y++) {
//            SuffixArray[y + leftSuffixes.length] = rightSuffixes[y];
//        }


//    public void merge(String[] values, int[] suffixArray, int[] temp, int left, int mid, int right) {
//        int i = left;
//        int j = mid;
//        int k = left;
//
//        // Compares the two strings and swaps indices if applicable
//        // Updates the suffix array
//        while (i < mid && j < right) {
//            if (values[i].compareTo(values[j]) < 0) {
//                temp[k] = suffixArray[i];
//                values[k++] = values[i++];
//            } else {
//                temp[k] = suffixArray[j];
//                values[k++] = values[j++];
//            }
//        }
//
//        // Copies the remaining elements of the left array
//        while (i < mid) {
//            temp[k] = suffixArray[i];
//            values[k++] = values[i++];
//        }
//
//        // Copies the remaining elements of the right array
//        while (j < right) {
//            temp[k] = suffixArray[j];
//            values[k++] = values[j++];
//        }
//
//        // Copies the elements from the temp array to the suffix array
//        for (i = left; i < right; i++) {
//            suffixArray[i] = temp[i];
//        }
//    }

//    public void mergeSort(String[] values, int left, int right) {
//        if (left < right) {
//            int middle = (left + right) / 2;
//            mergeSort(values, left, middle);
//            mergeSort(values, middle + 1, right);
//            merge(values, left, middle, right);
//        }
//    }
//


