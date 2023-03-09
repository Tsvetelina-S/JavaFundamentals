package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        if(number <= 0){
            number = Math.abs(number);
        }
        System.out.println(evenAndOdds(number));
    }
    public static int evenAndOdds (int number) {
        int sumEven = 0;
        int sumOdd = 0;
        while (number > 0) {
            int number2 = number % 10;
            if (number2 % 2 == 0) {
                sumEven += number2;
            } else {
                sumOdd += number2;
            }
            number = number / 10;
        }
        return (sumEven*sumOdd);
    }
    public static int multiplication (int num1, int num2){
        int multiplicate = num1 * num2;
        return multiplicate;
    }
}
