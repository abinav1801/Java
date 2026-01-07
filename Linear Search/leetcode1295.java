/*
1295. Find Numbers with Even Number of Digits
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
    12 contains 2 digits (even number of digits). 
    345 contains 3 digits (odd number of digits). 
    2 contains 1 digit (odd number of digits). 
    6 contains 1 digit (odd number of digits). 
    7896 contains 4 digits (even number of digits). 
    Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
    Only 1771 contains an even number of digits.

Constraints:
    1 <= nums.length <= 500
    1 <= nums[i] <= 105

*/

import java.util.Scanner;

public class leetcode1295{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();

        if(size <= 0){
            System.out.print("The Array cannot be Zero.");
            input.close();
            return;
        }

        int[] nums = new int[size];

        System.out.print("Enter the Array Element : ");
        for(int i = 0 ; i < size ; i++){
            nums[i] = input.nextInt();
        }

        int total = evennumbers(nums);
        System.out.print("The Total Number of Even Digits are : " + total);
        input.close();
    }

    static int evennumbers(int[] nums)
    {
        int count = 0;
        for(int num : nums){
            if(digit(num) % 2 == 0){
                count += 1;
            }
        }
        return count;
    }

    static int digit(int num){
        int count = 0;
        while(num > 0){
            count += 1;
            num /= 10;
        }
        return count;
    }
}