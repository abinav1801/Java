package Condtionalsloops;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Breadth : ");
        float b = input.nextFloat();

        System.out.print("Enter the width : ");
        float w = input.nextFloat();

        float area_of_triangle;

        area_of_triangle = 0.5f * b * w;

        System.out.print("The area of the triangle is " + area_of_triangle);

        input.close();

    }
}
