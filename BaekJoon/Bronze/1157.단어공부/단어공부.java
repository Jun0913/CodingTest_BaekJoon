import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char answer = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            count[num] += 1;
        }

        int max = 0;

        for (int j = 0; j < count.length; j++) {
            if (max < count[j]) {
                max = count[j];
                answer = (char) (j + 'A');
            } else if (max == count[j]) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}