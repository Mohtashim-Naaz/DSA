package data.structure;

public class Q6_Recursion {
    public static void main(String[] args) {
//        int ans = fibo(7);
//        System.out.println(ans);

        int[] arr = {1,2,5,9,10,15,19,20};
        int target = 20;
        int s = 0;
        int e = arr.length-1;
        System.out.println(binarySearch(arr, target, s, e));
    }

    // === binary search ===
    static int binarySearch(int[] arr, int target,int s, int e){
        if(s>e) return -1;

        int m = (s+e)/2;
        if(arr[m] == target) return m;

        if(arr[m]>target){
            return binarySearch(arr,target,s,m-1);
        }
        return binarySearch(arr, target, m+1,e);
    }


    // === fibonacci ===
    static int fibo(int n){
        if(n<2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
