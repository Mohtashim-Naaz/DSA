package string.questions;

public class Q2_PalindromeString {
    public static void main(String[] args) {

        String s = "naaz", rev="";

        for(int i=s.length()-1; i>=0; i--) {
            rev+=s.charAt(i);
        }

        if(s.equals(rev)) System.out.println("Palindrom");
        else System.out.println("not palindrome");

    }
}
