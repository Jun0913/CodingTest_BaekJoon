import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();
        int multiple = A * B * C;

        String str = Integer.toString(multiple);
        int[] intArr = new int[10];

        for(int i  = 0; i < str.length(); i++){
            int index = str.charAt(i) - '0';
            intArr[index] += 1;
        }

        for(int j  = 0; j < 10; j++){
            System.out.println(intArr[j]);
        }

    }
}
