import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] quiz = new String[N];

        for (int i = 0; i < N; i++) {
            quiz[i] = sc.nextLine();
        }

        for(int j = 0; j < quiz.length; j++) {
            String question = quiz[j];
            int count = 0;
            int result = 0;

            for (int k = 0; k < question.length(); k++) {
                if (question.charAt(k) == 'O') {
                    count += 1;
                    result += count;
                } else if (question.charAt(k) == 'X') {
                    count = 0;
                }
            }

            System.out.println(result);
        }
    }
}