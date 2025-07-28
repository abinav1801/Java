import java.util.Scanner;

class evenorodd
{
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
        input.close();
    }
}