package assigmnet_2;

import java.util.Scanner;

public class chewbacca_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		long sum=0;
		int min=9;
		int rem;
		while(n!=0) {
			rem=n%10;
			sum=sum*10+rem;
			if(rem<min) {
				min=rem;
			}
			
			n=n/10;
		}
		long val=0;
		while(temp!=0) {
			int r=temp%10;
			if(r!=min) {
				int m=r;
				r=9-r;
				if(r>=m) {
					r=m;
				}
				
			}
			
			val=val*10+r;
			temp=temp/10;
		}
		
		System.out.println(val);

	}

}
