import java.util.Scanner;

public class Main {
    private static int[] stack;
    private static int top = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        stack = new int[N];

        for(int i = 0; i < N; i++) {
            switch (sc.next()) {
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "top":
                    top();
                    break;
            }
        }
    }

    public static void push(int x){
        stack[top++] = x;
    }

    public static void pop(){
        if(empty() == 1){
            System.out.println(-1);
        }
        else{
            int old = stack[top-1];
            stack[top--] = 0;
            System.out.println(old);
        }
    }

    public static int size(){
        return top;
    }

    public static int empty(){
        if(top == 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void top(){
        if(empty() == 0){
            System.out.println(stack[top - 1]);
        }
        else{
            System.out.println(-1);
        }
    }

}