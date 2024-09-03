package basic.questions;

public class Q7_PalindromNumber {
    public static void main(String[] args) {

        int num = 12321;
        int og = num;
        int rev=0,rem;

        while(num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println(rev);

        if(og == rev) System.out.println("number is Palindrom");
        else System.out.println("Number is not Palindrome");

    }
}
