class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int m=n*(n+1)/2;
        for(int i=0;i<n;i++){
            m=m-nums[i];
        }
         return m;
    }
   
}