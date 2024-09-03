package arrays.question;

public class Q2_SecondMaxMin {

    int []arr = {11,5,87,87,69,3,2,21,5,60};

    void appraoch_1(){
        // sorting array
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]>arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("First Approach : The Second largest element of array is: "+arr[1]);
        System.out.println();
    }

    //------------------------------------------------------------------------------
    void approach_2(){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

//        System.out.println(largest);
        for(int i =1; i<arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i]!=largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Approach : The Second largest element of array is: "+secondLargest);
    }

    public static void main(String[] args) {
        Q2_SecondMaxMin a = new Q2_SecondMaxMin();
        a.appraoch_1();  // it is prone to duplicate element
        a.approach_2();  //second approach is tackle the duplicate element problem - if we have two largest duplicate elements then it will perfectly show secondlargeset
    }
}
