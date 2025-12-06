class Solution {
    public int countElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        int count = 0;
        for (int n : nums) {
            if (n > min && n < max) {
                count++;
            }
        }

        return count;
    }
}
