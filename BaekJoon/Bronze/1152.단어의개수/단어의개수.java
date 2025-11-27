import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String[] words = str.split(" ");
        int count = 0;

        for(String s: words){
            if(s.equals("")){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}