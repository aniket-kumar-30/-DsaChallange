public class UsingTempArray{
    public static void main(String[] arg){
        // Driver Code
    }
    public static void rotateArrayByD(int[] a,int d,int n){
        // Create a temp array
        int[] temp = new int[d];
        d = d%n;
        for(int i = 0;i<d;i++){
            temp[i] = a[i];
        }
        for(int i = d;i<n;i++){
            a[i-d] = a[i];
        }
        int j = 0;
        for(int i = n-d;i<n;i++) {
        	a[i] = temp[j];
        	j++;
        }
        for(int i = 0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
    }

}