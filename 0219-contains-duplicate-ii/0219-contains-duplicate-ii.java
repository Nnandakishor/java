import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the number already exists in the window → duplicate found
            if (set.contains(nums[i])) {
                return true;
            }

            // Add the current number to the window
            set.add(nums[i]);

            // Maintain window size = k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}
