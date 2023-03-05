package DataTypesAndVariables;

import java.util.Scanner;

public class ReverseChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char three = scan.nextLine().charAt(0);
        char two = scan.nextLine().charAt(0);
        char one = scan.nextLine().charAt(0);
        System.out.printf("%s %s %s",one,two,three);
    }
}
