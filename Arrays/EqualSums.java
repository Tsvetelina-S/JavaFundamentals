package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isFound = false;

        for (int i = 0; i < numbers.length ; i++) {
            int sumLeftNum = 0;
            int sumRightNum = 0;

            for (int j = 0; j < i ; j++) {
                sumLeftNum += numbers[j];
            }
            for (int k = i+1; k <= numbers.length-1; k++) {
                sumRightNum += numbers[k];

            }

            if (sumLeftNum == sumRightNum){
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(!isFound) {
            System.out.println("no");
        }
    }
}
