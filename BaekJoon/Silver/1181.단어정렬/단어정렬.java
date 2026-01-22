import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);

        list.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return -1;
            }
        });

        for(Iterator<String> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}
