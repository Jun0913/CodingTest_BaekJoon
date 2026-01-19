import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int left = x;
        int right = w - x;
        int top = h - y;
        int bottom = y;

        int min = left;

        if(min > right){
            min = right;
        }
        if(min > top){
            min = top;
        }
        if(min > bottom){
            min = bottom;
        }

        System.out.println(min);
    }
}
