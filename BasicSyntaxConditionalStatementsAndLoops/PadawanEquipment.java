package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double amountOfMoney = Double.parseDouble(scan.nextLine());

        int students = Integer.parseInt(scan.nextLine());

        double lightsabersPrice = Double.parseDouble(scan.nextLine());
        double pricePerPersonL = lightsabersPrice * Math.ceil(students + (students * 0.1));
        double robesPrice = Double.parseDouble(scan.nextLine());
        double pricePErPersonR = robesPrice * students;
        double beltsPrice = Double.parseDouble(scan.nextLine());
        double pricePerPersonB = 0;
        if(students > 6) {
            int studentsWithBeltsForFree = students / 6;
            pricePerPersonB = beltsPrice * (students - studentsWithBeltsForFree);
        }else {
            pricePerPersonB = beltsPrice * students;
        }

        double expenses = pricePErPersonR + pricePerPersonL + pricePerPersonB;
        double overAll = (expenses - amountOfMoney);
        if (expenses > amountOfMoney) {
            System.out.printf("George Lucas will need %.2flv more.", overAll);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", expenses);

        }
    }
}
