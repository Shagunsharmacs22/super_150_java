package assignment3;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] shag=new int[n];
		for (int i = 0; i < shag.length; i++) {
			shag[i]=sc.nextInt();
		}
		int find=sc.nextInt();
		System.out.print(linear_search(shag ,find));

	}
	public static int linear_search(int[] shag, int find) {
		
		for (int i = 0; i < shag.length; i++) {
			if(shag[i]==find) {
			return i;
				
			}
			
			
		}
		return -1;
		
	}

}
