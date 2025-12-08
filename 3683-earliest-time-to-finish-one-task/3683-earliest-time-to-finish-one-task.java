class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        int n = tasks.length;
        for (int i = 0; i < n; i++) {
            int start = tasks[i][0];
            int time = tasks[i][1];
            int finish = start + time;
            if (finish < min) {
                min  = finish;
            }
        }
        return min;
    }
}
