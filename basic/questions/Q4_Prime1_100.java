package basic.questions;

public class Q4_Prime1_100 {
    public static void main(String[] args) {
        int prNum = 701;
        int flag =0;

        for(int j = 1; j<=100;j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    flag = 1;
                    break;                //here if we won't declare break; then it will continue to ithLoop and then fluctuate the flag value so if we found flag=1 then break the loop there as we know that jth number is not prime
                }else{
                    flag=0;
//                    break;
                }
            }
            if(flag==1) System.out.println(j+": Not Prime");
            else System.out.println(j+": Prime");
        }
    }
}
