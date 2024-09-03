package arrays.question;

public class Q10_KadanesAlgo {
    static int[] arr = {-5,-3,4,5,-1,-2,1,5,-3};

     static void bruteForce(){
         int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length ;i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    if(sum>maxi) maxi=sum;

                }
            }
        }
         System.out.println(maxi);
    }

    static void optimalSol(){
         // it is known as Kadane's algorithm
        int sum=0;int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];

            if(sum>max)
                max = sum;

            if(sum<0)
                sum=0;

        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        bruteForce();
        optimalSol();
    }
}
