package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int multiplier = Integer.parseInt(scan.nextLine());
        int counter = Integer.parseInt(scan.nextLine());
        do{
            System.out.printf("%d X %d = %d%n",multiplier,counter,(multiplier*counter));
            counter++;
        }while (counter < 11);
    }
}
