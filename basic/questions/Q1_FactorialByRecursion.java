package basic.questions;

public class Q1_FactorialByRecursion {

    static int fact = 1;
    int fact(int num){
        if(num > 0){
            fact = fact* num;
            fact(num-1);
            //            return ;
        }return fact;
    }

    public static void main(String[]args){
        Q1_FactorialByRecursion f = new Q1_FactorialByRecursion();
        int res = f.fact(5);
        System.out.println(res);

    }
}
