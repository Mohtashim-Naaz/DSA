package arrays.question;

public class Q1_MInMax {
    int[] arr = {25,44,88,98,7,5,20};

    int max(){
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
            return max;
    }

    int min(){
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Q1_MInMax fuc = new Q1_MInMax();
        System.out.println(fuc.max());
        System.out.println(fuc.min());
    }
}
