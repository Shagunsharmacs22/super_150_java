package assigment_1;
import java.util.*;

public class pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
				while(row<=n) {
					int i=1;
					while(i<=n) {
						if(i<=row) {
						System.out.print(i+" ");
						}
						else {
							System.out.print("  ");
						}
						i++;
					}
					int j=n/2+1;
					while(row<j) {
						System.out.print("  ");
						j--;
					}
					int k=1;
					while(k<=row) {
				if( row==n && k==1 ) {
						System.out.print("");}
				else {
					System.out.print(row+1-k+" ");
				}
					
						k++;
					}
					row++;
					System.out.println();
					
				}

	}

}
