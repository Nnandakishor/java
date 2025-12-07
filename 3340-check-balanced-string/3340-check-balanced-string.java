class Solution {
    public boolean isBalanced(String nums) {
        int sum = 0;
        int add = 0; 
        int n = nums.length();
        for (int i = 0; i < n; i += 2) {
            sum += nums.charAt(i) - '0';
        }
        for (int j = 1; j < n; j += 2) {
            add += nums.charAt(j) - '0';
        }
        return sum == add;
    }
}
