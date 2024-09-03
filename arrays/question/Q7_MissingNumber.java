package arrays.question;

public class Q7_MissingNumber {

    static int[] a = {1,2,3,4,5,6,8,9,10};

    public static void totalSum() {
        int expectedNum = a.length+1;
        int total = expectedNum * (expectedNum+1)/2;
        int sum=0;

        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        int res = total-sum;
//        System.out.println("missing "+res);
        System.out.println("Missing: "+(total - sum));
    }

    public static void secondApproach() {

    }


    public static void main(String[] args) {
        totalSum();
        secondApproach();
    }

}

