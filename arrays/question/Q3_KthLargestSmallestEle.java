package arrays.question;

import java.util.Scanner;

public class Q3_KthLargestSmallestEle {
    public static void main(String[] args ){

        int[] arr ={22,5,8,10,3,69,4,111,58,66,444,584,20,140,1000};
        //sorting
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter your Kth valus to find largest element: ");
        int k=sc.nextInt();
        for(int i=0; i<k; i++) {
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                 }
            }
        }
        System.out.println(arr[k-1]);



//        for(int ele : arr){
//            System.out.println(ele);
//        }
    }
}
