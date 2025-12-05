class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        return (nums[i]-1)*(nums[i-1]-1);
    }
}