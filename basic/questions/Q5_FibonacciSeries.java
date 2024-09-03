package basic.questions;

public class Q5_FibonacciSeries {

    public static void main(String[] args) {
        int a = 0, b=1;
        int c;
        int n=10;

        System.out.println(a+"\n"+b);
        for(int i =0; i<n; i++){
            c = a+b;
            System.out.println(c+"\t");
            a=b;
            b=c;
        }
    }
}
