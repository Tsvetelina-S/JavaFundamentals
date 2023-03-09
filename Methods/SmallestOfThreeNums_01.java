package Methods;

import java.util.Scanner;

public class SmallestOfThreeNums_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());
        smallestNum(firstNum,secondNum,thirdNum);
    }

    public static void smallestNum(int num1, int num2, int num3) {
        if(num1 <= num2 && num1 <= num3){
            System.out.println(num1);
        }else if(num2 <= num1 && num2 <= num3){
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
    }
}
