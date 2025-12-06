class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        while (k-- > 0) {
            int minVal = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < n; i++) {
                if (nums[i] < minVal) {
                    minVal = nums[i];
                    minIndex = i;
                }
            }
            nums[minIndex] = nums[minIndex] * multiplier;
        }
        return nums;
    }
}
