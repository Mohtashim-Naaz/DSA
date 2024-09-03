package string.questions;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String s="abacdef";
        int k=4;
        ArrayList<String> ar = new ArrayList<>();

        for(int i=0;i<=s.length()-k; i++){
            int j=i+k;
            ar.add(s.substring(i,j));

        }

        System.out.println(ar);
    }
}
