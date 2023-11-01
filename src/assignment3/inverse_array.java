package assignment3;

import java.util.Scanner;

public class inverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
	
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int [] shagun=new int[n];
		shagun=inverse_array(arr);
		for (int j = 0; j < shagun.length; j++) {
			System.out.print(shagun[j]);
		}

		}
	public static int[] inverse_array(int[] arr) {
		int [] shag=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			shag[arr[i]]=i;
		}
		return shag;
	}
	
    

}
