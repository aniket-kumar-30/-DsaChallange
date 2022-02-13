public class UsingJugglingAlgo {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
        // rotate array by 2 element
        int d = 3;
        int n = a.length;
        rotateArrayByD(a,d,n);
        for(int i = 0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
	 }
	public static int gcd(int a,int b) {
		if(b==0){
			return a;
		}
		return gcd(b,a%b);
	}
	public static void rotateArrayByD(int[] a,int d,int n) {
		d = d%n;
		int GCD = gcd(d,n);
		for(int i = 0;i<GCD;i++) {
			int j = i;
			int temp = a[i];
			while(true) {
				int k = d+j;
				if(k>=n) {
					k = k-n;
				}
				if(k == i)
					break;
				
				a[j] = a[k];
				j = k;
			}
			a[j] = temp;
		}
	}
}