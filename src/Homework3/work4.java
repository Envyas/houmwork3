package Homework3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class work4 {
    public static void main(String[] args) {
        String user;
        int index = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("введите слова");
        user = in.nextLine();
        String[] words = user.split("\\s+");
        Arrays.sort(words);
        String last = "";
        int count = 0;
        for (String word1 : words) {
            index++;
            if (last.isEmpty()) {
                last = word1;
            }
            count++;
            if (!word1.equals(last)) {
                outp(--count, last);
                count = 1;
                last = word1;
            }
            if (words.length == index) {
                outp(count, word1);
            }
        }
    }public static void outp(int count, String word1) {
        System.out.println(word1 + " is " +  count + "wer");
    }
}