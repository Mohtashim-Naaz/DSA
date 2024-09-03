package data.structure;

import arrays.question.MyArray;

public class Q4_InsertionSort {
        static int[] arr = MyArray.arr  ;

    public static void secondApproach(){
        for(int i=1; i<arr.length ;i++){
            int j=i;
            int temp=arr[i];
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

        MyArray.printArr(arr);
    }

    public static void main(String[] args) {

        int temp=0;
        for(int i=0; i<arr.length ; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                temp=arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        MyArray.printArr(arr);


        secondApproach();






    }
}

