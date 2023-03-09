package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printIntegerNumber(n);
    }
    public static void printIntegerNumber(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if(number < 0){
            System.out.printf("The number %d is negative.", number);
        }else{
            System.out.printf("The number %d is zero.",number);
        }
    }
}
