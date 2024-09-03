package string.questions;

public class Q3_MaxOccuringCharacter {

    public static void main(String[] args){

        String s = "nsazaa                    ";
        s=s.replaceAll("\\s", "");  //remove in between spaces
        s=s.trim();                  //remove leading and trailing spaces

        int[] arr = new int[277];
//        arr[97]=100;
//      System.out.println(arr['a']);
//        System.out.println(s.charAt(0));

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)] = arr[s.charAt(i)]+1;
        }

//        System.out.println(arr[99]);
        //aabbbcc
        int max=-1;
        char c= ' ';
        for(int i=0; i<s.length(); i++) {
            if(max < arr[s.charAt(i)]) {
                max = arr[s.charAt(i)];
                c = s.charAt(i);
            }
        }
        System.out.println(c);

    }
}
