package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 0;
        int sum = 0;
        while (n>0){
            num = n;
            sum += num % 10;
            n = num /10;
        }
        System.out.println(sum);
    }
}
