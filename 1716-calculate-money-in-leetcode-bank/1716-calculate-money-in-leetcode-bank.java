class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int monday = 1; 
        int current = 1;  
        for (int day = 1; day <= n; day++) {
            total += current;
            if (day % 7 == 0) {   
                monday++;
                current = monday;
            } else {
                current++;
            }
        }
        return total;
    }
}
