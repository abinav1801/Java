import java.util.Scanner;

class Waterbill
{
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        int unit = input.nextInt();
        float price = 0;

        if (unit >= 0 && unit <= 30)
        {
            price = unit * 2;
        }
        else if (unit > 30 && unit <= 100)
        {
            price = 30 * 2 + ( (unit - 30) * 3);
        }
        else
        {
            price = 30 * 2 + 70 * 3 + ( (unit - 100) * 3);
        }

        System.out.printf("The Price is :  %.2f" , price);

        input.close();
        return;
    }
}