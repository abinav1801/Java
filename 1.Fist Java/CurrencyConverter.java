import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the INR Dollar :");
        float in_dollar = input.nextFloat();
        float us_dollar = 0f;

        if (in_dollar >= 0)
        {
            us_dollar = in_dollar / 83;
        }
        System.out.print("The INR Ruppee " + in_dollar + " in US Dollar is " + us_dollar); 

        input.close();
    }
}
