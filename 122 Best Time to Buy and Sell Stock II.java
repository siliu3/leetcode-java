public class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1)
            return 0;
        int profit = 0;
        int[] diff = new int[prices.length-1];
        for(int i=0;i<prices.length-1;i++)
            diff[i] = prices[i+1] - prices[i];
        for(int i:diff)
            if(i>0)
                profit+=i;
        return profit;
    }
}
