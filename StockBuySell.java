public class StockBuySell{
    // Driver Code

    public static ArrayList<ArrayList<Integer>> sol(int[] a, int n){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int buy = 0;
        int sell = 0;
        int i = 0;
        while(i < n-1){
            while((i < n-1) && (a[i] >= a[i+1]))
                i++;
            if(i == n-1) break;
            buy = i++;
            while((i < n) && (a[i] >= a[i-1]))
                i++;
            sell = i-1;
            ArrayList<Integer> list = new ArrayList<>();
            list.add(buy);
            list.add(sell);
            lists.add(list);
        }
        return lists;
    }
}