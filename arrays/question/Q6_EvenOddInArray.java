package arrays.question;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q6_EvenOddInArray {
    static int[] a= MyArray.arr;
    public static void main(String[] args){

        arrayListEvenOdd();
        System.out.println();

    for(int i=0; i<a.length; i++){
        if(a[i]%2==0){
            System.out.println("Even: "+a[i]);
        }
        else{
            System.out.println("Odd: "+a[i]);
        }
    }


    }


    public static void arrayListEvenOdd() {
        ArrayList<Integer> arEven = new ArrayList<>();
        ArrayList<Integer> arOdd = new ArrayList<>();

        int totalE=0;
        int totalO=0;

        for(int num : a) {
            if(num%2==0) {
                arEven.add(num);
            }
            else{
                arOdd.add(num);
            }
        }

        System.out.println("Number of elements in even: "+arEven.size());
        System.out.println("Odd size"+arOdd.size());



        //retrival
        System.out.println("Even Number: ");
        for(int num : arEven) {
            totalE += num;
            System.out.println(num);
        }
        System.out.println("Odd Number: ");
        for(int num : arOdd) {
            System.out.println(num);
            totalO += num;
        }
        System.out.println("Total number in E: "+totalE);
        System.out.println("Total number in O: "+totalO);
    }
}
