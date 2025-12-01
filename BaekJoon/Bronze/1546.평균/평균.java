import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double sum = 0;
        int m = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            sum += num;

            if(m < num){
                m = num;
            }
        }

        double avg = sum / m * 100 / n;
        System.out.println(avg);
    }
}