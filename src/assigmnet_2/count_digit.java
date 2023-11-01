package assigmnet_2;

import java.util.Scanner;

public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
		int c=0;
		while(n!=0) {
			int rem=n%10;
			if(rem==num) {
				c++;
			}
			n=n/10;
		}
 System.out.println(c);
	}

}
