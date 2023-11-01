package lec4;

import java.util.Scanner;

public class bin_to_deci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*2;
			
		}
		System.out.print(sum);

	}

}
