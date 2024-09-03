package arrays.question;
import java.util.ArrayList;
import java.util.Arrays;

public class Q9_CommonIn3Array {
    public static void main(String[] args) {
        int[] a = {1,2,3,8,9};
        int[] b = {1,2,3,5,6,8,9};
        int[] c = {1,4,7,8,5,2};
        ArrayList<Integer> ar = new ArrayList<>();
        // first we have to sort for this search
        Arrays.sort(a);Arrays.sort(b);Arrays.sort(c);
        int i=0, j=0, k=0;

        while(i<a.length && j <b.length && k <c.length){
            if((a[i]==b[j]) && (b[j]==c[k])){
                ar.add(c[k]);i++;j++;k++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<c[k]){
                j++;
            }
            else{
                k++;
            }
        }

        for(int num : ar){
            System.out.println(num);
        }


    }

}
