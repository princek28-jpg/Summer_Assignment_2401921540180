class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minp=prices[0];
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<minp){
                minp=prices[i];
            }
            maxp=Math.max(maxp,prices[i]-minp);
        }
        return maxp;
    }
}