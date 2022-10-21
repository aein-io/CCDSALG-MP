// Merge sort coding implementation
public class MergeSort {
    public void mergeSort(String[] a, int left, int right) {
        if (left == right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    public void merge(String[] a, int left, int mid, int right) {
        int n = right - left + 1;
        String[] b = new String[n];
        int i1 = left;
        int i2 = mid + 1;
        int j = 0;

        while (i1 <= mid && i2 <= right) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            }
            else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        while (i2 <= right) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[left + j] = b[j];
        }
    }
}


