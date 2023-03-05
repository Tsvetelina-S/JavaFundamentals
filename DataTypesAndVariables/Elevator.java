package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int capacityOfElevator = Integer.parseInt(scan.nextLine());
        double result = Math.ceil((double)numberOfPeople/capacityOfElevator);
        System.out.printf("%.0f",result);
    }
}
