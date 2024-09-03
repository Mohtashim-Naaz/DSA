//package data.structure;// Java program for Merge Sort
//
//class Q7_MergeSort {
//
//    // Merges two subarrays of arr[].
//    // First subarray is arr[l..m]
//    // Second subarray is arr[m+1..r]
//    void merge(int arr[], int l, int m, int r)
//    {
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        // Create temp arrays
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        // Copy data to temp arrays
//        for (int i = 0; i < n1; ++i)
//            L[i] = arr[l + i];
//        for (int j = 0; j < n2; ++j)
//            R[j] = arr[m + 1 + j];
//
//        // Merge the temp arrays
//
//        // Initial indices of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarray array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            }
//            else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy remaining elements of L[] if any
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        // Copy remaining elements of R[] if any
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    // Main function that sorts arr[l..r] using
//    // merge()
//    void sort(int arr[], int l, int r)
//    {
//        if (l < r) {
//
//            // Find the middle point
//            int m = l + (r - l) / 2;
//
//            // Sort first and second halves
//            sort(arr, l, m);
//            sort(arr, m + 1, r);
//
//            // Merge the sorted halves
//            merge(arr, l, m, r);
//        }
//    }
//
//    // A utility function to print array of size n
//    static void printArray(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//
//    // Driver code
//    public static void main(String args[])
//    {
//        int arr[] = { 12, 11, 13, 5, 6 };
//
//        System.out.println("Given array is");
//        printArray(arr);
//
//        Q7_MergeSort ob = new Q7_MergeSort();
//        ob.sort(arr, 0, arr.length - 1);
//
//        System.out.println("\nSorted array is");
//        printArray(arr);
//    }
//}


package data.structure;

import arrays.question.MyArray;

import java.util.Arrays;

public class Q7_MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr = mergeSort(arr);

        MyArray.printArr(arr);
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }


    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];
        int j=0;
        int i=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining element
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
