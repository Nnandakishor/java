import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] nums=Arrays.copyOf(heights,n);
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}