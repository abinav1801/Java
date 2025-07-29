package Patterns;

import java.util.Scanner;

class right_angle
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        for (int i = 1 ; i <= n ; i++ )
        {

            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
            }

            System.out.print("\n");

        }

        input.close();
        
        return;

    }

}