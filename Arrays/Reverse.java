package Course.Arrays;

import java.util.Scanner;

class reverse
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of an array : ");
        for(int i = 0 ; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int[] rev = new int[n];

        for(int i = 0 ; i < n ; i++)
        {

            rev[i] = arr[n-i-1];

        }

        System.out.println("The Reversed array is : ");
        for(int i = 0; i < n ; i++)
        {
            System.out.print(rev[i] + " ");
        }

        input.close();
        return;

    }

}