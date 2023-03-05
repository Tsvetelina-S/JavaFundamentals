package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // String[] integers = scan.nextLine().split(" "); //5 0 4 1 2


//        for (int i = 0; i < integers.length-1; i++) { //
//            array[i] = Integer.parseInt(integers[i]); //     5,0,4,1,//5,4,5,
//            array2[i] = Integer.parseInt(integers[i + 1]); //0,4,1,2//4,5,3

        //System.out.println(array[i] + " one");
        //System.out.println(array2[i] + " two");
        // }
        int[] array = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray(); //4

        int array2[] = new int[array.length - 1];


        for (int i = 0; i < array.length; i++) {
            if (array.length == 1) {
                break;
            }
            if (i == array.length - 1) {
                int[] newarray2 = new int[array2.length - 1];
                i = -1;
                array = array2;
                array2 = newarray2;
            } else {
                array2[i] = array[i] + array[i + 1];
            }
        }
        System.out.println(array[0]);
    }
}
