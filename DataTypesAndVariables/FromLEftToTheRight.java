package DataTypesAndVariables;

import java.util.Scanner;

public class FromLEftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=n ; i++) {
            long first = scan.nextLong();
            long second = scan.nextLong();
            if(first > second){
                sum(first);
            }else {
                sum(second);
            }
        }
    }
    public static void sum (long number){
        if(number < 0){
            number = Math.abs(number);
        }
        long another = number;
        long sum = 0;
        while (number > 0){
            another = number % 10;
            sum += another;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
