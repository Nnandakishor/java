class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int i =0;
        int sum = 0;
        for(i=0;i<n;i++){
            sum+=nums[i];
        }
        int left = 0;
        int count = 0;
        for (i = 0; i < n - 1; i++) {
            left += nums[i];
            int right = sum - left;
            if ((left-right)%2==0) count++;
        }
        return count;
    }
}
