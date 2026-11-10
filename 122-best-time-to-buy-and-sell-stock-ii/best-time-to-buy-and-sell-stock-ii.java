class Solution {
    public int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        
        int Profit = 0;
        for (int i = 1; i < arr.length; i++) {
           if(arr[i]>arr[i-1])
           {
            Profit+=arr[i]-arr[i-1];
           }

        }
        return Profit;
    }
}