class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2];
        int k=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                arr[k]=nums[i];
                k++;
            }
        }
        return arr;
    }
}