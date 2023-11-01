package assigment_1;
import java.util.*;

public class inverted_hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int row1=1;
		int row=1;
		int val= 2*n-1;
		while(row<=2*n+1) {
			int i=1;
			while(i<=row1) {
				System.out.print(n-i+1+" ");
				i++;
			}
			int j=1;	
			while(j<=val) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=row1) {
				if (row!=n+1) {
				System.out.print(n-row1+k+" ");
				}
				else if(k<n+1) {
					System.out.print(k+" ");
				}
				k++;
			}
			if(row<n+1) {
	        val-=2;
	        row1++;}
			else {
				val+=2;
				row1--;
			}
			row++;
			System.out.println();
		}
		

	}

}
