package data.structure;

import arrays.question.MyArray;

import java.util.ArrayList;

public class Q5_SelectionSort {
    public static void main(String[] args) {
        int[] arr = MyArray.arr;

        for(int i=0; i<arr.length; i++){
            int smallest = i;
            // this j loop finds the smallest element in the array
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
