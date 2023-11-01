package lec7;
import java.util.*;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int [] arr= new int[n];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=sc.nextInt();
	        }
			long sum[] = new long[arr.length];
			 sum = Product(arr);
			for (int i = 0; i < sum.length; i++) {
				System.out.print(sum[i]+" ");
			}
		}
		public static long[] Product(int [] arr) {
			int n=arr.length;
			long[] left=new long[n];
			left[0]=1;
			for (int i = 1; i < left.length; i++) {
				left[i] =left[i-1]*arr[i-1];
			}
			long[] right=new long[n];
			right[n-1]=1;
			for (int i = n-2; i >=0; i--) {
				right[i] =right[i+1]*arr[i+1];
			}
			long [] sum= new long[n];
			for (int i = 0; i < n; i++) {
				sum[i]=left[i]*right[i];
				
			}
			return sum;
		
	}

}
