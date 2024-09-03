package string.questions;

public class Q6_NumberOfWords {
    public static void main(String[] args) {
        String s = "bring me thanos";

        int cnt=1;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
                cnt++;
            }
        }

        System.out.println("Number of words in sentence is: "+cnt);
    }
}
