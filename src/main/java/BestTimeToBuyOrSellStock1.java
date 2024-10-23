public class BestTimeToBuyOrSellStock1 {
        public int maxProfit(int[] prices) {
            int minPrice=Integer.MAX_VALUE;
            int maxProfit=0;
            for(int i=0;i<prices.length;i++){
                if(prices[i]< minPrice){
                    minPrice=prices[i];
                }
                maxProfit=Math.max(prices[i]- minPrice,maxProfit);
            }
            return maxProfit;
        }

    public static void main(String[] args) {
        BestTimeToBuyOrSellStock1 obj =new BestTimeToBuyOrSellStock1();
        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4}));
    }

}
