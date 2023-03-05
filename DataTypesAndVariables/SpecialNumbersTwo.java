package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbersTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int specialNum = 0;
        int sum = 0;
        boolean isSpecialNum = false;
        for (int i = 1; i <= number; i++) {
            sum = i;
            while (i > 0) {
                specialNum += i % 10;
                i = i / 10;
            }
            isSpecialNum = (specialNum == 5) || (specialNum == 7) || (specialNum == 11);
            if(isSpecialNum) {
                System.out.printf("%d -> True%n", sum);
            }else{
                System.out.printf("%d -> False%n", sum);
            }
            specialNum = 0;
            i = sum;

        }
    }
}
