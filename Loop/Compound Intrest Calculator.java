import java.util.Scanner;

class Compound_intrest_calculator
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter the years: ");
        int year = input.nextInt();

        for (int i = 1 ; i <= year ; i++)
        {
            double amount = principal * Math.pow((1 + rate / 100), i);
            double intrest =  amount - principal;

            System.out.printf("Year %d : Amount = %.2f | Interest = %.2f%n", i , amount , intrest);
        }

        input.close();

        return;
    }

}