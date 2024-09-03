package string.questions;

import java.util.HashMap;
import java.util.Map;

public class Q4_MapInterfaceMaxOccuringChar{

    public static void main(String[] args){

        String s = "aaabbcccc";
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char c= s.charAt(i);
            if(hm.containsKey(c)) {
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        System.out.println(hm);

        Integer max = 0;
        char tmp= ' ';

        for(Map.Entry<Character, Integer> num : hm.entrySet()){
            if(max < num.getValue()) {
                max = num.getValue();
                tmp = num.getKey();
            }
        }
        System.out.println(max+" "+tmp);
    }
}
