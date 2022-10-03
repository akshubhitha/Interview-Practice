class Solution {
    public int maxProfit(int[] prices) {
        int min = 10000;
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
            }
            else if(prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
            
        }
        
    
        
        
        return maxProfit;
    
    }
}