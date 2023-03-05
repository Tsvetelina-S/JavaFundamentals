package DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= lines ; i++) {
            char letter = scan.nextLine().charAt(0);
            sum += (int)letter;
        }

        System.out.printf("The sum equals: %d",sum);
    }
}
