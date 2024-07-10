public class array10 {
    public static int buyandsellstocks(int prices[]){
        int buyprices = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length ;i++){
            if(buyprices < prices[i]){//profit
               int  profit = prices[i] - buyprices; //todays profit
                maxprofit = Math.max(profit, maxprofit);
            }
            else
            {
                buyprices = prices[i] ;
            }
        }
                return maxprofit; 
            
        }
    
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
      System.out.println(buyandsellstocks(prices));
 }
}
