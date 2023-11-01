package assigmnet_2;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 double sum=0;
		int i=1;
		while(n!=0) {
			int rem=n%10;
			sum=sum+i*Math.pow(10, rem-1);
			n=n/10;
			i++;
			
		}
		System.out.println((int)sum);

	}

}
