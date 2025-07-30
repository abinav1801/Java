package Patterns;

import java.util.Scanner;

class floyds_triangle
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the n : ");
        int n = input.nextInt();

        int num = 1;

        for (int i = 1 ; i <= n ; i++)
        {

            for (int j = 1 ; j <= i ; j++)
            {

                System.out.print(num + " ");
                num++;

            }

            System.out.println();

        }

        input.close();
        return;

    }

}