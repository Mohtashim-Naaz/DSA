package data.structure;
import arrays.question.MyArray;

public class Q8_QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        MyArray.printArr(arr);
    }

    static void sort(int[] arr, int low, int hi){
        if(low>=hi) return;

        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // how my pivot is at correct index, please sort two halves now
        sort(arr,low,e);   // why low->e as because e-- and move towards low
        sort(arr,s,hi);

    }
}
