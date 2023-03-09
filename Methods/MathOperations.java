package Methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        char operator = scan.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scan.nextLine());
        if(operator == 42){
            System.out.println(multiplication(firstNum,secondNum));
        }else if(operator == 47){
            System.out.println(division(firstNum,secondNum));
        }else if(operator == 45) {
            System.out.println(sumtraction(firstNum,secondNum));
        }else if(operator == 43){
            System.out.println(addition(firstNum,secondNum));
        }

    }
    public static int multiplication (int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    public static int division (int num1, int num2){
        int result = num1 / num2;
        return result;
    }
    public static int sumtraction (int num1, int num2){
        int result = num1 - num2;
        return result;
    }
    public static int addition (int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}
