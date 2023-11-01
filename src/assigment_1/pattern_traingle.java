package assigment_1;
import java.util.*;

public class pattern_traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int space=n-1;
		 int row=1;
		 int val=1;
		 int num=1;
		 while(row<=n) {
			 int i=1;
			 while(i<=space) {
				 System.out.print("  ");
				 i++;
			 }
			 int j=1;
			 while(j<=num) {
				 if(j<=num/2 +1) {
				 System.out.print(val+" ");
				 val++;
				 }
				 else {
					 System.out.print(val-2+" ");
					 val--;
				 }
				 j++;
			
			 }
			 num+=2;
			 space--;
			 row++;
			 System.out.println();
		 }
		 
		
	}

}
