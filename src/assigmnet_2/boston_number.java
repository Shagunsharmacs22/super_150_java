package assigmnet_2;

import java.util.Scanner;

public class boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int i=2;
		 int sum=0;
		int fact=1;
		while(i<10) {
			if(n%i==0) {
				sum=sum+i;
				n=n/i;
			}
			else {
				i++;
			}
		}
		
		int k=10;
		while(k>=10 && k<=n) {
			if(n%k==0) {
				int add=0;
				int j=k;
				while(j!=0) {
					int r=j%10;
					add=add+r;
					j=j/10;
					
				}
				sum=sum+add;
				n=n/k;
			}
			else {
				k++;
			}
			
		}
		int val=0;
		while(temp!=0) {
			int rem=temp%10;
			val=val+rem;
			temp=temp/10;
			
		}
		if(sum==val) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}
		

	}

}
