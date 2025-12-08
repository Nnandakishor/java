class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        int n=prices.length;
        int i=0;
        int j=0;
        for(i=0;i<n;i++){
            ans[i]=prices[i];
            for(j=i+1;j<n;j++){
                if(prices[i]>=prices[j]){
                    ans[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return ans;
    }
}