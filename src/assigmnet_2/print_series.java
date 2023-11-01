package assigmnet_2;

import java.util.Scanner;

public class print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int n1=sc.nextInt();
		 int n2= sc.nextInt();
		 int i=1;
		 int a;
		 int c=1;
		 while(c<=n1) {
			 a=3*i+2;
			 if(a%n2!=0) {
				 System.out.println(a);
			 c++;
			 }
			 i++;
		 }

	}

}
