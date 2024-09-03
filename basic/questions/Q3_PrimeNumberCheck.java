package basic.questions;

public class Q3_PrimeNumberCheck {

    public static void main(String[]args){
        int prNum = 97;
        int flag =0;


            for (int i = 2; i < prNum; i++) {
                if (prNum % i == 0) {
                    flag = 1;

                }

        }
            if(flag==1) System.out.println(prNum+": Not Prime");
            else System.out.println(prNum+": Prime");

    }
}
