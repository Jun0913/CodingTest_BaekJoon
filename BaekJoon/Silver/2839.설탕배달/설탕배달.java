import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();

        int result = 0;
        if (kg == 4 || kg == 7) {
            System.out.println(-1);
        } else if (kg % 5 == 0) { // 5, 10, 15, 20, 30, 35 ...
            System.out.println(kg / 5);
        } else if (kg % 5 == 1 || kg % 5 == 3) { // 6, 8, 11, 13, 16, 18, 21 ...
            System.out.println((kg / 5) + 1);
        } else if (kg % 5 == 2 || kg % 5 == 4) { // 9, 12, 14, 17, 19, 22 ...
            System.out.println((kg / 5) + 2);
        }
    }
}
