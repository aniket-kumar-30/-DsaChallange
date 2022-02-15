public class TRW{
    // Driver Code

    public static int TrapRainWater(int[] a,int n){
        int leftMax = 0;
        int rightMax = 0;
        int lo = 0; int hi = n-1;
        int res = 0;
        while(lo < hi){
            if(a[lo] < a[hi]){
                if(a[lo] > leftMax)
                    leftMax = a[lo];
                else
                    res += leftMax - a[lo];
                lo++;
            }else{
                if(a[hi] > rightMax)
                    rightMax = a[hi];
                else
                    res += rightMax - a[hi];
                hi--;
            }
        }
        return res;
    }
}