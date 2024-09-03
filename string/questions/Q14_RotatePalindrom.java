package string.questions;



import java.util.*;
class Q14_RotatePalindrom{
    public static void main(String[] args) {
        String s="naaz";
        System.out.println(isRotatedPalindrome(s));

    }

    static int isRotatedPalindrome(String s)
    {
        for(int i=0; i<s.length(); i++){
            s = s.substring(1)+s.charAt(0);
            System.out.println(s);
            if(isPal(s)) return 1;

        }
        return 0;
    }

    public static boolean isPal(String ss){
        String rev="";

        for(int i=ss.length()-1; i>=0; i--){
            rev += ss.charAt(i);
        }
        if(rev.equals(ss)) {return true;}
        System.out.println("rev "+rev);
        return false;
    }



}
