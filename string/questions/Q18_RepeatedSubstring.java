package string.questions;
//: Check if a repeated subsequence is present in a string or not
public class Q18_RepeatedSubstring {
    public static void main(String[] args) {
        String s = "abaaba"; // abcdabcd

        String str = s+s; //bcabcabcab
        String formattedStr = str.substring(1,str.length()-1);
        System.out.println(formattedStr);
        if(formattedStr.contains(s)){
            System.out.println("hao");
        }else{
            System.out.println("mhi");}
    }
}
