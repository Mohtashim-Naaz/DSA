package basic.questions;

public class Q6_FibonacciByRecursion {
    static int a=0, b=1,c;
    int fibo(int num){
        if((num-2)!=0){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
            fibo(num-1);

        }
        return 1;
    }

    public static void main(String[] args) {
        Q6_FibonacciByRecursion f = new Q6_FibonacciByRecursion();
        System.out.println(a+"\n"+b );
        f.fibo(10);

    }
}
