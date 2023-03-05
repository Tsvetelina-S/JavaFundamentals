package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbersOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 0;
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            if ( i == 5 || i == 7) {
                System.out.printf("%d -> True%n", i);
            } else if (i < 10) {
                System.out.printf("%d -> False%n", i);
            }else{
                num = i;
                while (num > 0){
                    sum += num % 10;
                    num = num /10;
                }
                if (sum == 5 || sum == 7 || sum == 11){
                    System.out.printf("%d -> True%n", i);
                }else{
                    System.out.printf("%d -> False%n", i);
                }
                sum = 0;
            }
        }

    }
}
