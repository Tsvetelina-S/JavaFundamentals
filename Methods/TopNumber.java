package Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n ; i++) {
            if(divisibleByEight(i) && oddDigit(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean divisibleByEight (int number){
        int number1 = 0;
        while (number > 0){
            number1 += number % 10;
            number = number / 10;
        }
        if (number1 % 8 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean oddDigit (int number){
        int number1 = 0;
        while (number > 0){
            number1 = number % 10;//
            if(number1 % 2 != 0 ){
                return true;
            }else{
                number = number / 10;
            }
        }
        return false;
    }
}
