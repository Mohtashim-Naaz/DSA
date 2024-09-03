package arrays.question;
// Write a java program to find all pairs of elements in an integer
//array whose sum is equal to a given number?

public class Q15_PairSumEqualToTarget {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target=6;
        int sum,cnt=0;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum=0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                    if(sum==target) cnt++;
            }
        }

        System.out.println("number of pairs: "+cnt);
    }
}
