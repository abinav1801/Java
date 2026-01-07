/*

1512. Number of Good Pairs

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: 
    There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: 
    Each pair in the array are good.

Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 100

*/

import java.util.Scanner;

public class leetcode1512{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = input.nextInt();

        int[] nums = new int[size];

        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < size ; i++){
            nums[i] = input.nextInt();
        }

        int ans = numIdenticalPairs(nums);

        System.out.print("The Number of Good Pairs are : " + ans);

        input.close();
    }

    static public int numIdenticalPairs(int[] nums) {
        int goodPair = 0;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(i < j && nums[i] == nums[j]){
                    goodPair += 1;
                }
            }
        }
        return goodPair;
    }

}