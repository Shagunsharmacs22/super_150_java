package assignment3;

import java.util.Scanner;

public class product_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] shag=new int[n];
		for (int i = 0; i < shag.length; i++) {
			shag[i]=sc.nextInt();
		}
		long[] shagun=new long[n];
		shagun=Product_except_self(shag);
		for (int i = 0; i < shagun.length; i++) {
			System.out.print(shagun[i]+" ");
		}
	}
	public static long[] Product_except_self(int[] shag) {
		long[] shagun=new long[shag.length];
		for (int i = 0; i < shag.length; i++) {
			long product=1;
			for (int j = 0; j < shagun.length; j++) {
				if(j!=i) {
					product=product*shag[j];
				}
			}
			shagun[i]=product;
		}
		return shagun;
	}

}
