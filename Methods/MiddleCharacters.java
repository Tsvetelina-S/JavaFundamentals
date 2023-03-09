package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String middleChar = scan.nextLine();
        middleCharacter(middleChar);

    }
    public static void middleCharacter (String word){

        if(word.length() % 2 != 0) {
            int midSymbol  = word.length()/2;
            System.out.println(word.charAt(midSymbol));
        }else{
            int firstMidSymbol = word.length()/2 -1;
            int secondMidSymbol = word.length()/2;
            System.out.println(word.charAt(firstMidSymbol) + "" + word.charAt(secondMidSymbol));

        }
    }
}
