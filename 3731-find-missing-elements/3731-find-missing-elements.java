// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         int count=0;
//         for(int i=nums[0];i<nums[n];i++){
//             if(nums[i]==i){
//                 i++;
//             }
//             else{
//                 count++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();

        int start = nums[0];
        int end = nums[nums.length - 1];

        int index = 0;

        for (int value = start; value <= end; value++) {
            if (index < nums.length && nums[index] == value) {
                index++;
            } else {
                result.add(value);
            }
        }

        return result;
    }
}
