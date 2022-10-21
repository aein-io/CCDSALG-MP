// Merge sort coding implementation
public class MergeSort {

 public     int ifCount;
  public  int midCount;
   public int mergeCount1;
    public int mergeCount2;



    public int mergeWhile;
    public int mergeif1;
    public int swapA1, swapA2, swapA3;
    public int swapB1, swapB2, swapB3;
    public int jIncrement;
    public int mergeWhile2;
    public int swapC1, swapC2, swapC3;

    public int swapD1, swapD2, swapD3;
    public int jIncrement2;
    public int mergeWhile3;

    public int lastFor;


    public int merging;

    public MergeSort(
        int ifCount,
        int midCount,
        int mergeCount1,
        int mergeCount2,
        int mergeWhile,
        int mergeif1,
        int swapA1,
        int swapA2,
        int swapA3,
        int swapB1,
        int swapB2,
        int swapB3,
        int jIncrement,
        int mergeWhile2,
        int swapC1,
        int swapC2,
        int swapC3,
        int jIncrement2,
        int mergeWhile3,
        int merging,
        int swapD1,
        int swapD2,
        int swapD3,
        int lastFor
    ) {
        this.ifCount = ifCount;
        this.midCount = midCount;
        this.mergeCount1 = mergeCount1;
        this.mergeCount2 = mergeCount2;
        this.mergeWhile = mergeWhile;
        this.mergeif1 = mergeif1;
        this.swapA1 = swapA1;
        this.swapA2 = swapA2;
        this.swapA3 = swapA3;
        this.swapB1 = swapB1;
        this.swapB2 = swapB2;
        this.swapB3 = swapB3;
        this.jIncrement = jIncrement;
        this.mergeWhile2 = mergeWhile2;
        this.swapC1 = swapC1;
        this.swapC2 = swapC2;
        this.swapC3 = swapC3;
        this.jIncrement2 = jIncrement2;
        this.mergeWhile3 = mergeWhile3;
        this.merging = merging;
        this.swapD1 = swapD1;
        this.swapD2 = swapD2;
        this.swapD3 = swapD3;
        this.lastFor = lastFor;

        this.swapD2 = 0;
    }


    public void mergeSort(String[] strings, int left, int right, int[] suffixArray) {
        ifCount++;
        if (left < right) {
            midCount++;

            int middle = (left + right) / 2;

            mergeCount1++;
            mergeSort(strings, left, middle, suffixArray);

            mergeCount2++;
            mergeSort(strings, middle + 1, right, suffixArray);

            merging++;
            merge(strings, left, middle, right, suffixArray);
        }
    }

    public void merge(String[] a, int left, int mid, int right, int[] suffixArray) {
        int n = right - left + 1;
        String[] b = new String[n];
        int i1 = left;
        int i2 = mid + 1;
        int j = 0;

        mergeWhile++;
        while (i1 <= mid && i2 <= right) {
            mergeif1++;
            if (a[i1].compareTo(a[i2]) < 0) {
                swapA1++;
                b[j] = a[i1];
                suffixArray[j] = i1;
                i1++;

            } else {
                swapB1++;
                b[j] = a[i2];
                suffixArray[j] = i2;
                i2++;
            }
            jIncrement++;
            j++;
        }

        mergeWhile2++;
        while (i1 <= mid) {
            swapC1++;
            b[j] = a[i1];
            suffixArray[j] = i1;
            i1++;
            j++;
        }

        mergeWhile3++;
        while (i2 <= right) {
            swapD1++;
            b[j] = a[i2];
            suffixArray[j] = i2;
            i2++;
            j++;
        }

        lastFor++;

        for (j = 0; j < n; j++) {
            swapD2++;
            a[left + j] = b[j];
        }
    }
}

