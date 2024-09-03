package arrays.question;
// this logic is work for sorted array so if you have unsorted array then first sort it asap
// because sorting make all duplicate value together
public class Q13_DeleteDuplicateElementFromArray {
    public static void main(String[] args) {
        int[] arr = {10,10,10,2,2,3,4,4,5,5,6,7};

        int[] temp = new int[arr.length];
        int j=0;

        System.out.println("Before");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

        for(int i=0; i< arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length-1];

        System.out.println("\n--------------------");
        for(int num:temp){
            System.out.print(num+" ");
        }
    }
}
