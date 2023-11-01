package assigmnet_2;

import java.util.Scanner;

public class sum_oddeven_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even=0;
		int odd=0;
		int i=1;
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			if(i%2!=0) {
				odd=odd+rem;
				i++;
				
			}
			else {
			
				even=even+rem;
				i++;
			}
		}
		System.out.println(odd);
		System.out.println(even);
		
		
	}

}
