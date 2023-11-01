package assignment3;

import java.util.Scanner;

public class maximum_val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] shag=new int[n];
		for (int i = 0; i < shag.length; i++) {
			shag[i]=sc.nextInt();
		}
		System.out.print(max_val(shag));

	}
	public static int max_val(int[] shag) {
		int prachi=shag[0];
		for (int i = 1; i < shag.length; i++) {
			if(shag[i]>prachi) {
			prachi=shag[i];
			}
			
			
		}
		return prachi;

	}

}
