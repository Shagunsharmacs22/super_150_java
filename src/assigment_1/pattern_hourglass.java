package assigment_1;
import java.util.*;

public class pattern_hourglass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int z=1;
		int row=1;
		int val=2*n+1;
		int space=1;
		while(row<=2*n+1) {
			int j=1;
			while(j<space) {
				System.out.print("  ");
				j++;
			}
			int i=1;
			int d=1;
			int rev=row-n-i;
			int num=n-row+2-i;
			while(i<=val) {
				if(row<=n+1) {
					if(i<=n-row+2) {
				System.out.print(n-row+2-i+" ");
				num--;
					}
					else if(i<=2*n-2*row+3) {
						System.out.print(d+" ");
						d++;
					}
					}
				else {
					if(i<=row-n) {
					System.out.print(row-n-i+" ");
					rev--;
					}
					else if(i<=z) {
						System.out.print(d+" ");
						d++;
					}
					}
				i++;
				
			
			}
			if(row<n+1) {
				space++;
				val--;
			}
			else {
				z+=2;
				space--;
				val++;
			}
		
			row++;
			System.out.println();
		}
	}
}
