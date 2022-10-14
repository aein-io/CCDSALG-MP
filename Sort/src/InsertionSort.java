// Note: This file is incomplete!
public class InsertionSort {
    public boolean CompareString (String str1, String str2) {
        int determiner = 0;
        int len1 = str1.length();
        int len2 = str2.length();
        int limit = Math.min(len1, len2);

        // iterates through the strings with the limit as the length
        for(int i = 0; i < limit; i++){
            int char1 = str1.charAt(i);
            int char2 = str2.charAt(i);

            if(char1 != char2) {
                // returns true if str1 < str 2
                determiner = char1 - char2;
                return determiner < 0;
            }
        }

        // for cases where the entire limit string is equal to str2
        // example: str1 = "lol"   str2 = "lolabc"
        if(len1 != len2)
            determiner = len1-len2;

        return determiner < 0;
    }

    public int[] Sort(String[] sArray, int[] suffixArray) {
        int len = sArray.length;

        // instantiates the suffix array with 0s
        for (int i = 0; i < suffixArray.length; i++) {
            suffixArray[i] = i;
        }


        for (int i = 1; i < len; i++) {
            String key = sArray[i];
            int suffixKey = suffixArray[i];
            int j = i - 1;

            // compare two strings together and swap indices if applicable
            // updates the suffix array
            while (j >= 0 && CompareString(key, sArray[j])) {
                sArray[j + 1] = sArray[j];
                suffixArray[j + 1] = suffixArray[j];
                j = j - 1;
            }
            sArray[j + 1] = key;
            suffixArray[j + 1] = suffixKey;
        }
        return suffixArray;
    }
}