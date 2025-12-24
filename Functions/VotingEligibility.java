package Functions;

import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = input.nextInt();

        if(age < 0)
        {
            System.out.print("Please enter a valid Age.");
            input.close();
            return;
        }

        checkVoteEligibility(age);

        input.close();
    }   

    static void checkVoteEligibility(int age)
    {
        if(age >= 18)
        {
            System.out.print("You are eligible to Vote.");
        }
        else{
            System.out.print("You are not eligible to vote.");
        }
    }
}
