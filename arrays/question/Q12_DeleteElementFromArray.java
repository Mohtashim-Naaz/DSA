package arrays.question;

public class Q12_DeleteElementFromArray {
    public static void main(String[] args) {
        int[] arr = MyArray.arr;

        System.out.println("Before");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println("\n------------------------------");

        int pos =3;
        for(int i=pos-1; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = 0;
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
