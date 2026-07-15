package sdesheet;

import java.util.*;

class Best_Time_to_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,prices[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] prices=new int[n];

        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }

        Best_Time_to_Buy_and_Sell_Stock obj=new Best_Time_to_Buy_and_Sell_Stock();
        System.out.println(obj.maxProfit(prices));
    }
}
