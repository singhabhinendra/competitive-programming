public class BestTimeToBuyOrSellStock2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyOrSellStock2 obj=new BestTimeToBuyOrSellStock2();
        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
