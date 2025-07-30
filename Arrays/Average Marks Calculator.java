package Course.Arrays;

import java.util.Scanner;

class mark_calculator
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = input.nextInt();

        int[] marks = new int[n];
        float sum = 0 , average = 0 ;


        System.out.println("Enter the elements of an array : ");
        for (int i = 0 ; i < n ; i++)
        {

            marks[i] = input.nextInt();
            sum += marks[i];
        }

        average = sum / n;

        int lowest = marks[0] , highest = marks[0];

        for (int i = 1 ; i < n ; i++)
        {

            if( marks[i] > highest )
            {
                highest = marks[i];
            }

            if ( marks[i] < lowest )
            {
                lowest = marks[i];
            }

        }

        System.out.printf("Average : %.2f", average);
        System.out.printf("\nHighest : %d", highest);
        System.out.printf("\nLowest : %d", lowest);

        input.close();
        return;

    }

}