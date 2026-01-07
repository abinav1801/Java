/*

1470. Shuffle the Array

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: 
    Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
 

Constraints:
    1 <= n <= 500
    nums.length == 2n
    1 <= nums[i] <= 10^3

*/

import java.util.Scanner;

public class leetcode1470 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = input.nextInt();

        int[] nums = new int[size];

        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < size ; i++){
            nums[i] = input.nextInt();
        }

        System.out.print("Enter the n : ");
        int n = input.nextInt();

        int[] arr = new int[size];

        arr = shuffle(nums , n);

        System.out.print("The Answer is : ");
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
        input.close();
    }

    static public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
            if(i % 2 == 0){
                ans[i] = nums[i / 2];
            }
            else{
                ans[i] = nums[n + i / 2];
            }
        }
        return ans;
    }

}
