public class BestTimeBuySellStock121 {
    public static void main(String[] args) {
        int[]arr = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i ++){
            if (prices[i] < buy) buy = prices[i];
            else if(prices[i] - buy > maxProfit) maxProfit = prices[i] - buy;
        }
        return maxProfit;
    }
}
