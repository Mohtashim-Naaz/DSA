package arrays.question;

public class Q14_SumOfInteger {
    public static void main(String[] args) {
        long num = 888888888888888l;
        long num1 = sum(num);
        long ans=num1;
        while(ans > 10){
            ans = sum(num1);
        }
        System.out.println(ans);
    }

    public static long sum(long num){
        long sum=0;
        long rem;

        while(num>0){
            rem = num%10;
            sum += rem;
            num = num/10;
        }
        return sum;


    }
}
