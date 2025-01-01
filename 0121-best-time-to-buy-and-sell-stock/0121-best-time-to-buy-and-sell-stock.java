class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy=prices[0];
        int diff=0;
        int max=0;
        for(int i =1;i<n;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            else
            {
                diff=Math.abs(buy-prices[i]);
                max=Math.max(max,diff);
            }
        }
        return max;
    }
}