/*

1095. Find in Mountain Array

(This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.


Example 1:

Input: mountainArr = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 
    3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Example 2:

Input: mountainArr = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 
    3 does not exist in the array, so we return -1.
 

Constraints:
    3 <= mountainArr.length() <= 104
    0 <= target <= 109
    0 <= mountainArr.get(index) <= 109

*/

package InterviewQuestion;

import java.util.Scanner;

public class leetcode1095 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        if(size <= 0){
            System.out.print("Enter the valid size.");
            input.close();
            return;
        }

        int[] arr = new int[size];
        System.out.print("Enter the elements in the array : ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target element : ");
        int target = input.nextInt();

        int ans = findInMountainArray(arr , target);

        System.out.print("The Peak Index is " + ans);
        
        input.close();
    }

    static int findInMountainArray(int[] arr , int target){
        int peak = peakIndexInMountainArray(arr);

        int ascPart = OrderAgnosticBS(arr, target , 0 , peak);
        if(ascPart != -1){
            return ascPart;
        }
        return OrderAgnosticBS(arr, target , peak + 1 , arr.length - 1);
    }

    static int OrderAgnosticBS(int[] arr, int target , int start , int end) {


        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // int middle = (start + end) / 2; //might be possible to exceed the java int
            // range
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAsc) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                }

            }

        }

        return -1;

    }
    

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int middle = start + (end - start) / 2;

            if(arr[middle] > arr[middle + 1]){
                end = middle;
            }
            else{
                start = middle + 1;
            }
        }

        return start;
    }
}