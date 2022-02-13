public class RotateOneByOne {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
        // rotate array by 2 element
        int d = 15;
        int n = a.length;
        rotateArrayByD(a,d,n);
        for(int i = 0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
	}
	public static void rotateArrayByD(int[] a,int d,int n) {
		d = d%n;
		for(int i = 0;i<d;i++) {
			revArray(a,n);
		}
	}
	public static void  revArray(int [] a,int n) {
		int temp = a[0];
		for(int i = 0;i<n-1;i++) {
			a[i] = a[i+1];
		}
		a[n-1] = temp;
	}
    