import java.util.Scanner;

class prime_number
{
    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number upto how many times prime number to be wanted : ");
        int number = input.nextInt();

        int count = 0;
        int i = 2;

        while(count < number )
        {

            boolean isprime = true;

            for(int j = 2 ; j <= Math.sqrt(i) ; j++)
            {

                if (i % j == 0)
                {

                    isprime = false;
                    break;

                }

            }

            if (isprime)
            {
                System.out.print(i + " ");
                count++;
            }

            i++;

        }

        input.close();

        return;
        
    }
}