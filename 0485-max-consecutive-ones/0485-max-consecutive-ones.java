class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;          // extend current streak
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;        // reset streak when 0 appears
            }
        }

        return maxCount;
    }
}
