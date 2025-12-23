package Condtionalsloops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the num : ");
        int num = input.nextInt();

        int fact = 1;

        if(num == 0 || num == 1)
        {
            fact = 1;
        }
        else if(num > 1)
        {
            for(int i = 2 ; i <= num ; i++)
            {
                fact = fact * i;
            }
        }

        System.out.print("The Factorial is " + fact);

        input.close();
    
    }
    
}
