package string.questions;

public class Q13_StringSubsequence {
    public static void main(String[] args) {
        String str1="axaz";
        String str2="nakaza";
        int j=0;
        int cnt=0;
        for(int i=0; i<str2.length(); i++){
            if(str1.charAt(j) == str2.charAt(i)){
                cnt++;j++;
                if(cnt==str1.length()) {System.out.println("ho gya");break;}
            }
        }
        if(cnt!=str1.length()) System.out.println("nhi gama");
    }
}
