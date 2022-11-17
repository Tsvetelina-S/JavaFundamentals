package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int number = Integer.parseInt(scan.nextLine());
        int rightOne = number;
        int number1 = 0;
        int result = 1;
        int count = 0;
        while (number != 0){
            number1= number % 10;
            for (int i = 1; i <=number1 ; i++) {
                result *= i ;

            }

            count += result;
            result = 1;
            number = number/10;
        }
        if (count == rightOne){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
