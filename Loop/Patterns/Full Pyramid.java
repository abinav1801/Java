package Patterns;

import java.util.Scanner;

class full_pyramid
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the n: ");
        int n = input.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {

            for (int space = 1 ; space <= n - i; space++)
            {

                System.out.print(" ");

            }

            for (int star = 1 ; star <= 2 * i - 1 ; star++)
            {

                System.out.print("*");

            }

            System.out.println();

        }

        input.close();

        return;

    }

}
