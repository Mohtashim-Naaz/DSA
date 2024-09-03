package string.questions;

public class Q9_ReverseBasedOnDots {
    public static void main(String[] args) {

        String s = "Bring.me.thanos";
        String[] words = s.split("\\.");

        System.out.println("Input: "+s);
        System.out.print("Output: ");
        for(int i=words.length-1; i>=0; i--){
            System.out.print(words[i]+".");
        }

    }
}
