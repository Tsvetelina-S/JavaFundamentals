package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        System.out.println(area(width,length));
    }
    public static int area (int num,int num2){
        int area = num * num2;
        return area;
    }
}
