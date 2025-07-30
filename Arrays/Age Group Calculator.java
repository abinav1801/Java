package Course.Arrays;

import java.util.Scanner;

class age
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = input.nextInt();

        int[] age = new int[n];

        System.out.print("Enter the elements in an array : ");
        for(int i = 0 ; i < n ; i++)
        {
            age[i] = input.nextInt();
        }

        int adult = 0 , minor = 0 , senior = 0;

        for(int i = 0 ; i < n ; i++)
        {

            if (age[i] >= 60)
            {
                adult++;
            }
            else if (age[i] >= 18)
            {
                senior++;
            }
            else
            {
                minor++;
            }

        }

        System.out.println("Adult = " + adult);
        System.out.println("Senior = " + senior);
        System.out.println("Minor = " + minor);

        input.close();
        return;

    }

}
