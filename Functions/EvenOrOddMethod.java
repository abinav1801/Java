package Functions;

import java.util.Scanner;
public class EvenOrOddMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        EvenOrOdd(num);
        input.close();
    }

    static void EvenOrOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.print("The given number is Even.");
        }
        else{
            System.out.print("The given number is Odd.");
        }
    }
}
