import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Operator : ");
        char operator = input.next().trim().charAt(0);

        System.out.print("Enter two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = 0;

        if(operator == '+')
        {
            result = num1 + num2;
        }
        else if(operator == '-')
        {
            result = num1 - num2;
        }
        else if(operator == '*')
        {
            result = num1 * num2;
        }
        else if(operator == '/')
        {
            if(num2 > 0)
            {
                result = num1 / num2;
            }
            else{
                System.out.print("Number cannot be diveded by zero");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }

        System.out.print("The Answer is " + result);

        input.close();

    }
}
