package arrays.question;
import java.util.*;

public class Q5_ElementAppearsOnce {

        int[] a={5,4,6,4,5};

    public void xorApp() {

        int res=a[0];
        for(int i=1; i<a.length; i++) {
            res = res^a[i];                 // 5^4^6^4^5
            // (5^5)^(4^4)^6
            // 0^0^6    ->     return 6 in res
            // XOR operation make produce output if both value is same
            // 1^1 = 0    |   0^0=0    and    1^0, 0^1 = 1
        }
        System.out.println(res);
    }

    //-------------------------------------------
    public void myApp() {
    // MAp se dekho
    }


    public static void main(String[] args) {
        Q5_ElementAppearsOnce obj = new Q5_ElementAppearsOnce();
//        obj.xorApp();
        obj.myApp();

    }
}
