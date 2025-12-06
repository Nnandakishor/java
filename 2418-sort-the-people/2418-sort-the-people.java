import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = names[i];
            arr[i][1] = String.valueOf(heights[i]);
        }
        Arrays.sort(arr, (a, b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1]));
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i][0];
        }
        return result;
    }
}
