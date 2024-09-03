package string.questions;

import java.util.ArrayList;

public class Q15_VowelsConsonant {
    public static void main(String[] args) {
        String s = "main hu gian";
        s=s.replaceAll("\\s","");
        String v = s.replaceAll("[^aeiou]","");
        String c = s.replaceAll("[aeiou]","");

        ArrayList<Character> av = new ArrayList<>();
        ArrayList<Character> ac = new ArrayList<>();

        for(int i=0;i< v.length(); i++){
            av.add(v.charAt(i));
        }
        for(int j=0; j<c.length(); j++){
            ac.add(c.charAt(j));
        }

        System.out.println(av+" \n"+ac);
    }
}
