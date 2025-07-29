import java.util.Scanner;

class Bed_tracker
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of days : ");
        int days = input.nextInt();

        int day = 1;
        int bed = 0;

        while(day <= days)
        {
            
            System.out.printf("\n Day %d:\n",day);

            System.out.print("\nEnter the number of person admitted : ");
            int admitted = input.nextInt();

            System.out.print("\nEnter the number of person discharged : ");
            int discharge = input.nextInt();

            bed = bed + admitted - discharge;

            if(bed < 0)
            {
                bed = 0;
            }

            System.out.println("\nThe number of bed occupied on Day " + day + " is " + bed);

            day++;

        }

        input.close();

        return;

    }

}