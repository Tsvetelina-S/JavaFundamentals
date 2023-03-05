package DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letter = scan.nextLine().charAt(0);
        if(letter>=97 && letter<=122){
            System.out.println("lower-case");
        }
        if(letter >=65 && letter <= 90){
            System.out.println("upper-case");
        }
    }
}
