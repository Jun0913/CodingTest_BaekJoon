import java.io.*;
import java.util.*;

public class Main {

    private static int n;                    // 컴퓨터 수
    private static int m;                    // 연결 수
    private static List<Integer>[] graph;    // 인접 리스트
    private static boolean[] visited;
    private static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        // 1번 컴퓨터 제외
        System.out.println(count - 1);
    }

    private static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}