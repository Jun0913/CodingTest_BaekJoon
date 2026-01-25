import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] numArr = new int[100];
        numArr[0] = 0;
        numArr[1] = 1;

        for(int i = 2; i <= N; i++) {
            numArr[i] = numArr[i - 1] + numArr[i - 2];
        }

        System.out.println(numArr[N]);
    }
}