import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    int x = sc.nextInt();
                    stack.push(x);
                    break;
                case 2:
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 5:
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
