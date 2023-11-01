package assigmnet_2;

import java.util.Scanner;

public class fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
	    int c=a+b;
		int i=2;
		while(i<=n) {
			 c=a+b;
			a=b;
			b=c;
			i++;
			
		}
System.out.println(c);
	}

}
