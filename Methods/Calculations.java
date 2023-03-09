package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        if(word.equals("add")){
            add(num1,num2);
        }else if(word.equals("subtract")){
            subtract(num1,num2);
        }else if(word.equals("divide")){
            divide(num1,num2);
        }else if(word.equals("multiply")){
            multiply(num1,num2);
        }

    }
    public static void add (int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }
    public static void subtract (int firstNum,int secondNum){
        int result = firstNum - secondNum;
        System.out.println(result);
    }
    public static void multiply (int firstNum,int secondNum){
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void divide (double firstNum, int secondNum) {
        double result = firstNum/ secondNum;
        System.out.println(Math.round(result));
    }
}
