class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int add=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>9){
                sum+=nums[i];
            }
            else{
                add+=nums[i];
            }
        }
        if(sum!=add){
            return true;
        }
        else{
            return false;
        }
    }
}