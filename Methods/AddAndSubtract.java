package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstInt = Integer.parseInt(scan.nextLine());
        int secondInt = Integer.parseInt(scan.nextLine());
        int thirdInt = Integer.parseInt(scan.nextLine());

        int sum = sum(firstInt,secondInt);
        System.out.println(sum-thirdInt);

    }
    public static int sum (int first, int second){
        int sum = first + second;
        return sum;
    }
}
