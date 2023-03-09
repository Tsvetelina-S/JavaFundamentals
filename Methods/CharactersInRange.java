package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char firstChar = scan.nextLine().charAt(0);
        char secondChar = scan.nextLine().charAt(0);
        charactersInRange(firstChar,secondChar);
    }
    public static void charactersInRange (char one, char two){
        if(one > two){
            for (int i =two + 1; i < one  ; i++) {
                System.out.print((char) i + " ");
            }
        }else {
            for (int i = one +1; i < two; i++){
                System.out.print((char)i + " ");
            }
        }
    }
}
