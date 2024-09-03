package string.questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q8_ReadFile {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\thor.txt");
        BufferedReader br = new BufferedReader(fr);

        String str;

        while((str=br.readLine()) != null){
            System.out.println(str);
        }
        br.close();



    }
}
