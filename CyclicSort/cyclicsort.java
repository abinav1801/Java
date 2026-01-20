package CyclicSort;

import java.util.Scanner;

public class cyclicsort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        
        cyclicSort(arr);
        
        System.out.println("Sorted array is:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        
        input.close();
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length - 1){
            int correct = arr[i] - 1;
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
