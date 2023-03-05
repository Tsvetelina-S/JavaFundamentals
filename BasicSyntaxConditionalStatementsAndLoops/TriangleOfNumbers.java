package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int row = 1; row <= number; row++) {
            for (int l = 1; l <= row; l++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
