package DataTypesAndVariables;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //double length, width, height = 0;
        System.out.print("Length: ");
        double length = Double.parseDouble(scan.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scan.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scan.nextLine());
        height = (length*width*height/3);
        System.out.printf("Pyramid Volume: %.2f", height);

    }
}
