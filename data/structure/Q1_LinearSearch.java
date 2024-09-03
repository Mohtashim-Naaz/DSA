package data.structure;

import arrays.question.MyArray;


import java.util.Scanner;

public class Q1_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = MyArray.arr;
        int target = 6;
        int flag=0;


        for(int i=0; i<arr.length; i++){
            if(arr[i]==target) flag=1;
        }

//        if(flag==1) System.out.println("Found");
//        else System.out.println("Not Found");

//        boolean ans = ;
        System.out.println((flag==1) ? true : false);

    }
}
