package Course.Arrays;

import java.util.Scanner;

class even_odd
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = input.nextInt();

        int[] num = new int[n];

        System.out.print("Enter the numbers : ");
        for(int i = 0 ; i < n ; i++)
        {
            num[i] = input.nextInt();
        }

        int even_count = 0 , odd_count = 0;

        for(int i = 0 ; i < n ; i++)
        {

            if(num[i] % 2 == 0)
            {
                even_count++;
            }
            else{
                odd_count++;
            }

        }

        System.out.println("Even = " + even_count);
        System.out.println("Odd = " + odd_count);

        input.close();
        return;

    }

}
