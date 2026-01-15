import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        char[] charArr = str.toCharArray();
        int count = 0;

        for (int i = 0; i < len; i++) {

            if (i < len - 2 && charArr[i] == 'd' && charArr[i + 1] == 'z' && charArr[i + 2] == '=') {
                count++;
                i += 2;
            }
            else if (i < len - 1) {
                char current = charArr[i];
                char next = charArr[i + 1];

                if (current == 'c' && (next == '=' || next == '-')) {
                    count++;
                    i++;
                } else if (current == 'd' && next == '-') {
                    count++;
                    i++;
                } else if ((current == 's' || current == 'z') && next == '=') {
                    count++;
                    i++;
                }
                else if ((current == 'l' || current == 'n') && next == 'j') {
                    count++;
                    i++;
                }
                else {
                    count++;
                }
            }
            else {
                count++;
            }
        }

        System.out.print(count);
    }
}