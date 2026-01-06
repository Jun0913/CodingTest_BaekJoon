import java.util.Scanner;

public class Main {

    private static boolean isPrime(int x) {
        if (x < 2) return false;          // 0, 1 제외
        if (x == 2) return true;          // 2는 소수
        if (x % 2 == 0) return false;     // 짝수 제거

        for (int j = 3; j * j <= x; j += 2) { // 홀수만 검사
            if (x % j == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (isPrime(x)) count++;
        }

        System.out.println(count);
    }
}