package assignment3;

import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] shag=new int[n];
		for (int i = 0; i < shag.length; i++) {
			shag[i]=sc.nextInt();
		}
		int [] shagun=new int[n];
		shagun=reverse_array(shag);
		for (int i = 0; i < shagun.length; i++) {
			System.out.print(shagun[i]+" ");
		}

	}
	public static int[] reverse_array(int[] shag) {
		int n=shag.length;
		int [] shagun=new int[n];
		for (int i = 0; i < n; i++) {
			shagun[n-1-i]=shag[i];
				
			}
			
	
		return shagun;

	}

}
