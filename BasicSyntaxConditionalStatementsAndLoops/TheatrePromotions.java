package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String day = scan.nextLine();
        boolean isTrue = false;
        int price =0;
        int age = Integer.parseInt(scan.nextLine());
        if(day.equals("Weekday")){
            if(age <= 18 && age >= 0){
                price= 12;
            }
            else if (age > 18 && age <= 64){
                price= 18;
            }
            else if(age > 64 && age <= 122){
                price= 12;
            }else{
                isTrue = true;
                System.out.println("Error!");
            }
        }
        if(day.equals("Weekend")){
            if(age <= 18 && age >= 0){
                price= 15;
            }
            else if(age > 18 && age <= 64){
                price= 20;
            }
            else if(age > 64 && age <= 122){
                price= 15;
            }else{
                isTrue = true;
                System.out.println("Error!");
            }

        }
        if(day.equals("Holiday")){
            if(age <= 18 && age >= 0){
                price= 5;
            }
            else if(age > 18 && age <= 64){
                price= 12;
            }
            else if(age > 64 && age <= 122){
                price= 10;
            }else{
                isTrue = true;
                System.out.println("Error!");
            }

        }
        if(!isTrue){
            System.out.printf("%d$",price);
        }
    }
}
