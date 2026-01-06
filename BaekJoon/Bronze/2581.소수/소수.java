import java.util.Scanner;

public class Main {

    private static boolean isPrime(int x) {
        if (x < 2) return false;          // 0, 1 제외
        if (x == 2) return true;          // 2는 소수
        if (x % 2 == 0) return false;     // 짝수 빠른 제거

        for (int j = 3; j * j <= x; j += 2) { // 홀수만 검사
            if (x % j == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        sc.nextLine();
        int N = sc.nextInt();

        int sum = 0;
        int min = 0;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                if (sum == 0) {
                    min = i;
                }
                sum += i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}