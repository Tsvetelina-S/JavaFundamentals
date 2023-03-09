package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase();
        vowelsCount(word);
    }
    public static void vowelsCount (String text){
        int count = 0;
        for (int i = 0; i < text.length() ; i++) {
            char symbol = text.charAt(i);
            if(symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
