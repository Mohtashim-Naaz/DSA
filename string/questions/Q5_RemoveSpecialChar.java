package string.questions;

public class Q5_RemoveSpecialChar {
    public static void main(String [] args) {
        String s="!@#n$@!#$a@a!z#d#$o(*#n$^";

        s=s.replaceAll("[^a-zA-Z]", "");   // ^ denotes here is 'other than that'
        //s=s.replaceAll("[a-zA-Z]", "");

        System.out.println(s);

    }
}
