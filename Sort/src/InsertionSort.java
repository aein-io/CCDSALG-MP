// Note: This file is incomplete!
public class InsertionSort {

    public void Sort(String[] sArray) {
        int n = sArray.length;
        for (int i = 1; i < n; i++) {
            String key = sArray[i];
            int j = i - 1;

            while (j >= 0 && sArray[j].compareTo(key) > 0) {
                sArray[j + 1] = sArray[j];
                j = j - 1;
            }
            sArray[j + 1] = key;
        }
    }
}

/* public String CompareString (String String1, String String2) {
        int i = 0;
        int len1 = String1.length();
        int len2 = String2.length();
        String limit, compareString;

        if (len1 > len2) {
            limit = String2;
            compareString = String1;
        }

        else {
            limit = String2;
            compareString = String1;
        }

        for (i = 0; i < limit.length(); i++) {
            if (limit[i].compareTo(compareString[i])) {
                i++;
                return limit;
            }
            else {
                return compareString;
            }
        }

        return String1;
    } */