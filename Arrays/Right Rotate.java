package Course.Arrays;

import java.util.Scanner;

class rotate
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements in an array : ");
        for(int i = 0 ; i < size ; i++ )
        {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the time to rotate(right) : ");
        int k = input.nextInt();

        k = k % size;

        for(int i = 0 ; i < k ; i++)
        {
            int last = arr[size - 1];
            for(int j = size -1 ; j > 0 ; j-- )
            {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        for(int i : arr) System.out.print(i + " ");

        input.close();
        return;

    }

}