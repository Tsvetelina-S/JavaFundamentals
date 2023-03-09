package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String type = scan.nextLine();

        switch (type){
            case "int":
                int firstNum = Integer.parseInt(scan.nextLine());
                int secondNum = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(firstNum,secondNum));
                break;
            case "char":
                char firstChar = scan.nextLine().charAt(0);
                char secondChar = scan.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secondChar));
                break;
            case "string":
                String firstText = scan.nextLine();
                String secondText = scan.nextLine();
                System.out.println(getMax(firstText,secondText));
        }

    }
    public static int getMax (int num1,int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static char getMax (char element1, char element2){
        if(element1 > element2){
            return element1;
        }else{
            return element2;
        }
    }
    public static String getMax (String text1, String text2){
        String maxText ="";
        if (text1.compareTo(text2) > 0){
            maxText = text1;
        }else{
            maxText = text2;
        }
        return maxText;
    }
}
