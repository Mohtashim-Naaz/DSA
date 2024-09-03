package string.questions;

public class Q12_TwoStringAddition {
    public static void main(String[] args) {
        String str1 = "abcde";  // apbqcrde
        String str2 = "pqr";
        int size = Math.max(str1.length(), str2.length());
        int sizeMin = Math.min(str1.length(), str2.length());

        String str ="";int j=0;


        for(int i=0; i<size ; i++){

            if(j==sizeMin) j=Integer.MIN_VALUE;
            if(i==j){
                str+=str1.charAt(i)+""+str2.charAt(i);
                j++;
            }
            else if(str1.length() < str2.length()){
                str += str2.charAt(i);
            }
            else {
                str+=str1.charAt(i);
            }

        }
            System.out.println(str);


    }
}
