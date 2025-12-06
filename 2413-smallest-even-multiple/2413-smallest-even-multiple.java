class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=1;i<n;i++){
            if((i*n)%2==0){
                return i*n;
            }
        }
        return 2;
    }
}