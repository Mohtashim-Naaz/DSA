package string.questions;

public class Q7_ReverseWords {

    public static void stringBuider(){
        String s ="I am don";
        String[] word = s.split(" ");
        String rev="";

        for(String num : word){
            StringBuilder sb = new StringBuilder(num);
            sb.reverse();

            rev = rev+sb+" ";
        }
        System.out.println(rev);

    }

    public static void main(String[] args) {

        stringBuider();
        System.out.println("-----------------------");
        String s = "bring me thanos";

        String[] word = s.split(" ");

        String rev = "";
        for(int i=0; i<word.length; i++) {
            for(int j=word[i].length()-1; j>=0; j--){
                rev = rev + word[i].charAt(j);
            }
            rev = rev+" ";

        }
        System.out.println(s+"\n"+rev);
    }
}
