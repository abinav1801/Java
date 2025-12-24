package Functions;

import java.util.Scanner;

public class PrimeCheckMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        checkPrime(num);

        input.close();
    }

    static void checkPrime(int n)
    {
        if(n <= 0)
        {
            System.out.print("Please enter a positive number");
            return;
        }
        if(n == 0)
        {
            System.out.print("It is not a Prime number.");
            return;
        }
        if(n == 2){
            System.out.print("It is a Prime Number.");
            return;
        }
        for(int i = 3 ; i < n / 2; i++ )
        {
            if(n % i == 0)
            {
                System.out.print("It is not a Prime number.");
                return;  
            }
        }
        System.out.print("It is a Prime Number.");

    }
}
