class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int m=(k*(k-1))/2;
        int sum=k*nums[n-1] + m ;
        return sum;
    }
}