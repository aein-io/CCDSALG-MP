// Note: This file is incomplete!
public class InsertionSort {
    public boolean CompareString (String str1, String str2) {
        int determiner = 0;
        int len1 = str1.length();
        int len2 = str2.length();
        int limit = Math.min(len1, len2);

        for(int i = 0; i < limit; i++){
            int char1 = str1.charAt(i);
            int char2 = str2.charAt(i);

            if(char1 != char2) {
                // failure case, str 1 is less than str 2
                determiner = char1 - char2;
                return determiner < 0;
            }
        }

        if(len1 != len2)
            determiner = len1-len2;

        return determiner < 0;
    }

    public int[] Sort(String[] sArray, int[] indexArray) {
        int len = sArray.length;
        for (int i = 0; i < indexArray.length; i++) {
            indexArray[i] = i;
        }
        for (int i = 1; i < len; i++) {
            String key = sArray[i];
            int indexKey = indexArray[i];
            int j = i - 1;

            while (j >= 0 && CompareString(key, sArray[j])) {
                sArray[j + 1] = sArray[j];
                indexArray[j + 1] = indexArray[j];
                j = j - 1;
            }
            sArray[j + 1] = key;
            indexArray[j + 1] = indexKey;
        }
        return indexArray;
    }
}