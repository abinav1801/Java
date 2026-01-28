/*

645. Set Mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 

Constraints:
    2 <= nums.length <= 104
    1 <= nums[i] <= 104

*/

package CyclicSort.InterviewQuestions;

import java.util.Scanner;

public class leetcode645 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        
        int[] ans = findErrorNums(arr);
        
        System.out.println("Answer is:");
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
        
        input.close();
    }

    static int[] findErrorNums(int[] arr) {
        cyclicSort(arr);

        int[] ans = new int[2];

        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index + 1){
                ans[0] = arr[index];
                ans[1] = index + 1;
            }
        }

        return ans;
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1; //for the array starts from 0 if it starts from 1 use arr[i] - 1
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
