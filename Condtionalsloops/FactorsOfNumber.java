package Condtionalsloops;

import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find factor : ");
        int num = input.nextInt();

        System.out.print("The factors are : ");
        for(int i = 1 ; i <= num ; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
