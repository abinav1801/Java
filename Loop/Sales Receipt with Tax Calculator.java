import java.util.Scanner;

class tax_calculator
{

    public static void main(String arg[])
    {

        Scanner input = new Scanner(System.in);

        String item_name;
        double total = 0;
        double amount = 0;

        System.out.print("Enter the item(type 'done' for end) : \n");

        while(true)
        {

            System.out.print("Item Name : ");
            item_name = input.next();
            
            if(item_name.equalsIgnoreCase("Done"))
            {
                break;
            }

            System.out.print("Enter the Amount : Rs.");
            amount = input.nextDouble();

            total += amount;

        }

        double gst = total * 0.18;
        double final_total = total + gst;

        System.out.printf("\nThe Total price (before TAX) : Rs.%.2f",total);
        System.out.printf("\nThe gst amount  @18%% : Rs.%.2f",gst);
        System.out.printf("\nThe Final Amount (After TAX) : Rs.%.2f" ,final_total );

        input.close();

        return;

    }

}