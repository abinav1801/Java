/*

41. First Missing Positive

Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 

Constraints:
    1 <= nums.length <= 105
    -231 <= nums[i] <= 231 - 1

*/

package CyclicSort.InterviewQuestions;

import java.util.Scanner;

public class leetcode41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int ans = firstMissingPositive(arr);

        System.out.println("The Duplicate Number is : " + ans);

        input.close();
    }

    static int firstMissingPositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }

        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
