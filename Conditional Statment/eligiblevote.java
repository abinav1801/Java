import java.util.Scanner;

class eligiblevote
{
    public static void main(String arg[])
    {
        Scanner input1 = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = input1.nextInt();

        if(age <=0)
        {
            System.out.println("Enter a valid age");
            input1.close();
            return;
        }

        if (age >= 18)
        {
            System.out.println("Eligible To Vote");
        }
        else
        {
            System.out.println("Not Eligible To Vote");
        }
        input1.close();
        return;
    }
}