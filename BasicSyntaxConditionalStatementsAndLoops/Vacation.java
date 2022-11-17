package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int number = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double price = 0;
        if(day.equals("Friday")){
            if(type.equals("Students")){
                price = 8.45*number;
            }
            if(type.equals("Business") & number >= 100){
                price = 10.90*(number-10);
            }else if(type.equals("Business") & number < 100){
                price = 10.90 * number;
            }
            if(type.equals("Regular")){
                price = 15*number;
            }
        }
        if(day.equals("Saturday")){
            if(type.equals("Students")){
                price = 9.80*number;
            }
            if(type.equals("Business") & number >= 100){
                price = 15.60*(number - 10);
            }else if(type.equals("Business") & number < 100 ){
                price = 15.60*number;
            }
            if(type.equals("Regular")){
                price = 20*number;
            }
        }
        if (day.equals("Sunday")){
            if(type.equals("Students")){
                price = 10.46*number;
            }
            if(type.equals("Business") & number >= 100){
                price = 16*(number - 10);
            }else if (type.equals("Business") & number < 100){
                price = 16* number;

            }
            if(type.equals("Regular")){
                price = 22.50*number;
            }
        }
        if(number >= 30 & type.equals("Students")){
            price = price - (price * 0.15);
        }
        if (number >= 10 & number <= 20 & type.equals("Regular")){
            price = price - (price * 0.05);
        }
        System.out.printf("Total price: %.2f",price);
    }
}
