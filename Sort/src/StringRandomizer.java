public class StringRandomizer{

    public static String Generate(int length, String chars){
        int lowerBound = 0;
        int upperBound = chars.length();
        String result = "";
        for(int i = 0; i < length; i++){
            result += chars.charAt((int)(Math.random() * (upperBound - lowerBound)) + lowerBound);
        }
        return result;
    }
}


