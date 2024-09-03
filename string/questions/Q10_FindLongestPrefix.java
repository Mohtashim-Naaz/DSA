package string.questions;

import java.util.Arrays;

public class Q10_FindLongestPrefix {


    public static void main(String[] args) {
        Q10_FindLongestPrefix ne = new Q10_FindLongestPrefix();

        String[] arr = {"thanos", "thor", "thala", "thunder", "the"};
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length-1];
        String pre = "";

        int i=0;
        while(first.charAt(i) == last.charAt(i)){

            pre += first.charAt(i);
            i++;
        }
        if(pre == "") System.out.println(-1);
        else System.out.println("longest prefix: "+pre);

    }
}
