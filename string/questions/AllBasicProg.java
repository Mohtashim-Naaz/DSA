package string.questions;

public class AllBasicProg {

    public void removeWhiteSpaces(){
        String s = "  n a a z";
        s = s.replaceAll("\\s","");
        System.out.println(s);
    }

    public void removeLeadingTrailingSpaces() {
        String s = "    Naaz Don  ";
        System.out.println(s.trim());
    }

    public void findFrequentlyOccurence(String ss,String c){
        String s = ss;
        String alphabet = c;
        s = s.replaceAll("\\s","");
        int newLength = s.replaceAll(alphabet,"").length();
        int total = s.length() - newLength;

        System.out.println("Frequency: "+ total);
    }



    public static void main(String[] args) {
        AllBasicProg obj = new AllBasicProg();
        obj.removeWhiteSpaces();
        obj.removeLeadingTrailingSpaces();
        obj.findFrequentlyOccurence("I am naaz","a");
    }
}
