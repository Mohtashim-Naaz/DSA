package arrays.question;
// Maximum consecutive one’s (or zeros) in a binary array?
public class Q15_MaximumOccuranceInBinary {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,0,1,1,0,0,0,0,0,1,1,1,1};
        int cnt1=0, cnt0=0;
        int max1=0,max0=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                cnt0=0;
                cnt1++;
                if(max1<cnt1) max1=cnt1;
            }
            else{
                cnt1=0;
                cnt0++;
                if(max0<cnt0) max0=cnt0;
            }
        }

        if(max1>max0) System.out.println("1: "+max1);
        else System.out.println("0: "+max0);

    }
}
