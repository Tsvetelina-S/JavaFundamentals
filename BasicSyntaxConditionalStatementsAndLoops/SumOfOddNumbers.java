package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int sum =0;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n ; i++) {
            if(i % 2 != 0){
                System.out.println(i);
                sum +=i;
            }else{
                n += 1;
            }

        }
        System.out.println("Sum: " +sum);

    }
}
