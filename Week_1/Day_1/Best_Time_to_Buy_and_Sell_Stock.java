class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;               // Maximum profit
        int minp=prices[0];       // Minimum price
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