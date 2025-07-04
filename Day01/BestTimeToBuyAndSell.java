public class BestTimeToBuyAndSell {

    public static int maxProfit(int[] price){
        int mini = price[0];
        int profit =0;
        for(int i =1;i<price.length;i++){
            int cost = price[i]-mini;
            profit = Math.max(cost ,profit);
            mini = Math.min(mini,price[i]);
        }
        return profit;

    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println("Profir is : " +maxProfit(arr));
    }
}
