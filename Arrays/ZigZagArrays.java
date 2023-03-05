package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];
        String firstNum = " ";
        String secondNum = " ";
        for (int i = 0; i < n ; i++) {
            String[] num1 = scan.nextLine().split(" ");
            if (i % 2 != 0) {
                firstNum = num1[0];
                secondNum = num1[1];
            } else {
                firstNum = num1[1];
                secondNum = num1[0];

            }
            firstArr[i] = firstNum;
            secondArr[i] = secondNum;
        }
        for (String element2: secondArr){
            System.out.print(element2 + " ");
        }
        System.out.println();
        for (String element : firstArr){
            System.out.print(element + " ");
        }
    }
}
