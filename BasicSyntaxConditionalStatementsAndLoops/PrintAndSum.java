package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int number = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = number; i <= number2 ; i++) {
            System.out.printf("%d ",i);
            sum += i;
        }
        System.out.printf("%nSum: %d",sum);
    }
}
