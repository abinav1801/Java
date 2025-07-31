package Course.Arrays;

import java.util.Scanner;

class monitor
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of an array : ");

        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        int max = 0;

        for(int i = 0 ; i < size ; i++ )
        {

            if(arr[i] < min)
            {
                min = arr[i];
            }

            int profit = arr[i] - min;

            if(profit > max)
            {
                max = profit;
            }

        }

        System.out.println("The Maximum Profit is " + max );

        input.close();
        return;

    }

}