class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("++")){
                sum++;
            }
            else{
                sum--;
            }
        }
        return sum;
    }
}