class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int sum=0;
        for(i=0;i<n;i++){
            sum+=nums[i];
        }
        return sum%k;
    }
}