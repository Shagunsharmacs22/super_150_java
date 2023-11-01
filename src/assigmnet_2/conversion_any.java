package assigmnet_2;
import java.util.*;

public class conversion_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base =sc.nextInt();
		int basenew=sc.nextInt();
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*base;
			
		}
		 int num=0;
		  int fac=1;
		while(sum>0) {
			int r=sum%basenew;
			num=num+r*fac;
			sum=sum/basenew;
			fac=fac*10;
			
		}
		System.out.print(num);

				

	}

}
