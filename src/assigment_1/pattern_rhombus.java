package assigment_1;
import java.util.*;

public class pattern_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(row-1+j+" ");
				j++;
			} 
			int k=1;
			int val=2*row-1;
			while(k<star) {
				System.out.print(val-1+" ");
				val--;
				k++;
	
			}
			    space--;
				star++;
				row++;
			System.out.println();
		}
		int row1=1;
		int space1=1;
		int star1=n-1;
		while(row1<n) {
			int i=1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star1) {
				System.out.print( n-row1+j-1+" ");
				j++;
			} 
			int k=1;
			int val=2*(n-row1)-2;
			while(k<star1) {
				System.out.print(val+" ");
				val--;
				k++;
	
			}
			row1++;
			space1++;
			star1--;
			System.out.println();
		}
	}
}
