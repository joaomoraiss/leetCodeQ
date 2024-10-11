public class BestTimeBuySellStock121 {
    public static void main(String[] args) {
        int[]arr = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int buy = prices.length -1;
        int sell = 0;
        for (int i = 0; i < prices.length -1; i++){
            if (prices[i] < prices[buy]) buy = i;
            if (prices[i] > sell && i > buy) sell = i;
            else prices[0] = prices[buy];
        }
        return prices[sell] - prices[buy];
    }
}
