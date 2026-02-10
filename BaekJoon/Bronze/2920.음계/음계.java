import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 8; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> ascending = new ArrayList<>(list.subList(0, 8));
        ascending.sort(Comparator.naturalOrder());

        List<Integer> descending = new ArrayList<>(list.subList(0, 8));
        descending.sort(Comparator.reverseOrder());

        if(list.equals(ascending)) {
            System.out.println("ascending");
        }
        else if(list.equals(descending)) {
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }
}