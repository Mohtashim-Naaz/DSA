package data.structure;

import arrays.question.MyArray;

import java.util.Arrays;

public class Q2_BinarySearch {
    public static void main(String[] args) {

        int[] arr = MyArray.arr;
        Arrays.sort(arr);
        int mid=0,first=0,last=arr.length-1;
        int target=54,flag=0;

        while(first<=last){
            mid = (first+last)/2;

            if(arr[mid] == target) {flag=1;break;}
            else if(arr[mid] < target) first = mid+1;
            else last = mid-1;
        }

        if(flag==1) System.out.println("Found");
        else System.out.println("notFound");

    }
}
