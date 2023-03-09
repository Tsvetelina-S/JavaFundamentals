package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = Integer.parseInt(scan.nextLine());
        long number2 = Integer.parseInt(scan.nextLine());
        double result = ((double)factorial(number) / factorial(number2));
        System.out.printf("%.2f",result);

    }
    public static long factorial (long num) {
        for (long i = num - 1; i >= 1; i--) {
            num *= i;
        }
        return num;
    }
}
