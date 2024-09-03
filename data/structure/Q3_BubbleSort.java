package data.structure;

import arrays.question.MyArray;

public class Q3_BubbleSort {
    public static void main(String[] args) {

        int[] arr = MyArray.arr;
        int temp;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length ;j++){
                if(arr[j] < arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
