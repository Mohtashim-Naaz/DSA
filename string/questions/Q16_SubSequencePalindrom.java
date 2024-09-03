package string.questions;

import java.util.ArrayList;
import java.util.HashSet;

//Find all possible palindromic substrings of a string
public class Q16_SubSequencePalindrom {
    public static void main(String[] args) {
        String s = "aaccaaba";
        HashSet<String> ar = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length();j++){
                for(int k=i; k<=j; k++){

                    String str = s.substring(i,j+1);
                    if(isPal(str) && str.length()!=1) ar.add(str);

                }
            }
        }

        System.out.println(ar);

    }

    public static boolean isPal(String ss){
        String rev="";

        for(int i=ss.length()-1; i>=0; i--){
            rev += ss.charAt(i);
        }
        if(rev.equals(ss)) {return true;}
//        System.out.println("rev "+rev);
        return false;
    }
}
