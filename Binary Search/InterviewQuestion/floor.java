package InterviewQuestion;

import java.util.Scanner;

public class floor {
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
            if(i != 0 && arr[i] < arr[i - 1]){
                System.out.print("This is not a sorted array. We cannot perform binary search.");
                input.close();
                return;
            }
        }

        System.out.print("Enter the target element : ");
        int target = input.nextInt();

        int ans = floorFind(arr, target);

        System.out.print("The Ceiling Element is : " + ans);

        input.close();

    }

    static int floorFind(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            //int middle = (start + end) / 2; //might be possible to exceed the java int range
            int middle = start + (end - start) / 2;

            if(arr[middle] == target){
                return middle;
            }
            if(target < arr[middle]){
                end = middle - 1;
            }
            else if(target > arr[middle]){
                start = middle + 1;
            }
        }

        return end;
    }
}
