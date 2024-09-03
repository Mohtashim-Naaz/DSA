package arrays.question;

import java.util.*;

class thor{
    int a=01;

}
public class Q4_DuplicateElement {
    int[] arrr = MyArray.duplicateArr;

    void bruteForceMeth()
    {
        for(int i=0; i<arrr.length; i++)
        {
            for (int j=i+1; j< arrr.length; j++)
            {
                if(arrr[i] == arrr[j] && i!=j) {
                    System.out.println("BruteForce Method : Duplicate Element: "+arrr[j]+" ");
                }
            }
        }
        // DrawBAck: slower if there is 1000's records
        System.out.println("---------------------------------------------------------");
    }

    //---------------------------------------------------------

    void setInterface(){
        int[] arr = MyArray.duplicateArr; //[1,2,3,2,6,5,4,8]

        HashSet<Integer> set  =new HashSet<>();

        for(int ele : arr){

            if(set.add(ele) == false) {
                System.out.println("SetInterface Method : Duplicate Element : "+ele);
            }

        }
        // set interface is not store duplicate values in set so if we try to add duplicate element the [set.add(ele)] method returns false
        // and yet it match with if condition so we simply print ele where it wont get added into set
        // Note: boolean add(Object obj); it returns boolean true if element is added in collection and return false when element is not added into Collection
        // DrawBack: if there is more than 2 duplicate elements then it print it twice
    }

    // ------------------------------------------------------------------

    void mapInterface(){
        int[] arr = MyArray.duplicateArr;

        Map<Integer, Integer> m = new HashMap<>();

        for(int no : arr){
            Integer count = m.get(no);  // we use Integer as it returns the value in Integer format and as well return null (null cannot store in int)
            if(count == null) {
                m.put(no,1);
            }
            else {
                count+=1;
                m.put(no,count);
            }
        }

        System.out.println("\n--------------------------------\nDuplicate elements : ");
//        Set<Map.Entry<Integer, Integer>> s = m.entrySet();
        for (Map.Entry<Integer, Integer> map : m.entrySet()) {
            if(map.getValue()>1){
                System.out.println(map.getKey());
            }
        }                         // didn't quite understand properly

//        for(int no : arr) {
//
//            Integer num = m.get(no);
//
//            if(num>1) {
//                System.out.println(no);
//            }
//
//        }
    }

    // --------------------------------------------------------------
    int testMap(){
        HashMap<Integer, Integer> hm = new HashMap<>();

            int[] arr = {2,2,1};
            int cnt=0;
        for(int num : arr){
            if(!hm.containsKey(num)){
                hm.put(num,1);
                System.out.println(hm.containsValue(num)+" "+num);
            }
            else{
                cnt = hm.get(num);
                cnt++;
                hm.put(num,cnt);
                System.out.println("chune");
            }
        }
        int ans=0;
        for(Map.Entry<Integer, Integer> map : hm.entrySet()){
            if(map.getValue()==1){
                ans = map.getKey();
                //return ans;
            }
        }
        System.out.println();
        for (Map.Entry<Integer,Integer> map : hm.entrySet()){
            System.out.println(map);
        }
        System.out.println(hm);
        return ans;
    }


    public static void main(String [] args) {
        Q4_DuplicateElement f = new Q4_DuplicateElement();
//        f.bruteForceMeth();
        f.setInterface();
//        f.mapInterface();
//        System.out.println(f.testMap());
    }
}
