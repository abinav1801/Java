package Condtionalsloops;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int length = input.nextInt();

        System.out.print("Enter the width : ");
        int width = input.nextInt();

        int area_of_rectangle;

        area_of_rectangle = length * width;

        System.out.print("The area of rectangle is " + area_of_rectangle);

        input.close();
    }
}
