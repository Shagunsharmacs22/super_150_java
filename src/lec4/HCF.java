package lec4;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		while(n2%n1!=0) {
			int rem=n2%n1;
			n2=n1;
			n1=rem;
			
		}
		
System.out.print( " hcf is "+n1);
	}

}
