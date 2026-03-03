import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        // APT 층, 호수 초기화
        for(int num = 0; num < T; num++) {
            int[][] APT = new int[15][15];
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            for(int i = 0; i < 15; i++) {
                APT[i][1] = 1;	// i층 1호
                APT[0][i] = i;	// 0층 i호
            }

            for(int floor = 1; floor <= k; floor ++) {	        // 1층부터 k 층까지
                for(int aptNum = 2; aptNum <= n; aptNum++) {    // 2호부터 n 호까지
                    APT[floor][aptNum] = APT[floor-1][aptNum] + APT[floor][aptNum-1];
                }
            }

            System.out.println(APT[k][n]);
        }
    }
}