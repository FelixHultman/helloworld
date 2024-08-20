public class Main {

    public static void main(String[] args) {

        String s = "Hejaaaaaaaaaaa";
       /* System.out.println(letterCounter(s));

        System.out.println(wordCompareIgnoreCase("aA", "Aa"));

        System.out.println(reverse("hejsan"));*/

        boolean palin = isPalindrome("racecar");
        System.out.println(palin);

        System.out.println(trimZero("00000123456"));
        System.out.println(trimZero("000100"));
    }

    private static String trimZero(String number) {

        for (int i = 0; i <number.length() ; i++) {
            if(number.charAt(i)!='0'){
                return number.substring(i);
            }


        }
    return "";
    }

    private static boolean isPalindrome(String word) {
        return wordCompareIgnoreCase(word, reverse(word));
    }

    public static int letterCounter(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)== 'a') {
                count++;
            }

        }
        return count;
    }

    public static boolean wordCompareIgnoreCase(String word1, String word2) {
       return word1.equalsIgnoreCase(word2);

    }

    public static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}



