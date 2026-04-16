class Solution {
    public int solution(int[][] signals) {
        int limit = 1;

        for (int[] s : signals) {
            limit *= (s[0] + s[1] + s[2]);
        }

        for (int t = 1; t <= limit; t++) {
            boolean allYellow = true;

            for (int[] s : signals) {
                int g = s[0];
                int y = s[1];
                int r = s[2];

                int cycle = g + y + r;
                int pos = (t - 1) % cycle + 1;

                if (!(g < pos && pos <= g + y)) {
                    allYellow = false;
                    break;
                }
            }

            if (allYellow) {
                return t;
            }
        }

        return -1;
    }
}