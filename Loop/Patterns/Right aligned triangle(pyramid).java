package Patterns;

import java.util.Scanner;

class pyramid
{

    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        for (int i = 1 ; i <= n ; i++)
        {

            for (int space = 1 ; space <= n-i ; space++)
            {

                System.out.print(" ");

            }

            for (int j = 1; j <= i ; j++)
            {

                System.out.print("*");

            }

            System.out.print("\n");

        }

        input.close();
        return;

    }

}