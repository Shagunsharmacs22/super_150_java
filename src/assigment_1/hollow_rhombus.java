package assigment_1;
import java.util.*;

public class hollow_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		 int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j=1;
			while(j<=n) {
				if( row==1|| row==n || j==1 ||j==n) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				j++;
			}
			space--;
			row++;
			System.out.println();
		}

	}

}
