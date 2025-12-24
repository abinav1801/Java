package Functions;

import java.util.Scanner;

public class MaxMinofThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three Numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int[] result = MaxandMin(num1, num2, num3);

        System.out.println("The Greatest : " + result[0]);
        System.out.print("The Smallest : " + result[1]);
        input.close();
    }

    static int[] MaxandMin(int n1 , int n2 , int n3)
    {
        int greatest , smallest;
        if(n1 >= n2 && n1 >= n3)
        {
            greatest = n1;
        }
        else if(n2 >= n1 && n2 >= n3)
        {
            greatest = n2;
        }
        else
        {
            greatest = n3;
        }

        if(n1 <= n2 && n1 <= n3)
        {
            smallest = n1;
        }
        else if(n2 <= n1 && n2 <= n3)
        {
            smallest = n2;
        }
        else
        {
            smallest = n3;
        }

        return new int[]{greatest, smallest};
    }
}
