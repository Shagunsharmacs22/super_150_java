package assigmnet_2;

import java.util.Scanner;

public class odd_even_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		while(t!=0) {
			int n=sc.nextInt();
			int odd=0;
			int even=0;
			while(n!=0) {
				int rem=n%10;
				if(rem%2!=0) {
					odd=odd+rem;
				}
				else {
					even=even+rem;
				}
				n=n/10;
			}
			if( odd%3==0  || even%4==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			t--;
		}
	

	}

}
