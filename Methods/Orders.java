package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String purchase = scan.nextLine();
        int quantity =Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (purchase){
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
        }
        totalPrice(price,quantity);
    }
    public static void totalPrice (double price,int quantity){
        double totalPrice = price * quantity;
        System.out.printf("%.2f",totalPrice);

    }
}
