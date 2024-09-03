package string.questions;

public class Q11_EvenVowelWordChange {
    public static void main(String[] args) {
        String s = "i am naaz the bAadshah";
        String[] arr = s.split("\\s");
        String[] word = new String[arr.length];


        for(int i=0; i<arr.length; i++){
        String str="";
        int cnt=0;
            for(int j=0; j<arr[i].length(); j++){
                char c = arr[i].charAt(j);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    cnt++;
                }
            }
            if(cnt%2==0){
                for(int j=0; j<arr[i].length(); j++) {
                    char c = arr[i].charAt(j);
                    if(c=='z') c='a';
                    else c++;
                    str += c;

                }
                    arr[i] = str;
            }
        }

        for(String strr : arr){
            System.out.print(strr+" ");
        }
    }
}
