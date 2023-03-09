package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String finalWord = scan.nextLine();
        while(!finalWord.equals("END")){
            int number = Integer.parseInt(finalWord);
            System.out.println(isPalindrome(number));
            finalWord = scan.nextLine();
        }

    }
    public static boolean isPalindrome (int number) {
        String rotatedNumber = "";
        String numberOfString = String.valueOf(number);
        while (number > 0) {
            rotatedNumber +=String.valueOf(number % 10);
            number = number / 10;
        }
        if (numberOfString.equals(rotatedNumber)) {
            return true;
        } else {
            return false;
        }
    }
}
