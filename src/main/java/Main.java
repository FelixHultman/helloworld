import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        String s = "Hejaaaaaaaaaaa";
        System.out.println(letterCounter(s));

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

}



