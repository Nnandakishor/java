class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);     
        int n = nums.length;
        int[] arr = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i += 2) {
            int alice = nums[i];    
            int bob = nums[i + 1];   
            arr[idx++] = bob;  
            arr[idx++] = alice; 
        }

        return arr;
    }
}
