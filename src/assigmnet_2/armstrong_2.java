package assigmnet_2;
import java.util.*;

public class armstrong_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			int n2=sc.nextInt();
	        while(n1<=n2) {
	        	int num=n1;
	        	int temp=n1;
	        	int org=n1;
                double c=0;
	        	while(num!=0) {
	               num/=10;
	               c++;
	        	}
	        	double arm = 0;
	        	while(temp!=0) {
	        			int rem=temp%10;
	        		    arm= arm+Math.pow(rem,c);
	        			temp=temp/10;
	        	}
	        	if(arm==org) {
	        		System.out.println(n1);
	        	}
	        	n1++;
	        }
			 
	}

}
