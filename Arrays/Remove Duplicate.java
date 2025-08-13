package Course.Arrays;

import java.util.Scanner;

class duplicate
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements in array : ");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = input.nextInt();
        }

        int[] result = new int[size];
        int res_size = 0;

        for(int i = 0 ; i < size ; i++)
        {
            boolean is_dup = false;
            for (int j = 0 ; j < res_size ; j++)
            {
                if(arr[i] == arr[j]) 
                {
                    is_dup = true;
                    break;
                }
            }

            if(!is_dup)
            {
                result[res_size++] = arr[i];
            }
        }

        System.out.println("The Output is : ");

        for(int i = 0; i < res_size ; i++ )
        {
            System.out.print(result[i] + " ");
        }

        input.close();
        return;

    }

}