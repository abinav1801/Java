package InsertionSort;

import java.util.Scanner;

public class insertionsort {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        
        insertionSort(arr);
        
        System.out.println("Sorted array is:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        
        input.close();
    }

    static void insertionSort(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            
            for(int j = i + 1 ; j > 0 ; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr , j , j - 1);
                }
                else{
                    break;
                }
            }
            
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
