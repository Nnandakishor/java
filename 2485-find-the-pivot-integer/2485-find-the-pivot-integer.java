class Solution {
    public int pivotInteger(int n) {
        int total = 0;
        for( int i=1;i<n+1;i++){
            total+=i;
        }
        int left = 0;
        for (int i = 1; i < n+1; i++) {
            left+=i;
            int right = total + i - left;

            if (left == right) return i;
        }

        return -1;
    }
}