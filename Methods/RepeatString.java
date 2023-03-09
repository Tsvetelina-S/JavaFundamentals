package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String symbols = scan.nextLine();
        int repetition = Integer.parseInt(scan.nextLine());
        System.out.println(text(symbols,repetition));
    }
    public static String text (String text,int num) {
        String word = "";

        for (int i = 1; i <= num; i++) {
            word += text;
        }
        return word;
    }
}
