package Condtionalsloops;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of Unit used : ");
        int unit = input.nextInt();

        int total = 0;  // initialize

        if(unit >= 0 && unit <= 100) {
            total = unit * 2;
        } 
        else if(unit >= 101 && unit <= 300) {
            total = (100 * 2) + ((unit - 100) * 3);
        } 
        else if(unit >= 301) {
            total = (100 * 2) + (200 * 3) + ((unit - 300) * 5);
        } 
        else {
            System.out.println("Invalid input. Units cannot be negative.");
            input.close();
            return;
        }

        System.out.println("The total Bill is : " + total);
        input.close();
    }
}