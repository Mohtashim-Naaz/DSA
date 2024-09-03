package arrays.question;

import java.util.HashSet;

public class Q8_CommonEleInTwoArray {
    static int[] a = {10,20,55,4,66,40,5,4,66,8,100};
    static int[] b = {22,2,10,55,6,5,4,100};

    public static void setInterface(){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<a.length; i++) {
            for(int j=0; j<b.length; j++) {
                if(a[i] == b[j]) {
                    hs.add(a[i]);break;
                }
            }
        }
        for(int num : hs){
            System.out.println(num);
        }
    }

    public static void bruteForce(){
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<b.length; j++) {
                if(a[i] == b[j]) {
                    System.out.println("Duplicate : "+a[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        bruteForce();
        System.out.println("--------------------");
        setInterface();

    }
}
