package assignment3;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] shag=new int[n];
		for (int i = 0; i < shag.length; i++) {
			shag[i]=sc.nextInt();
		}
		int [] shagun=new int[n];
		shagun=bubble_sort(shag);
		for (int i = 0; i < shagun.length; i++) {
			System.out.println(shagun[i]);
		}

	}
	public static int[] bubble_sort(int[] shag) {
		int temp=0;
		for (int i = 0; i < shag.length; i++) {
		    for (int j = 1; j < shag.length-i; j++) {
		    	if(shag[j-1]>shag[j]) {
		    		temp=shag[j-1];
		    		shag[j-1]=shag[j];
		    		shag[j]=temp;
			    	
			    }
			}
			
		}
		return shag;
	}

}
