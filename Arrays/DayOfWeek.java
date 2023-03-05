package Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = Integer.parseInt(scan.nextLine());
        if(n <= 0 || n > 7){
            System.out.println("Invalid day!");
        }else {
            String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            System.out.println(day[n - 1]);
        }

    }
}
