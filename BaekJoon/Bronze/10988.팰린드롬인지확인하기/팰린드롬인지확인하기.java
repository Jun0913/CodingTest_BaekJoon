import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int repeat_count = word.length() / 2;
        int palindrome = 1;

        for(int i = 0; i < repeat_count; i++) {
            if(word.charAt(i) == word.charAt(word.length() - (i + 1))){
                continue;
            }
            else{
                palindrome = 0;
                break;
            }
        }

        System.out.println(palindrome);
    }
}