package Course.Arrays;

import java.util.Scanner;

class frequency
{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < size ; i++ )
        {
            arr[i] = input.nextInt();
        }

        int count = 0;

        boolean[] counted = new boolean[size];

        for(int i = 0 ; i < size ; i++)
        {
            if (counted[i]) continue;
            
            count = 1;
            for(int j = i+1 ; j < size ; j++ )
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    counted[j] = true;
                }
            }

             System.out.println("Item " + arr[i] + ": " + count + (count == 1 ? " time" : " times"));
        }

    }

}