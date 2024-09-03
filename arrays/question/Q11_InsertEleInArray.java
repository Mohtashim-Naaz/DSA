package arrays.question;

// this approach remove last element of array arr[arr.length-1]
public class Q11_InsertEleInArray {
    public static void main(String[] args) {
        int[] arr = MyArray.arr;
        int pos = 2;
        int element=100;

        System.out.println("Before");
        for(int num:arr){
            System.out.print(num+" ");
        }

        for(int i=arr.length-1; i>pos; i--){
            arr[i]=arr[i-1];

        }
        arr[pos]=element;
        System.out.println("--------------------------");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
