package Condtionalsloops;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        float pi = 3.14f;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        int radius = input.nextInt();

        float area_of_circle;

        area_of_circle = pi * (radius * radius);

        System.out.print("The area of Circle is " + area_of_circle);

        input.close();
    }   
}
