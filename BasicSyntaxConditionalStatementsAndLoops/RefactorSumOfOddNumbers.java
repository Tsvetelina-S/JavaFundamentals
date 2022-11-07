package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d%n", i);
                sum += i;
            } else {
                n += 1;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
